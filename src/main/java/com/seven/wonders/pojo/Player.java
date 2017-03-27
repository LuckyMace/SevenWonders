package com.seven.wonders.pojo;

/**
 * Created by user on 25.02.2017.
 */
public class Player {

    private String name;
    private Boolean isAdmin;

    public Player() {
    }

    public Player(String name, Boolean isAdmin) {
        this.name = name;
        this.isAdmin = isAdmin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}
