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
            , 3, 1, CardType.BACK, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_1.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_1.jpg", null, null),
    CARD_1_2 (102, "1_2", "Залежи глины", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 5, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_2.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_2.jpg", null, null),
    CARD_1_3 (103, "1_3", "Склад пиломатериалов", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_3.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_3.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_4 (104, "1_4", "Залежи глины", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_4.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_4.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_5 (105, "1_5", "Лесная пещера", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 1), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_5.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_5.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_6 (106, "1_6", "Шахта", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 1), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_6.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_6.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_7 (107, "1_7", "Рудная жила", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 4, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_7.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_7.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_8 (108, "1_8", "Глиняный карьер", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 1), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_8.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_8.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_9 (109, "1_9", "Рудная жила", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_9.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_9.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_10 (110, "1_10", "Склад пиломатериалов", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 4, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_10.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_10.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_11 (111, "1_11", "Каменный карьер", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_11.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_11.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_12 (112, "1_12", "Каменный карьер", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 5, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_12.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_12.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_13 (113, "1_13", "Древесная ферма", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 1), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 6, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_13.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_13.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_14 (114, "1_14", "Раскопки", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 1), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 4, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_14.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_14.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_15 (115, "1_15", "Лесной склад", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 1), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_15.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_15.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_16 (116, "1_16", "Печатное дело", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.RARE_RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_16.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_16.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_17 (117, "1_17", "Печатное дело", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 6, 1, CardType.RARE_RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_17.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_17.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_18 (118, "1_18", "Производство стекла", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.RARE_RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_18.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_18.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_19 (119, "1_19", "Производство стекла", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 6, 1, CardType.RARE_RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_19.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_19.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_20 (120, "1_20", "Ткацкий станок", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.RARE_RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_20.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_20.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_21 (121, "1_21", "Ткацкий станок", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 6, 1, CardType.RARE_RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_21.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_21.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_22 (122, "1_22", "Ткацкий станок", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 4, 1, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_22.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_22.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_23 (123, "1_23", "Ткацкий станок", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 5, 1, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_23.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_23.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_24 (124, "1_24", "Ткацкий станок", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 7, 1, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_24.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_24.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_25 (125, "1_25", "Восточная фактория", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_25.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_25.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_26 (126, "1_26", "Восточная фактория", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 7, 1, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_26.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_26.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_27 (127, "1_27", "Рынок", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_27.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_27.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_28 (128, "1_28", "Рынок", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 6, 1, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_28.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_28.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_29 (129, "1_29", "Западная фактория", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_29.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_29.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_30 (130, "1_30", "Западная фактория", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 7, 1, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_30.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_30.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_31 (131, "1_31", "Бани", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_31.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_31.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_32 (132, "1_32", "Бани", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 7, 1, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_32.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_32.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_33 (133, "1_33", "Ломбард", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 4, 1, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_33.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_33.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_34 (134, "1_34", "Ломбард", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 7, 1, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_34.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_34.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_35 (135, "1_35", "Театр", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_35.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_35.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_36 (136, "1_36", "Театр", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 6, 1, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_36.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_36.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_37 (137, "1_37", "Алтарь", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_37.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_37.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_38 (138, "1_38", "Алтарь", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 5, 1, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_38.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_38.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_39 (139, "1_39", "Частокол", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 1))
            , 3, 1, CardType.MILITARY, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_39.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_39.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_40 (140, "1_40", "Частокол", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 1))
            , 7, 1, CardType.MILITARY, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_40.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_40.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_41 (141, "1_41", "Казармы", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 1), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.MILITARY, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_41.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_41.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_42 (142, "1_42", "Казармы", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 1), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 5, 1, CardType.MILITARY, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_42.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_42.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_43 (143, "1_43", "Сторожевая башня", Arrays.asList(new Resource(ResourceType.CLAY, 1), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.MILITARY, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_43.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_43.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_44 (144, "1_44", "Сторожевая башня", Arrays.asList(new Resource(ResourceType.CLAY, 1), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 4, 1, CardType.MILITARY, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_44.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_44.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_45 (145, "1_45", "Мастерская", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.SCIENTIFIC, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_45.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_45.jpg", Arrays.asList(CARD_1_1), null),
    CARD_1_46 (146, "1_46", "Мастерская", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 4, 1, CardType.SCIENTIFIC, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_46.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_46.jpg", Arrays.asList(CARD_1_1), null),


    CARD_2_1 (201, "2_1", "2 Эпоха", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 2, CardType.BACK, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_1.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_1.jpg", null, null),



    CARD_3_1 (301, "3_1", "3 Эпоха", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 3, CardType.BACK, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\3_1.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\3_1.jpg", null, null),

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
