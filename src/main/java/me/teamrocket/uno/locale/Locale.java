package me.teamrocket.uno.locale;

import org.bukkit.ChatColor;

public enum Locale
{
    JOIN_TITLE("&c&lUNO &f&lDuelist!"),
    JOIN_SUBTITLE("&f&oby teamrocket"),
    BOSS_BAR_CARD("&f&lCard on top: &r{0}");

    private String msg;

    Locale(String msg)
    {
        this.msg = msg;
    }

    public String msg(String... args)
    {
        String manip = msg;
        int index = 0;
        for (String rep : args)
        {
            String replaceMarker = "{" + index + "}";

            int indexOf = manip.indexOf(replaceMarker);
            if (indexOf != -1)
            {
                manip = manip.substring(0, indexOf) + rep + manip.substring(indexOf + replaceMarker.length());
            }

            index++; // increase index for replace marker
        }

        return ChatColor.translateAlternateColorCodes('&', manip);
    }
}