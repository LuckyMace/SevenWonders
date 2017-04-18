package com.seven.wonders.pojo.enumer;

import com.seven.wonders.pojo.entity.Resource;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Pavel Ruban on 06.04.2017.
 * Enum for Card
 */
public enum Card {
    // ENUMS
    CARD_1_1 (101, "1_1", "1 Эпоха", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.BACK, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_1.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_1.jpg", Arrays.asList(), Arrays.asList()),
    CARD_1_2 (102, "1_2", "Залежи глины", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 5, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_2.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_2.jpg", Arrays.asList(), Arrays.asList()),
    CARD_1_3 (103, "1_3", "Склад пиломатериалов", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_3.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_3.jpg", Arrays.asList(), Arrays.asList()),
    CARD_1_4 (104, "1_4", "Залежи глины", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_4.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_4.jpg", Arrays.asList(), Arrays.asList()),
    CARD_1_5 (105, "1_5", "Лесная пещера", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 1), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_5.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_5.jpg", Arrays.asList(), Arrays.asList()),
    CARD_1_6 (106, "1_6", "Шахта", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 1), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_6.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_6.jpg", Arrays.asList(), Arrays.asList()),
    CARD_1_7 (107, "1_7", "Рудная жила", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 4, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_7.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_7.jpg", Arrays.asList(), Arrays.asList()),
    CARD_1_8 (108, "1_8", "Глиняный карьер", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 1), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_8.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_8.jpg", Arrays.asList(), Arrays.asList()),
    CARD_1_9 (109, "1_9", "Рудная жила", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_9.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_9.jpg", Arrays.asList(), Arrays.asList()),
    CARD_1_10 (110, "1_10", "Склад пиломатериалов", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 4, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_10.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_10.jpg", Arrays.asList(), Arrays.asList()),
    CARD_1_11 (111, "1_11", "Каменный карьер", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_11.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_11.jpg", Arrays.asList(), Arrays.asList()),
    CARD_1_12 (112, "1_12", "Каменный карьер", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 5, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_12.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_12.jpg", Arrays.asList(), Arrays.asList()),
    CARD_1_13 (113, "1_13", "Древесная ферма", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 1), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 6, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_13.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_13.jpg", Arrays.asList(), Arrays.asList()),
    CARD_1_14 (114, "1_14", "Раскопки", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 1), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 4, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_14.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_14.jpg", Arrays.asList(), Arrays.asList()),
    CARD_1_15 (115, "1_15", "Лесной склад", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 1), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_15.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_15.jpg", Arrays.asList(), Arrays.asList()),
    CARD_1_16 (116, "1_16", "Печатное дело", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.RARE_RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_16.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_16.jpg", Arrays.asList(), Arrays.asList()),


    CARD_2_1 (201, "2_1", "2 Эпоха", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 2, CardType.BACK, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_1.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_1.jpg", Arrays.asList(), Arrays.asList()),



    CARD_3_1 (301, "3_1", "3 Эпоха", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 3, CardType.BACK, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\3_1.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\3_1.jpg", Arrays.asList(), Arrays.asList()),

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

    private String smallImagePath;

    private List<Card> freeCards;

    private List<Card> parentCards;

    //CONSTUCTORS
    Card(int id, String code, String name, List<Resource> cost, int playersNumber, int epoch, CardType type, String imagePath,
    String smallImagePath, List<Card> freeCards, List<Card> parentCards) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.cost = cost;
        this.playersNumber = playersNumber;
        this.epoch = epoch;
        this.type = type;
        this.imagePath = imagePath;
        this.smallImagePath = smallImagePath;
        this.freeCards = freeCards;
        this.parentCards = parentCards;
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
