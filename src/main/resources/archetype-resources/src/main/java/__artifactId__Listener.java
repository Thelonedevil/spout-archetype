package ${package}.${artifactId};

import org.spout.api.event.EventHandler;
import org.spout.api.event.player.PlayerChatEvent;
import org.spout.api.event.Listener;

/**
 * A Basic Event Listener for Spout
 */
public class ${artifactId}Listener implements Listener {
	private ${artifactId}Plugin plugin;

	public EListener(${artifactId}Plugin instance) {
		this.plugin = instance;
	}
	
	@EventHandler
	public void onPlayerChat(PlayerChatEvent event) {
		// Do Something on PlayerChatEvent
	}
}
