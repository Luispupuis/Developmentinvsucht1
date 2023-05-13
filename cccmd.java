package de.invsucht.ccaufgabemain;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class cccmd implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(sender instanceof sender){
            Player p = (Player) Player;

            if(!p.hasPermission("mod.cc")) {
                p.sendMessage("§c§lDazu hast du keine rechte!");

            }
            if(args.length == 0){
                for(Player all: Bukkit.getOnlinePlayers()){
                    if(!all.hasPermission("mod.noclear")){
                        clear(all);
                    }
                }
                Bukkit.broadcastMessage("§6§lInvsucht» §7Der chat wurde von §e " + p.getName() + " §7gecleart!");

                return true;
            }
            if(args.length == 1){

                Player t = Bukkit.getPlayer(args[0]);
                if(t == null) return true;

                clear(t);
                t.sendMessage("§6§lInvsucht» §7Der chat wurde von §e " + p.getUniqueId() + " §7gecleart!");

                return true;
            }

        }




        return false;
    }

    private void clear(Player p){
        for(int i = 0; i < 150; i++){
            p.sendMessage("");
        }
    }
}


