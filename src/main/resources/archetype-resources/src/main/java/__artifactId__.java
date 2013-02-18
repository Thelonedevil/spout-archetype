package ${package};

import ${package}.commands.PlayerCommands;
import ${package}.configuration.${artifactId}Configuration;
import org.spout.api.Spout;
import org.spout.api.command.CommandRegistrationsFactory;
import org.spout.api.command.RootCommand;
import org.spout.api.command.annotated.AnnotatedCommandRegistrationFactory;
import org.spout.api.command.annotated.SimpleAnnotatedCommandExecutorFactory;
import org.spout.api.command.annotated.SimpleInjector;
import org.spout.api.plugin.CommonPlugin;

/**
 * If you have found this useful, please let me know.
 * @author Craig <tenowg at thedemgel.com>
 */
public class ${artifactId} extends CommonPlugin {
	private static ${artifactId} instance;
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
		CommandRegistrationsFactory<Class<?>> commandRegFactory = new AnnotatedCommandRegistrationFactory(new SimpleInjector(this), new SimpleAnnotatedCommandExecutorFactory());
		RootCommand root = getEngine().getRootCommand();
		root.addSubCommands(this, PlayerCommands.class, commandRegFactory);

		getEngine().getEventManager().registerEvents(new EListener(this), this);
		Spout.getLogger().info("enabled.");
	}

	@Override
	public void onDisable() {
		Spout.getLogger().info("disabled.");
	}
	
	private static void setInstance(${artifactId} plugin) {
		instance = plugin;
	}

	public static ${artifactId} getInstance() {
		return instance;
	}

	public ${artifactId}Configuration getConfig() {
		return config;
	}
}
