package com.seven.wonders.pojo.entity;

import com.seven.wonders.pojo.enumer.ResourceType;

/**
 * Created by Pavel Ruban on 04.04.2017.
 * Entity for Resource
 */
public class Resource {

    // FIELDS
    private ResourceType type;

    private int value;

    //CONSTRUCTORS
    public Resource(ResourceType type, int value) {
        this.type = type;
        this.value = value;
    }

    //GETTERS AND SETTERS
    public ResourceType getType() {
        return type;
    }

    public void setType(ResourceType type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


}
