package com.seven.wonders.pojo.entity.card;

/**
 * Created by Pavel Ruban on 01.04.2017.
 * Abstract entity for Card
 */
public abstract class AbstractCard {

    // FIELDS
    private Long id;

    private String name;

    private String imagePath;

    private int playersNumber;

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

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getPlayersNumber() {
        return playersNumber;
    }

    public void setPlayersNumber(int playersNumber) {
        this.playersNumber = playersNumber;
    }
}
