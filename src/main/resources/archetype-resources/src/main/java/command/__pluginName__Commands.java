#**
 This file is part of the Spout Plugin Archetype. If you have found this useful
 or would like to offer suggestions, please contact me.

 @author Craig <tenowg@thedemgel.com>
 @author Atheriel
*###
#if (${includeHeaders} == "true" || ${includeHeaders} == "yes" || ${includeHeaders} == "y")
#parse("HEADER.txt")
#end
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

	/**
	 * Provides an example command that can be issued to the Spout server.
	 */
	@Command(aliases = {"command", "cmd"}, desc = "This is an example of what a command might look like. Try it out with /cmd !", min = 0, max = 0)
	@CommandPermissions("${artifactId}.some.permission")
	public void exampleCommand(CommandContext args, CommandSource source) throws CommandException {
		
		// Calling this command will send whoever issued it the message below.
		source.sendMessage("The ${pluginName} plugin command has been successfully issued.");
	}
}
