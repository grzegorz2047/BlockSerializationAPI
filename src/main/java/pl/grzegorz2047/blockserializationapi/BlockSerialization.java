/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.grzegorz2047.blockserializationapi;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Grzegorz
 */
public class BlockSerialization extends JavaPlugin{

    @Override
    public void onEnable() {
        System.out.println(this.getName()+" zostal wlaczony!");
        BSAPI bsapi = new IMPLBSAPI();
        
    }

    @Override
    public void onDisable() {
        System.out.println(this.getName()+" zostal wylaczony!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return super.onCommand(sender, command, label, args); //To change body of generated methods, choose Tools | Templates.
    }
 /*
    https://forums.bukkit.org/threads/restoring-blocks-not-working-correctly.118803/
    https://forums.bukkit.org/threads/block-data-storing-help.119400/
    https://forums.bukkit.org/threads/serialization-of-a-block.140402/
    https://forums.bukkit.org/threads/block-data.133124/
 */
    
    
    
}
