package com.seven.wonders.pojo.enumer;

/**
 * Created by Pavel Ruban on 25.02.2017.
 * Enum for Game Status
 */
public enum GameStatus {

    //ENUMS
    NEW("new", "Новая"),
    STARTED("playing", "Началась"),
    FINISHED("finished", "Завершена");

    // FIELDS
    private String code;

    private String name;

    //CONSTUCTORS
    GameStatus(String code, String name) {
        this.code = code;
        this.name = name;
    }

    // GETTERS AND SETTERS

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
