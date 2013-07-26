
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

import org.spout.api.command.annotated.CommandDescription;
import org.spout.api.command.annotated.Permissible;
import org.spout.api.command.CommandArguments;
import org.spout.api.command.CommandSource;
import org.spout.api.exception.CommandException;

import ${package}.${pluginName}Plugin;

/**
 * Provides an example of a base command.
 */
public class ${pluginName}BaseCommand {
	private final ${pluginName}Plugin plugin;

	public ${pluginName}BaseCommand(${pluginName}Plugin instance) {
		this.plugin = instance;
	}

	/**
	 * Provides an example command that can be issued to the Spout server.
	 */
	@CommandDescription(aliases = {"command", "cmd"}, desc = "This is an example of what a command might look like. Try it out with /cmd !")
	@Permissible("${artifactId}.some.permission")
	public void exampleBaseCommand(CommandSource source, CommandArguments args) throws CommandException {
		
		// Calling this command will send whoever issued it the message below.
		source.sendMessage("The ${pluginName} plugin base command has been successfully issued. (Type a sub-command)");
	}
}