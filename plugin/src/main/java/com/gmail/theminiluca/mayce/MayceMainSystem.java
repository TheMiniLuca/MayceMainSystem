package com.gmail.theminiluca.mayce;

import com.gmail.theminiluca.mayce.workbench.Workbench;
import org.bukkit.plugin.java.JavaPlugin;

public class MayceMainSystem extends JavaPlugin {

    @Override
    public void onEnable() {
        new Workbench(this);
    }
}
