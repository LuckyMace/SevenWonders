package com.seven.wonders.pojo.entity.card;

import com.seven.wonders.pojo.entity.Resource;
import com.seven.wonders.pojo.enumer.Card;

import java.util.List;

/**
 * Created by Pavel Ruban on 01.04.2017.
 * Abstract entity for Card
 */
public abstract class AbstractCard {

    // FIELDS
    private Long id;

    private String code;

    private String name;

    private List<Resource> cost;

    private int playersNumber;

    private int epoch;

    private String imagePath;

    private String smallImagePath;

    private List<Card> freeCards;

    private List<Card> parentCards;

    //CONSTRUCTORS

    //GETTERS AND SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getSmallImagePath() {
        return smallImagePath;
    }

    public void setSmallImagePath(String smallImagePath) {
        this.smallImagePath = smallImagePath;
    }

    public List<Card> getFreeCards() {
        return freeCards;
    }

    public void setFreeCards(List<Card> freeCards) {
        this.freeCards = freeCards;
    }

    public List<Card> getParentCards() {
        return parentCards;
    }

    public void setParentCards(List<Card> parentCards) {
        this.parentCards = parentCards;
    }
}
