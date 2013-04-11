package ${package}.command;

import org.spout.api.command.annotated.CommandPermissions;
import org.spout.api.command.CommandContext;
import org.spout.api.command.CommandSource;
import org.spout.api.command.annotated.Command;
import org.spout.api.exception.CommandException;

import ${package}.${pluginName}Plugin;

/**
 * Provides an example of a class to hold commands.
 */
public class ${pluginName}Commands {
	private final ${pluginName}Plugin plugin;

	public ${pluginName}Commands(${pluginName}Plugin instance) {
		this.plugin = instance;
	}

	@Command(aliases = {"command", "cmd"}, usage = "No Usage, replace this command", desc = "This is just an Example. Replace it.", min = 0, max = 0)
	@CommandPermissions("${artifactId}.some.permission")
	public void aCommand(CommandContext args, CommandSource source) throws CommandException {
		// Do Some Command
	}
}
