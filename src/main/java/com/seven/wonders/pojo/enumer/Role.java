package com.seven.wonders.pojo.enumer;

/**
 * Created by Pavel Ruban on 07.04.2017.
 * Enum for Role
 */
public enum Role {

    // ENUMS
    ADMIN("admin", "Админ"),
    USER("user", "Игрок");


    // FIELDS
    private String code;

    private String name;

    //CONSTUCTORS
    Role(String code, String name) {
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
