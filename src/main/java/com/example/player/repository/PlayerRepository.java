package com.example.player.repository;

import com.example.player.model.Player;
import java.util.*;

public interface PlayerRepository {
    ArrayList<Player> getPlayers();

    Player addPlayers(Player player);

    Player getPlayerById(int playerId);

    Player updatePlayerById(int playerId, Player player);

    void deleteById(int playerId);
}