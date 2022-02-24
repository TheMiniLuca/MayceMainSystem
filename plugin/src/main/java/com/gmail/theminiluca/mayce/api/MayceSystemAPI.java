package com.gmail.theminiluca.mayce.api;

import org.bukkit.Bukkit;

import java.util.UUID;

public class MayceSystemAPI {

    public boolean isOnline(String playerName) {
        return Bukkit.getOnlinePlayers().stream().filter(p -> p.getName().equals(playerName)).findAny().orElse(null) != null;
    }
    public boolean isOnline(UUID playerUuid) {
        return Bukkit.getOnlinePlayers().stream().filter(p -> p.getUniqueId().equals(playerUuid)).findAny().orElse(null) != null;
    }
}
