package ${package}.${artifactId};

import org.spout.api.command.CommandRegistrationsFactory;
import org.spout.api.command.RootCommand;
import org.spout.api.command.annotated.AnnotatedCommandRegistrationFactory;
import org.spout.api.command.annotated.SimpleAnnotatedCommandExecutorFactory;
import org.spout.api.command.annotated.SimpleInjector;
import org.spout.api.plugin.CommonPlugin;

import ${package}.commands.PlayerCommands;
import ${package}.configuration.${artifactId}Configuration;

/**
 * If you have found this useful, please let me know.
 * @author Craig <tenowg at thedemgel.com>
 */
public class ${artifactId}Plugin extends CommonPlugin {
	private static ${artifactId}Plugin instance;
	private ${artifactId}Configuration config;

	@Override
	public void onLoad() {
		setInstance(this);
		config = new ${artifactId}Configuration(getDataFolder());
		config.load();
		getLogger().info("loaded.");
	}

	@Override
	public void onEnable() {
		//Commands
		CommandRegistrationsFactory<Class<?>> commandRegFactory = new AnnotatedCommandRegistrationFactory(getEngine(), new SimpleInjector(this), new SimpleAnnotatedCommandExecutorFactory());
		RootCommand root = getEngine().getRootCommand();
		root.addSubCommands(this, PlayerCommands.class, commandRegFactory);

		getEngine().getEventManager().registerEvents(new EListener(this), this);
		getLogger().info("enabled.");
	}

	@Override
	public void onDisable() {
		getLogger().info("disabled.");
	}

	private static void setInstance(${artifactId}Plugin plugin) {
		instance = plugin;
	}

	public static ${artifactId}Plugin getInstance() {
		return instance;
	}

	public ${artifactId}Configuration getConfig() {
		return config;
	}
}
