package com.seven.wonders.pojo.enumer;

/**
 * Created by Pavel Ruban on 04.04.2017.
 * Enum for Resource Type
 */
public enum ResourceType {

    // ENUMS
    GOLD("gold", "Золото"),
    STONE("stone", "Камень"),
    ORE("ore", "Руда"),
    CLAY("clay", "Глина"),
    WOOD("wood", "Древесина"),
    PAPIRUS("papirus", "Папирус"),
    TEXTILE("textile", "Техтиль"),
    GLASS("glass", "Стекло");

    // FIELDS
    private String code;

    private String name;

    //CONSTUCTORS
    ResourceType(String code, String name) {
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
