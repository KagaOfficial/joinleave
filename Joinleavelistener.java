package me.joinleave.joinleave;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){

        Player player = e.getPlayer();

        if (player.hasPlayedBefore()){
            e.setJoinMessage(ChatColor.GREEN + "Üdv újra a szerveren " + ChatColor.YELLOW + player.getDisplayName());
        }else{
            e.setJoinMessage(ChatColor.BLUE + player.getDisplayName() + ChatColor.GREEN + " üdvözöllek a szerveren!");
        }

    }

    @EventHandler
    public void onLeave(PlayerQuitEvent e){

        Player player = e.getPlayer();

        e.setQuitMessage(ChatColor.YELLOW + player.getDisplayName() + ChatColor.RED + " lelépett a szerverről.");

    }

}
