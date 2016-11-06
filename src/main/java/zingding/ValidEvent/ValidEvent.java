package zingding.ValidEvent;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.EventPriority;
import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;
import cn.nukkit.event.player.PlayerInvalidMoveEvent;

public class ValidEvent extends PluginBase implements Listener {
	@Override
	public void onEnable() {
		this.getLogger().info(getName());
		this.getLogger().notice(TextFormat.RED + "본 플러그인은 ZINGDING-EULA가 적용되어 있습니다.");
		this.getLogger().notice(TextFormat.AQUA + "플러그인이 활성화 되었습니다!");
	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onInvalidMove(PlayerInvalidMoveEvent event) {
		if (event.getPlayer().isOnline()) {
			event.setCancelled();
		}
	}
}
