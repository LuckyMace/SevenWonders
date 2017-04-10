package com.seven.wonders.pojo.enumer;

/**
 * Created by Pavel Ruban on 06.04.2017.
 * Enum for Card Type
 */
public enum CardType {

    //ENUM
    CIVILIAN(1, "civilian", "Гражданский"),
    COMMERCIAL(2, "commercial", "Коммерческий"),
    GUILD(3, "guild", "Гильдия"),
    MILITARY(4, "military", "Военный"),
    RARE_RESOURCE(5, "rare_resource", "Товарный"),
    RESOURCE(6, "resource", "Сырьевой"),
    SCIENTIFIC(7, "scientific", "Научный");

    // FIELDS
    private int id;

    private String code;

    private String name;

    //CONSTUCTORS
    CardType(int id, String code, String name) {
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
