package com.hardcorecraft.plugins.lobbymanager;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class LobbyListener implements Listener {

    public LobbyListener(Lobbymanager lobbymanager) {
        // Constructor
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        // Handle
    }

    // @EventHandler
    // public void onPlayerHitEvent(EntityDamageByEntityEvent event) {
    //     Entity attacked = event.getEntity();
    //     Entity attacker = event.getDamager();
    //     if (attacked.getType() != EntityType.PLAYER || attacker.getType() != EntityType.PLAYER) return;
    //     Player attackedPlayer = (Player) event.getEntity();
    //     Player attackerPlayer = (Player) event.getEntity();

    //     for (ItemStack armorItem : attackedPlayer.getInventory().getArmorContents()) {
    //         armorItem.getItemMeta();
    //     }
    // }
}
