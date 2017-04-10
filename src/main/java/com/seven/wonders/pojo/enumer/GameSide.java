package com.seven.wonders.pojo.enumer;

/**
 * @author Aleksey Kurkov. Created on 10.04.2017
 */
public enum GameSide {

    // ENUMS
    A(1, "a", "Сторона 'А'"),
    B(2, "b", "Сторона 'Б'");

    // FIELDS
    private int id;
    private String code;
    private String name;

    //CONSTUCTORS
    GameSide(int id, String code, String name) {
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
