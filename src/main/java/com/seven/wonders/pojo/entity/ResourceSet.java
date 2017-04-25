package com.seven.wonders.pojo.entity;

import com.seven.wonders.pojo.enumer.ResourceType;

import java.util.Map;

/**
 * Created by Pavel Ruban on 25-Apr-17.
 * Entity for ResourceSet
 */
public class ResourceSet {

    // FIELDS
    private Map<ResourceType, Integer> resources;

    //CONSTRUCTORS
    public ResourceSet(Map<ResourceType, Integer> resources) {
        this.resources = resources;
    }


    //GETTERS AND SETTERS


    public Map<ResourceType, Integer> getResources() {
        return resources;
    }

    public void setResources(Map<ResourceType, Integer> resources) {
        this.resources = resources;
    }
}
