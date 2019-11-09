package me.teamrocket.uno.runnables;

import me.teamrocket.uno.UnoDuelist;
import me.teamrocket.uno.locale.Locale;
import org.bukkit.Bukkit;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class BossBarTask extends BukkitRunnable
{
    private UnoDuelist plugin;
    private BossBar bar;

    public BossBarTask(UnoDuelist plugin)
    {
        this.plugin = plugin;
        bar = Bukkit.createBossBar("title", BarColor.BLUE, BarStyle.SOLID);
    }

    @Override
    public void run()
    {
        int num = (int) (Math.random() * 9.0) + 1;
        int color = (int) (Math.random() * 4.0);

        switch (color)
        {
            case 0:
                bar.setColor(BarColor.BLUE);
                bar.setTitle(Locale.BOSS_BAR_CARD.msg("&3&lBLUE " + num));
                break;
            case 1:
                bar.setColor(BarColor.RED);
                bar.setTitle(Locale.BOSS_BAR_CARD.msg("&c&lRED " + num));
                break;
            case 2:
                bar.setColor(BarColor.YELLOW);
                bar.setTitle(Locale.BOSS_BAR_CARD.msg("&6&lYELLOW " + num));
                break;
            case 3:
                bar.setColor(BarColor.GREEN);
                bar.setTitle(Locale.BOSS_BAR_CARD.msg("&a&lGREEN " + num));
                break;
        }

        for (Player p : plugin.getServer().getOnlinePlayers())
        {
            if (!bar.getPlayers().contains(p))
            {
                bar.addPlayer(p);
            }
        }
    }
}