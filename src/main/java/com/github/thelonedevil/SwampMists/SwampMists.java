package com.github.thelonedevil.SwampMists;

import org.spout.api.chat.ChatArguments;
import org.spout.api.chat.style.ChatStyle;
import org.spout.api.command.CommandRegistrationsFactory;
import org.spout.api.command.RootCommand;
import org.spout.api.command.annotated.AnnotatedCommandRegistrationFactory;
import org.spout.api.command.annotated.SimpleAnnotatedCommandExecutorFactory;
import org.spout.api.command.annotated.SimpleInjector;
import org.spout.api.plugin.CommonPlugin;
import org.spout.api.plugin.PluginLogger;

import com.github.thelonedevil.SwampMists.commands.PlayerCommands;
import com.github.thelonedevil.TLDcommonlib.Lib;


public class SwampMists extends CommonPlugin {
	private static SwampMists instance;
	public static boolean Mist;
	
	@Override
	public void onEnable() {
		//Commands
		CommandRegistrationsFactory<Class<?>> commandRegFactory = new AnnotatedCommandRegistrationFactory(new SimpleInjector(this), new SimpleAnnotatedCommandExecutorFactory());
		RootCommand root = getEngine().getRootCommand();
		root.addSubCommands(this, PlayerCommands.class, commandRegFactory);

		getEngine().getEventManager().registerEvents(new EListener(this), this);
		getLogger().info(Lib.logged+"enabled.");
	}

	@Override
	public void onDisable() {
		getLogger().info(Lib.logged+"disabled.");
	}
	
	public void onLoad() {
		((PluginLogger) getLogger()).setTag(new ChatArguments(ChatStyle.RESET, "[", ChatStyle.DARK_CYAN, "SwampMists", ChatStyle.RESET, "] "));
		getLogger().info(Lib.logged+"Loaded.");
	}
	
	public void onReload() {
		getLogger().info(Lib.logged+"reloaded.");
	}
	
	@SuppressWarnings("unused")
	private static void setInstance(SwampMists plugin) {
		instance = plugin;
	}

	public static SwampMists getInstance() {
		return instance;
	}
}
