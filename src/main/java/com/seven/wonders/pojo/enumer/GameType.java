package com.seven.wonders.pojo.enumer;

/**
 * @author Aleksey Kurkov. Created on 10.04.2017
 */
public enum GameType {

    // ENUMS
    BASE(1, "base", "7 Чудес"),
    LEADERS(2, "leaders", "7 Чудес + Лидеры"),
    CITIES(3, "cities", "7 Чудес + Лидеры + Города");

    // FIELDS
    private int id;
    private String code;
    private String name;

    //CONSTUCTORS
    GameType(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    // GETTERS AND SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
