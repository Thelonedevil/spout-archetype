
package ${package};

import org.spout.api.event.EventHandler;
import org.spout.api.event.player.PlayerChatEvent;
import org.spout.api.event.Listener;

/**
 * A Basic Event Listener for Spout
 */
public class EListener implements Listener {
	private ${artifactId} plugin;

	public EListener(${artifactId} instance) {
		this.plugin = instance;
	}
	
	@EventHandler
	public void onPlayerChat(PlayerChatEvent event) {
		// Do Something on PlayerChatEvent
	}
}
