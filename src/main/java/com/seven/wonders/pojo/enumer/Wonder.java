package com.seven.wonders.pojo.enumer;

/**
 * Created by Pavel Ruban on 06.04.2017.
 * Enum for Wonder
 */
public enum Wonder {

    // ENUMS
    ALEXANDRIA ("Александрийский маяк"),
    BABYLON ("Висячие сады в Вавилоне"),
    COLOSSUS ("Колосс Родосский"),
    MAUSOLEUM ("Мавзолей в Галикарнасе"),
    PYRAMID ("Пирамиды Гизы"),
    TEMPLE ("Храм Артемиды в Эфесе"),
    ZEUS ("Статуя Зевса в Олимпии");

    // FIELDS
    private String name;

    //CONSTUCTORS
    Wonder(String name) {
        this.name = name;
    }

    // GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
