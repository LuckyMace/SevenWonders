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
            , 3, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_3.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_3.jpg", null, null),
    CARD_1_4 (104, "1_4", "Залежи глины", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_4.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_4.jpg", null, null),
    CARD_1_5 (105, "1_5", "Лесная пещера", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 1), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_5.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_5.jpg", null, null),
    CARD_1_6 (106, "1_6", "Шахта", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 1), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_6.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_6.jpg", null, null),
    CARD_1_7 (107, "1_7", "Рудная жила", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 4, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_7.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_7.jpg", null, null),
    CARD_1_8 (108, "1_8", "Глиняный карьер", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 1), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_8.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_8.jpg", null, null),
    CARD_1_9 (109, "1_9", "Рудная жила", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_9.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_9.jpg", null, null),
    CARD_1_10 (110, "1_10", "Склад пиломатериалов", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 4, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_10.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_10.jpg", null, null),
    CARD_1_11 (111, "1_11", "Каменный карьер", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_11.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_11.jpg", null, null),
    CARD_1_12 (112, "1_12", "Каменный карьер", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 5, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_12.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_12.jpg", null, null),
    CARD_1_13 (113, "1_13", "Древесная ферма", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 1), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 6, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_13.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_13.jpg", null, null),
    CARD_1_14 (114, "1_14", "Раскопки", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 1), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 4, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_14.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_14.jpg", null, null),
    CARD_1_15 (115, "1_15", "Лесной склад", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 1), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_15.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_15.jpg", null, null),
    CARD_1_16 (116, "1_16", "Печатное дело", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.RARE_RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_16.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_16.jpg", null, null),
    CARD_1_17 (117, "1_17", "Печатное дело", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 6, 1, CardType.RARE_RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_17.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_17.jpg", null, null),
    CARD_1_18 (118, "1_18", "Производство стекла", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.RARE_RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_18.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_18.jpg", null, null),
    CARD_1_19 (119, "1_19", "Производство стекла", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 6, 1, CardType.RARE_RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_19.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_19.jpg", null, null),
    CARD_1_20 (120, "1_20", "Ткацкий станок", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.RARE_RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_20.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_20.jpg", null, null),
    CARD_1_21 (121, "1_21", "Ткацкий станок", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 6, 1, CardType.RARE_RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_21.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_21.jpg", null, null),
    CARD_1_22 (122, "1_22", "Ткацкий станок", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 4, 1, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_22.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_22.jpg", null, null),
    CARD_1_23 (123, "1_23", "Ткацкий станок", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 5, 1, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_23.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_23.jpg", null, null),
    CARD_1_24 (124, "1_24", "Ткацкий станок", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 7, 1, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_24.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_24.jpg", null, null),
    CARD_1_25 (125, "1_25", "Восточная фактория", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_25.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_25.jpg", null, null),
    CARD_1_26 (126, "1_26", "Восточная фактория", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 7, 1, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_26.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_26.jpg", null, null),
    CARD_1_27 (127, "1_27", "Рынок", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_27.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_27.jpg", null, null),
    CARD_1_28 (128, "1_28", "Рынок", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 6, 1, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_28.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_28.jpg", null, null),
    CARD_1_29 (129, "1_29", "Западная фактория", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_29.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_29.jpg", null, null),
    CARD_1_30 (130, "1_30", "Западная фактория", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 7, 1, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_30.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_30.jpg", null, null),
    CARD_1_31 (131, "1_31", "Бани", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_31.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_31.jpg", null, null),
    CARD_1_32 (132, "1_32", "Бани", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 7, 1, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_32.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_32.jpg", null, null),
    CARD_1_33 (133, "1_33", "Ломбард", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 4, 1, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_33.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_33.jpg", null, null),
    CARD_1_34 (134, "1_34", "Ломбард", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 7, 1, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_34.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_34.jpg", null, null),
    CARD_1_35 (135, "1_35", "Театр", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_35.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_35.jpg",null, null),
    CARD_1_36 (136, "1_36", "Театр", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 6, 1, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_36.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_36.jpg", null, null),
    CARD_1_37 (137, "1_37", "Алтарь", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_37.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_37.jpg", null, null),
    CARD_1_38 (138, "1_38", "Алтарь", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 5, 1, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_38.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_38.jpg", null, null),
    CARD_1_39 (139, "1_39", "Частокол", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 1))
            , 3, 1, CardType.MILITARY, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_39.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_39.jpg", null, null),
    CARD_1_40 (140, "1_40", "Частокол", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 1))
            , 7, 1, CardType.MILITARY, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_40.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_40.jpg", null, null),
    CARD_1_41 (141, "1_41", "Казармы", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 1), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.MILITARY, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_41.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_41.jpg", null, null),
    CARD_1_42 (142, "1_42", "Казармы", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 1), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 5, 1, CardType.MILITARY, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_42.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_42.jpg", null, null),
    CARD_1_43 (143, "1_43", "Сторожевая башня", Arrays.asList(new Resource(ResourceType.CLAY, 1), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.MILITARY, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_43.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_43.jpg", null, null),
    CARD_1_44 (144, "1_44", "Сторожевая башня", Arrays.asList(new Resource(ResourceType.CLAY, 1), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 4, 1, CardType.MILITARY, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_44.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_44.jpg", null, null),
    CARD_1_45 (145, "1_45", "Мастерская", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 1), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.SCIENTIFIC, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_45.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_45.jpg", null, null),
    CARD_1_46 (146, "1_46", "Мастерская", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 1), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 7, 1, CardType.SCIENTIFIC, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_46.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_46.jpg", null, null),
    CARD_1_47 (147, "1_47", "Аптека", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 1), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.MILITARY, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_47.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_47.jpg", null, null),
    CARD_1_48 (148, "1_48", "Аптека", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 1), new Resource(ResourceType.WOOD, 0))
            , 5, 1, CardType.MILITARY, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_48.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_48.jpg", null, null),
    CARD_1_49 (149, "1_49", "Скрипторий", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 1), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 1, CardType.MILITARY, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_49.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_49.jpg", null, null),
    CARD_1_50 (150, "1_50", "Скрипторий", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 1), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 4, 1, CardType.MILITARY, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\1_50.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\1_50.jpg", null, null),


    CARD_2_1 (201, "2_1", "2 Эпоха", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 2, CardType.BACK, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_1.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_1.jpg", null, null),
    CARD_2_2 (202, "2_2", "Кирпичный склад", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 1), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 2, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_2.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_2.jpg", null, null),
    CARD_2_3 (203, "2_3", "Кирпичный склад", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 1), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 4, 2, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_3.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_3.jpg", null, null),
    CARD_2_4 (204, "2_4", "Лесопилка", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 1), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 2, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_4.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_4.jpg", null, null),
    CARD_2_5 (205, "2_5", "Лесопилка", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 1), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 4, 2, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_5.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_5.jpg", null, null),
    CARD_2_6 (206, "2_6", "Каменоломня", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 1), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 2, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_6.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_6.jpg", null, null),
    CARD_2_7 (207, "2_7", "Каменоломня", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 1), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 4, 2, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_7.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_7.jpg", null, null),
    CARD_2_8 (208, "2_8", "Литейный цех", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 1), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 2, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_8.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_8.jpg", null, null),
    CARD_2_9 (209, "2_9", "Литейный цех", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 1), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 4, 2, CardType.RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_9.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_9.jpg", null, null),
    CARD_2_10 (210, "2_10", "Печатное дело", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 2, CardType.RARE_RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_10.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_10.jpg", null, null),
    CARD_2_11 (211, "2_11", "Печатное дело", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 5, 2, CardType.RARE_RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_11.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_11.jpg", null, null),
    CARD_2_12 (212, "2_12", "Производство стекла", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 2, CardType.RARE_RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_12.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_12.jpg", null, null),
    CARD_2_13 (213, "2_13", "Производство стекла", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 5, 2, CardType.RARE_RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_13.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_13.jpg", null, null),
    CARD_2_14 (214, "2_14", "Ткацкий станок", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 2, CardType.RARE_RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_14.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_14.jpg", null, null),
    CARD_2_15 (215, "2_15", "Ткацкий станок", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 5, 2, CardType.RARE_RESOURCE, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_15.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_15.jpg", null, null),
    CARD_2_16 (216, "2_16", "Статуя", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 2), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 1))
            , 3, 2, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_16.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_16.jpg", null, Arrays.asList(CARD_1_35, CARD_1_36)),
    CARD_2_17 (217, "2_17", "Статуя", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 2), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 1))
            , 7, 2, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_17.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_17.jpg", null, Arrays.asList(CARD_1_35, CARD_1_36)),
    CARD_2_18 (218, "2_18", "Здание суда", Arrays.asList(new Resource(ResourceType.CLAY, 2), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 1), new Resource(ResourceType.WOOD, 0))
            , 3, 2, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_18.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_18.jpg", null, Arrays.asList(CARD_1_49, CARD_1_50)),
    CARD_2_19 (219, "2_19", "Здание суда", Arrays.asList(new Resource(ResourceType.CLAY, 2), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 1), new Resource(ResourceType.WOOD, 0))
            , 5, 2, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_19.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_19.jpg", null, Arrays.asList(CARD_1_49, CARD_1_50)),
    CARD_2_20 (220, "2_20", "Храм", Arrays.asList(new Resource(ResourceType.CLAY, 1), new Resource(ResourceType.GLASS, 1), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 1))
            , 3, 2, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_20.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_20.jpg", null, Arrays.asList(CARD_1_37, CARD_1_38)),
    CARD_2_21 (221, "2_21", "Храм", Arrays.asList(new Resource(ResourceType.CLAY, 1), new Resource(ResourceType.GLASS, 1), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 1))
            , 6, 2, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_21.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_21.jpg", null, Arrays.asList(CARD_1_37, CARD_1_38)),
    CARD_2_22 (222, "2_22", "Акведук", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 3), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 2, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_22.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_22.jpg", null, Arrays.asList(CARD_1_31, CARD_1_32)),
    CARD_2_23 (223, "2_23", "Акведук", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 3), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 7, 2, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_23.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_23.jpg", null, Arrays.asList(CARD_1_31, CARD_1_32)),
    CARD_2_24 (224, "2_24", "Базар", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 4, 2, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_24.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_24.jpg", null, null),
    CARD_2_25 (225, "2_25", "Базар", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 7, 2, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_25.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_25.jpg", null, null),
    CARD_2_26 (226, "2_26", "Форум", Arrays.asList(new Resource(ResourceType.CLAY, 2), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 2, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_26.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_26.jpg", null, Arrays.asList(CARD_1_25, CARD_1_26, CARD_1_29, CARD_1_30)),
    CARD_2_27 (227, "2_27", "Форум", Arrays.asList(new Resource(ResourceType.CLAY, 2), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 6, 2, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_27.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_27.jpg", null, Arrays.asList(CARD_1_25, CARD_1_26, CARD_1_29, CARD_1_30)),
    CARD_2_28 (228, "2_28", "Форум", Arrays.asList(new Resource(ResourceType.CLAY, 2), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 7, 2, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_28.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_28.jpg", null, Arrays.asList(CARD_1_25, CARD_1_26, CARD_1_29, CARD_1_30)),
    CARD_2_29 (229, "2_29", "Виноградник", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 2, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_29.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_29.jpg", null, null),
    CARD_2_30 (230, "2_30", "Виноградник", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 6, 2, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_30.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_30.jpg", null, null),
    CARD_2_31 (231, "2_31", "Караван-сарай", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 2))
            , 3, 2, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_31.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_31.jpg", null, Arrays.asList(CARD_1_27, CARD_1_28)),
    CARD_2_32 (232, "2_32", "Караван-сарай", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 2))
            , 5, 2, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_32.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_32.jpg", null, Arrays.asList(CARD_1_27, CARD_1_28)),
    CARD_2_33 (233, "2_33", "Караван-сарай", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 2))
            , 6, 2, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_33.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_33.jpg", null, Arrays.asList(CARD_1_27, CARD_1_28)),
    CARD_2_34 (234, "2_34", "Учебный полигон", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 2), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 1))
            , 4, 2, CardType.MILITARY, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_34.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_34.jpg", null, null),
    CARD_2_35 (235, "2_35", "Учебный полигон", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 2), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 1))
            , 6, 2, CardType.MILITARY, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_35.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_35.jpg", null, null),
    CARD_2_36 (236, "2_36", "Учебный полигон", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 2), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 1))
            , 7, 2, CardType.MILITARY, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_36.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_36.jpg", null, null),
    CARD_2_37 (237, "2_37", "Конюшни", Arrays.asList(new Resource(ResourceType.CLAY, 1), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 1), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 1))
            , 3, 2, CardType.MILITARY, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_37.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_37.jpg", null, Arrays.asList(CARD_1_47, CARD_1_48)),
    CARD_2_38 (238, "2_38", "Конюшни", Arrays.asList(new Resource(ResourceType.CLAY, 1), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 1), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 1))
            , 5, 2, CardType.MILITARY, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_38.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_38.jpg", null, Arrays.asList(CARD_1_47, CARD_1_48)),
    CARD_2_39 (239, "2_39", "Стены", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 3), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 2, CardType.MILITARY, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_39.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_39.jpg", null, null),
    CARD_2_40 (240, "2_40", "Стены", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 3), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 7, 2, CardType.MILITARY, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_40.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_40.jpg", null, null),
    CARD_2_41 (241, "2_41", "Стрельбище", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 1), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 2))
            , 3, 2, CardType.MILITARY, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_41.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_41.jpg", null, Arrays.asList(CARD_1_45, CARD_1_46)),
    CARD_2_42 (242, "2_42", "Стрельбище", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 1), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 2))
            , 6, 2, CardType.MILITARY, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_42.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_42.jpg", null, Arrays.asList(CARD_1_45, CARD_1_46)),
    CARD_2_43 (243, "2_43", "Школа", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 1), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 1))
            , 3, 2, CardType.SCIENTIFIC, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_43.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_43.jpg", null, null),
    CARD_2_44 (244, "2_44", "Школа", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 1), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 1))
            , 7, 2, CardType.SCIENTIFIC, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_44.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_44.jpg", null, null),
    CARD_2_45 (245, "2_45", "Лаборатория", Arrays.asList(new Resource(ResourceType.CLAY, 2), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 1), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 2, CardType.SCIENTIFIC, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_45.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_45.jpg", null, Arrays.asList(CARD_1_45, CARD_1_46)),
    CARD_2_46 (246, "2_46", "Лаборатория", Arrays.asList(new Resource(ResourceType.CLAY, 2), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 1), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 5, 2, CardType.SCIENTIFIC, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_46.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_46.jpg", null, Arrays.asList(CARD_1_45, CARD_1_46)),
    CARD_2_47 (247, "2_47", "Амбулатория", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 1), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 2), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 2, CardType.SCIENTIFIC, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_47.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_47.jpg", null, Arrays.asList(CARD_1_47, CARD_1_48)),
    CARD_2_48 (248, "2_48", "Амбулатория", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 1), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 2), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 4, 2, CardType.SCIENTIFIC, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_48.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_48.jpg", null, Arrays.asList(CARD_1_47, CARD_1_48)),
    CARD_2_49 (249, "2_49", "Библиотека", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 2), new Resource(ResourceType.TEXTILE, 1), new Resource(ResourceType.WOOD, 0))
            , 3, 2, CardType.SCIENTIFIC, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_49.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_49.jpg", null, Arrays.asList(CARD_1_49, CARD_1_50)),
    CARD_2_50 (250, "2_50", "Библиотека", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 2), new Resource(ResourceType.TEXTILE, 1), new Resource(ResourceType.WOOD, 0))
            , 6, 2, CardType.SCIENTIFIC, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\2_50.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\2_50.jpg", null, Arrays.asList(CARD_1_49, CARD_1_50)),


    CARD_3_1 (301, "3_1", "3 Эпоха", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 3, CardType.BACK, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\3_1.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\3_1.jpg", null, null),
    CARD_3_2 (302, "3_2", "Дворец", Arrays.asList(new Resource(ResourceType.CLAY, 1), new Resource(ResourceType.GLASS, 1), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 1), new Resource(ResourceType.PAPIRUS, 1), new Resource(ResourceType.STONE, 1), new Resource(ResourceType.TEXTILE, 1), new Resource(ResourceType.WOOD, 1))
            , 3, 3, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\3_2.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\3_2.jpg", null, null),
    CARD_3_3 (303, "3_3", "Дворец", Arrays.asList(new Resource(ResourceType.CLAY, 1), new Resource(ResourceType.GLASS, 1), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 1), new Resource(ResourceType.PAPIRUS, 1), new Resource(ResourceType.STONE, 1), new Resource(ResourceType.TEXTILE, 1), new Resource(ResourceType.WOOD, 1))
            , 7, 3, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\3_3.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\3_3.jpg", null, null),
    CARD_3_4 (304, "3_4", "Сенат", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 1), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 1), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 2))
            , 3, 3, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\3_4.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\3_4.jpg", null, Arrays.asList(CARD_2_49, CARD_2_50)),
    CARD_3_5 (305, "3_5", "Сенат", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 1), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 1), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 2))
            , 5, 3, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\3_5.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\3_5.jpg", null, Arrays.asList(CARD_2_49, CARD_2_50)),
    CARD_3_6 (306, "3_6", "Ратуша", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 1), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 1), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 2), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 3, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\3_6.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\3_6.jpg", null, null),
    CARD_3_7 (307, "3_7", "Ратуша", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 1), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 1), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 2), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 5, 3, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\3_7.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\3_7.jpg", null, null),
    CARD_3_8 (308, "3_8", "Ратуша", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 1), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 1), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 2), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 6, 3, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\3_8.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\3_8.jpg", null, null),
    CARD_3_9 (309, "3_9", "Сады", Arrays.asList(new Resource(ResourceType.CLAY, 2), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 1))
            , 3, 3, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\3_9.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\3_9.jpg", null, Arrays.asList(CARD_2_16, CARD_2_17)),
    CARD_3_10 (310, "3_10", "Сады", Arrays.asList(new Resource(ResourceType.CLAY, 2), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 1))
            , 4, 3, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\3_10.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\3_10.jpg", null, Arrays.asList(CARD_2_16, CARD_2_17)),
    CARD_3_11 (311, "3_11", "Пантеон", Arrays.asList(new Resource(ResourceType.CLAY, 2), new Resource(ResourceType.GLASS, 1), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 1), new Resource(ResourceType.PAPIRUS, 1), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 1), new Resource(ResourceType.WOOD, 0))
            , 3, 3, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\3_11.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\3_11.jpg", null, Arrays.asList(CARD_2_20, CARD_2_21)),
    CARD_3_12 (312, "3_12", "Пантеон", Arrays.asList(new Resource(ResourceType.CLAY, 2), new Resource(ResourceType.GLASS, 1), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 1), new Resource(ResourceType.PAPIRUS, 1), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 1), new Resource(ResourceType.WOOD, 0))
            , 6, 3, CardType.CIVILIAN, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\3_12.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\3_12.jpg", null, Arrays.asList(CARD_2_20, CARD_2_21)),
    CARD_3_13 (313, "3_13", "Арена", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 1), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 2), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 3, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\3_13.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\3_13.jpg", null, Arrays.asList(CARD_2_47, CARD_2_48)),
    CARD_3_14 (314, "3_14", "Арена", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 1), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 2), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 5, 3, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\3_14.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\3_14.jpg", null, Arrays.asList(CARD_2_47, CARD_2_48)),
    CARD_3_15 (315, "3_15", "Арена", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 1), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 2), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 7, 3, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\3_15.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\3_15.jpg", null, Arrays.asList(CARD_2_47, CARD_2_48)),
    CARD_3_16 (316, "3_16", "Маяк", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 1), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 1), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 3, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\3_16.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\3_16.jpg", null, Arrays.asList(CARD_2_31, CARD_2_32, CARD_2_33)),
    CARD_3_17 (317, "3_17", "Маяк", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 1), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 1), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 6, 3, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\3_17.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\3_17.jpg", null, Arrays.asList(CARD_2_31, CARD_2_32, CARD_2_33)),
    CARD_3_18 (318, "3_18", "Торговая палата", Arrays.asList(new Resource(ResourceType.CLAY, 2), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 1), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 4, 3, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\3_18.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\3_18.jpg", null, null),
    CARD_3_19 (319, "3_19", "Торговая палата", Arrays.asList(new Resource(ResourceType.CLAY, 2), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 0), new Resource(ResourceType.PAPIRUS, 1), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 6, 3, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\3_19.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\3_19.jpg", null, null),
    CARD_3_20 (320, "3_20", "Гавань", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 1), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 1), new Resource(ResourceType.WOOD, 1))
            , 3, 3, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\3_20.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\3_20.jpg", null, Arrays.asList(CARD_2_26, CARD_2_27, CARD_2_28)),
    CARD_3_21 (321, "3_21", "Гавань", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 1), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 0), new Resource(ResourceType.TEXTILE, 1), new Resource(ResourceType.WOOD, 1))
            , 4, 3, CardType.COMMERCIAL, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\3_21.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\3_21.jpg", null, Arrays.asList(CARD_2_26, CARD_2_27, CARD_2_28)),
    CARD_3_22 (322, "3_22", "Укрепления", Arrays.asList(new Resource(ResourceType.CLAY, 0), new Resource(ResourceType.GLASS, 0), new Resource(ResourceType.GOLD, 0), new Resource(ResourceType.ORE, 3), new Resource(ResourceType.PAPIRUS, 0), new Resource(ResourceType.STONE, 1), new Resource(ResourceType.TEXTILE, 0), new Resource(ResourceType.WOOD, 0))
            , 3, 3, CardType.MILITARY, "src\\main\\webapp\\WEB-INF\\static\\img\\cards\\3_22.jpg", "src\\main\\webapp\\WEB-INF\\static\\img\\small_cards\\3_22.jpg", null, Arrays.asList(CARD_2_39, CARD_2_40)),


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
