package com.seven.wonders.pojo.enumer;

/**
 * Created by Pavel Ruban on 06.04.2017.
 * Enum for Wonder
 */
public enum Wonder {

    // ENUMS
    ALEXANDRIA ("alexandria", "Александрийский маяк"),
    BABYLON ("babylon", "Висячие сады в Вавилоне"),
    COLOSSUS ("colossus", "Колосс Родосский"),
    MAUSOLEUM ("mausoleum", "Мавзолей в Галикарнасе"),
    PYRAMID ("pyramid", "Пирамиды Гизы"),
    TEMPLE ("temple", "Храм Артемиды в Эфесе"),
    ZEUS ("zeus", "Статуя Зевса в Олимпии");

    // FIELDS
    private String code;

    private String name;

    //CONSTUCTORS
    Wonder(String code, String name) {
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
