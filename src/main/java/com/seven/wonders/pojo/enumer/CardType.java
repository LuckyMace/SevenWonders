package com.seven.wonders.pojo.enumer;

/**
 * Created by Pavel Ruban on 06.04.2017.
 * Enum for Card Type
 */
public enum CardType {
    CIVILIAN("civilian", "Гражданский"),
    COMMERCIAL("commercial", "Коммерческий"),
    GUILD("guild", "Гильдия"),
    MILITARY("military", "Военный"),
    RARE_RESOURCE("rare_resource", "Товарный"),
    RESOURCE("resource", "Сырьевой"),
    SCIENTIFIC("scientific", "Научный");

    // FIELDS
    private String code;

    private String name;

    //CONSTUCTORS
    CardType(String code, String name) {
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
