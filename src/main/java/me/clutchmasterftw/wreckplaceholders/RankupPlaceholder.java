package me.clutchmasterftw.wreckplaceholders;

import me.clip.placeholderapi.PlaceholderAPI;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class RankupPlaceholder extends PlaceholderExpansion {
    private final WreckPlaceholders plugin = WreckPlaceholders.getPlugin();


    @Override
    public @NotNull String getIdentifier() {
        return "wreckplaceholders";
    }

    @Override
    public @NotNull String getAuthor() {
        return plugin.getDescription().getAuthors().toString();
    }

    @Override
    public @NotNull String getVersion() {
        return plugin.getDescription().getVersion();
    }


    @Override
    public boolean persist() {
        return true;
    }

    @Override
    public String onPlaceholderRequest(Player player, @NotNull String params) {
        if(player == null) {
            return "";
        }

        final String currentPrestige = PlaceholderAPI.setPlaceholders(player, "%prison_rt_prestiges%");
        final String currentRank = PlaceholderAPI.setPlaceholders(player, "%prison_rt_default%");

        final String nextPrestige = PlaceholderAPI.setPlaceholders(player, "%prison_rr_prestiges%");
        final String nextRank = PlaceholderAPI.setPlaceholders(player, "%prison_rr_default%");

        if(params.equalsIgnoreCase("current_rank")) {
            /*if(currentPrestige.equalsIgnoreCase("")) {
                // Player doesn't have prestige
            } else {
                // Player has a prestige rank
            }*/

        }

        if(params.equalsIgnoreCase("next_rank")) {

        }
    }
}
