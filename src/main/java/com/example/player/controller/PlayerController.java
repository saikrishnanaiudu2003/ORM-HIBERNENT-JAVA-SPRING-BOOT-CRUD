package com.example.player.controller;

import com.example.player.model.Player;
import com.example.player.service.PlayerJpaService;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class PlayerController {
    @Autowired
    public PlayerJpaService playerJpaService;

    @GetMapping("/players")
    public ArrayList<Player> getPlayers() {
        return playerJpaService.getPlayers();
    }

    @PostMapping("/players")
    public Player addPlayers(@RequestBody Player player) {
        return playerJpaService.addPlayers(player);
    }

    @GetMapping("/players/{playerId}")
    public Player getPlayerById(@PathVariable("playerId") int playerId) {
        return playerJpaService.getPlayerById(playerId);
    }

    @PutMapping("/players/{playerId}")
    public Player updatePlayerById(@PathVariable("playerId") int playerId, @RequestBody Player player) {
        return playerJpaService.updatePlayerById(playerId, player);
    }

    @DeleteMapping("/players/{playerId}")
    public void deleteById(@PathVariable("playerId") int playerId) {
        playerJpaService.deleteById(playerId);
    }
}