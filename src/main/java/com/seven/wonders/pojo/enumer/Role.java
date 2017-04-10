package com.seven.wonders.pojo.enumer;

/**
 * Created by Pavel Ruban on 07.04.2017.
 * Enum for Role
 */
public enum Role {

    // ENUMS
    ADMIN(1, "admin", "Админ"),
    PLAYER(2, "user", "Игрок");


    // FIELDS
    private int id;

    private String code;

    private String name;

    //CONSTUCTORS
    Role(int id, String code, String name) {
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
