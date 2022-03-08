package net.md_5.bungee.command;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class CommandBungee extends Command
{

    public CommandBungee()
    {
        super( "bungee" );
    }

    @Override
    public void execute(CommandSender sender, String[] args)
    {
        sender.sendMessage( "§7[§6ProxyCore§7] §fRunning §aBungeeCord by §9md_5 §fwith edits by §aLeymooo §fand §adanirod12" );
        if ( sender instanceof ProxiedPlayer )
        {
            sender.sendMessage( "§8 - §a" + sender.getName() + " §e(Connected to §a" + ( (ProxiedPlayer) sender ).getServer().getInfo().getName() + "§e)" );
        }
    }
}
