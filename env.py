# A generic setup script for a
# modding dev enviroment.

import sys
import os, os.path
import json
import urllib.request
import errno
import time

from shutil import copyfile

version_super = "1.16"
version = "1.16.4"

# data = urllib.request.urlopen(f"https://papermc.io/api/v2/projects/paper/versions/{version_super}/builds")
# resp = json.loads(data.read())
# print(resp)


def mkdir_p(path):
    try:
        os.makedirs(path)
    except OSError as exc: # Python >2.5
        if exc.errno == errno.EEXIST and os.path.isdir(path):
            pass
        else: raise
    #END
#END

mkdir_p(os.path.dirname("/env/server/"))

# Test if initialized
if (os.path.isfile("./env/server/server.jar") == False):
    resp = urllib.request.urlopen("https://papermc.io/api/v1/paper/1.16.4/300/download")
    data = resp.read()
    with open("/env/server/server.jar", "w+") as ftw:
        ftw.write(data)
    #END
#END

if (len(sys.argv) < 2):
    print("Please specify an action <run | build>")
    exit()
#END

def build():
    start = time.time()
    os.system("mvn install")
    end = time.time() - start
    print(f"Build elapsed after {round(end)}s")
#END

def clone():
    copyfile("./target/lobbymanager-1.0-SNAPSHOT.jar", "./env/server/plugins/lobbymanager.jar")
#END

def runServer():
    build()
    clone()
    start = time.time()
    os.chdir("./env/server")
    os.system("java -Xms1G -Xmx1G -jar server.jar nogui")
    os.chdir("../../")
    end = time.time() - start
    print(f"Trial end after {round(end)}s")
#END

runServer()