package com.seven.wonders.pojo.enumer;

import com.seven.wonders.pojo.entity.Resource;

import java.util.List;

/**
 * Created by Pavel Ruban on 06.04.2017.
 * Enum for Card
 */
public enum Card {
    // ENUMS
     //(, "", "", , , , , ""),

    ;

    // FIELDS
    private int id;

    private String code;

    private String name;

    private List<Resource> cost;

    private int playersNumber;

    private int epoch;

    private CardType type;

    private String imagePath;

    //CONSTUCTORS
    Card(int id, String code, String name, List<Resource> cost, int playersNumber, int epoch, CardType type, String imagePath) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.cost = cost;
        this.playersNumber = playersNumber;
        this.epoch = epoch;
        this.imagePath = imagePath;
        this.type = type;
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

    public List<Resource> getCost() {
        return cost;
    }

    public void setCost(List<Resource> cost) {
        this.cost = cost;
    }

    public int getPlayersNumber() {
        return playersNumber;
    }

    public void setPlayersNumber(int playersNumber) {
        this.playersNumber = playersNumber;
    }

    public int getEpoch() {
        return epoch;
    }

    public void setEpoch(int epoch) {
        this.epoch = epoch;
    }

    public CardType getType() {
        return type;
    }

    public void setType(CardType type) {
        this.type = type;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
