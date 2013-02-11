package com.github.thelonedevil.SwampMists.commands;
import org.spout.api.Spout;
import org.spout.api.command.CommandContext;
import org.spout.api.command.CommandSource;
import org.spout.api.command.annotated.Command;
import org.spout.api.command.annotated.CommandPermissions;
import org.spout.api.exception.CommandException;

import com.github.thelonedevil.SwampMists.SwampMists;

public class MistToggle {
    public MistToggle(SwampMists plugin) {
    }
    @Command(aliases = {"enable", "on", "activate", "let there be mist"}, desc = "turns mist on in swamps")
    @CommandPermissions("swampmist.enable")
    public void enable(CommandContext args, CommandSource source) throws CommandException {
        SwampMists.Mist = true;
        source.sendMessage("Mists have been enabled in swamps");
        String name = source.getName();
        Spout.getLogger().info("Mists have been enabled in swamps by "+name);
    }
    @Command(aliases = {"disable", "off", "deactivate", "Let it be clear"}, desc = "turns mist off in swamps")
    @CommandPermissions("swampmist.disable")
    public void disable(CommandContext args, CommandSource source) throws CommandException {
    	SwampMists.Mist = false;
        source.sendMessage("Mists have been disabled in swamps");
        String name = source.getName();
        Spout.getLogger().info("Mists have been disabled in swamps by "+name);
    }
}
