package com.seven.wonders.pojo.enumer;

/**
 * Created by Pavel Ruban on 06.04.2017.
 * Enum for Wonder
 */
public enum Wonder {

    // ENUMS
    RANDOM (0, "random", "Случайно", ""),
    ALEXANDRIA (1, "alexandria", "Александрийский маяк", ""),
    BABYLON (2, "babylon", "Висячие сады в Вавилоне", ""),
    COLOSSUS (3, "colossus", "Колосс Родосский", ""),
    MAUSOLEUM (4, "mausoleum", "Мавзолей в Галикарнасе", ""),
    PYRAMID (5, "pyramid", "Пирамиды Гизы", ""),
    TEMPLE (6, "temple", "Храм Артемиды в Эфесе", ""),
    ZEUS (7, "zeus", "Статуя Зевса в Олимпии","");

    // FIELDS
    private int id;

    private String code;

    private String name;

    private String imagePath;

    //CONSTUCTORS
    Wonder(int id, String code, String name, String imagePath) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.imagePath = imagePath;
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

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
