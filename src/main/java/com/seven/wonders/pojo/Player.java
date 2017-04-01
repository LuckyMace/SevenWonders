package com.seven.wonders.pojo;

/**
 * Created by user on 25.02.2017.
 */
public class Player {

    // FIELDS
    private Long id;

    private String name;

    private Boolean isAdmin;

    // CONSTRUCTORS
    public Player() {
    }

    public Player(String name, Boolean isAdmin) {
        this.name = name;
        this.isAdmin = isAdmin;
    }

    // GETTERS AND SETTERS
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

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }
}
