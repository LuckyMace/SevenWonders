package com.seven.wonders.pojo;

/**
 * Created by user on 25.02.2017.
 */
public class Game {

    private Long id;

    private String name;

    private int number;

    private GameStatus status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GameStatus getStatus() {
        return status;
    }

    public void setStatus(GameStatus status) {
        this.status = status;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String newGameName) {
        this.name = name;
    }
}
