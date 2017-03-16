package com.seven.wonders.pojo;

/**
 * Created by user on 25.02.2017.
 */
public class Player {
    private String name;

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    private boolean isAdmin;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
