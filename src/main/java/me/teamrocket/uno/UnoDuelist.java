package me.teamrocket.uno;

import me.teamrocket.uno.listeners.JoinListener;
import me.teamrocket.uno.runnables.BossBarTask;
import org.bukkit.plugin.java.JavaPlugin;

public class UnoDuelist extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        BossBarTask barTask = new BossBarTask(this);

        getServer().getPluginManager().registerEvents(new JoinListener(), this);
        barTask.runTaskTimer(this, 0L, 20L);
    }

    @Override
    public void onDisable()
    {

    }
}