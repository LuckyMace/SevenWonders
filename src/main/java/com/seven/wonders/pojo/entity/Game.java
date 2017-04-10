package com.seven.wonders.pojo.entity;

import com.seven.wonders.pojo.enumer.GameSide;
import com.seven.wonders.pojo.enumer.GameStatus;
import com.seven.wonders.pojo.enumer.GameType;

import java.util.ArrayList;

/**
 * Created by Pavel Ruban on 25.02.2017.
 * Entity for Game
 */
public class Game {

    // FIELDS
    private Long id;

    private String name;

    private int number;

    private GameStatus status;

    private ArrayList<Player> players;

    private GameType gameType;

    private GameSide gameSide;

    // CONSTRUCTORS

    // GETTERS AND SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public GameStatus getStatus() {
        return status;
    }

    public void setStatus(GameStatus status) {
        this.status = status;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public GameType getGameType() {
        return gameType;
    }

    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }

    public GameSide getGameSide() {
        return gameSide;
    }

    public void setGameSide(GameSide gameSide) {
        this.gameSide = gameSide;
    }
}
