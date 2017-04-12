package com.seven.wonders.pojo.enumer;

/**
 * Created by Pavel Ruban on 06.04.2017.
 * Enum for Wonder
 */
public enum Wonder {

    // ENUMS
    RANDOM (0, "random", "Случайно", "src\\main\\webapp\\WEB-INF\\static\\img\\wonders\\random.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\wonders\\random.jpg"),
    ALEXANDRIA (1, "alexandria", "Александрийский маяк", "src\\main\\webapp\\WEB-INF\\static\\img\\wonders\\alexandria_a.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\wonders\\alexandria_b.jpg"),
    BABYLON (2, "babylon", "Висячие сады в Вавилоне", "src\\main\\webapp\\WEB-INF\\static\\img\\wonders\\babylon_a.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\wonders\\babylon_b.jpg"),
    COLOSSUS (3, "colossus", "Колосс Родосский", "src\\main\\webapp\\WEB-INF\\static\\img\\wonders\\colossus_a.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\wonders\\colossus_b.jpg"),
    MAUSOLEUM (4, "mausoleum", "Мавзолей в Галикарнасе", "src\\main\\webapp\\WEB-INF\\static\\img\\wonders\\mausoleum_a.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\wonders\\mausoleum_b.jpg"),
    PYRAMID (5, "pyramid", "Пирамиды Гизы", "src\\main\\webapp\\WEB-INF\\static\\img\\wonders\\pyramid_a.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\wonders\\pyramid_b.jpg"),
    TEMPLE (6, "temple", "Храм Артемиды в Эфесе", "src\\main\\webapp\\WEB-INF\\static\\img\\wonders\\temple_a.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\wonders\\temple_b.jpg"),
    ZEUS (7, "zeus", "Статуя Зевса в Олимпии","src\\main\\webapp\\WEB-INF\\static\\img\\wonders\\zeus_a.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\wonders\\zeus_b.jpg");

    // FIELDS
    private int id;

    private String code;

    private String name;

    private String imagePathA;

    private String imagePathB;

    //CONSTUCTORS
    Wonder(int id, String code, String name, String imagePathA, String imagePathB) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.imagePathA = imagePathA;
        this.imagePathB = imagePathB;
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

    public String getImagePathA() {
        return imagePathA;
    }

    public void setImagePathA(String imagePathA) {
        this.imagePathA = imagePathA;
    }

    public String getImagePathB() {
        return imagePathB;
    }

    public void setImagePathB(String imagePathB) {
        this.imagePathB = imagePathB;
    }
}
