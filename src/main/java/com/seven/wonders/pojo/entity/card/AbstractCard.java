package com.seven.wonders.pojo.entity.card;

import com.seven.wonders.pojo.entity.Resource;

import java.util.List;

/**
 * Created by Pavel Ruban on 01.04.2017.
 * Abstract entity for Card
 */
public abstract class AbstractCard {

    // FIELDS
    private Long id;

    private String name;

    private List<Resource> cost;

    private int playersNumber;

    private int epoch;

    private String imagePath;

    private List<AbstractCard> freeCards;

    private List<AbstractCard> parentCards;

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

    public List<AbstractCard> getFreeCards() {
        return freeCards;
    }

    public void setFreeCards(List<AbstractCard> freeCards) {
        this.freeCards = freeCards;
    }

    public List<AbstractCard> getParentCards() {
        return parentCards;
    }

    public void setParentCards(List<AbstractCard> parentCards) {
        this.parentCards = parentCards;
    }
}
