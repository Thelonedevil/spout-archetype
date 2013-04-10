package ${package};

import org.spout.api.command.CommandRegistrationsFactory;
import org.spout.api.command.RootCommand;
import org.spout.api.command.annotated.AnnotatedCommandRegistrationFactory;
import org.spout.api.command.annotated.SimpleAnnotatedCommandExecutorFactory;
import org.spout.api.command.annotated.SimpleInjector;
import org.spout.api.plugin.CommonPlugin;

import ${package}.command.${pluginName}Commands;
import ${package}.configuration.${pluginName}Configuration;

/**
 * If you have found this useful, please let me know.
 * @author Craig <tenowg at thedemgel.com>
 */
public class ${pluginName}Plugin extends CommonPlugin {
	private static ${pluginName}Plugin instance;
	private ${pluginName}Configuration config;

	@Override
	public void onLoad() {
		setInstance(this);
		config = new ${pluginName}Configuration(getDataFolder());
		config.load();
		getLogger().info("loaded.");
	}

	@Override
	public void onEnable() {
		// Register Commands
		CommandRegistrationsFactory<Class<?>> commandRegFactory = new AnnotatedCommandRegistrationFactory(getEngine(), new SimpleInjector(this), new SimpleAnnotatedCommandExecutorFactory());
		RootCommand root = getEngine().getRootCommand();
		root.addSubCommands(this, ${pluginName}Commands.class, commandRegFactory);

		// Register Events
		getEngine().getEventManager().registerEvents(new ${pluginName}Listener(this), this);

		getLogger().info("enabled.");
	}

	@Override
	public void onDisable() {
		getLogger().info("disabled.");
	}

	private static void setInstance(${pluginName}Plugin plugin) {
		instance = plugin;
	}

	public static ${pluginName}Plugin getInstance() {
		return instance;
	}

	public ${pluginName}Configuration getConfig() {
		return config;
	}
}