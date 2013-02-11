package com.github.thelonedevil.SwampMists.commands;

import org.spout.api.command.CommandContext;
import org.spout.api.command.CommandSource;
import org.spout.api.command.annotated.Command;
import org.spout.api.command.annotated.NestedCommand;
import org.spout.api.exception.CommandException;

import com.github.thelonedevil.SwampMists.SwampMists;

public class PlayerCommands {
	@SuppressWarnings("unused")
	private final SwampMists plugin;

	public PlayerCommands(SwampMists instance) {
		this.plugin = instance;
	}

    @Command(aliases = {"SwampMists", "sm"}, desc = "The main Swamp Mist command")
    @NestedCommand(MistToggle.class)
    public void SwampMist(CommandContext args, CommandSource source) throws CommandException {
    }
}
