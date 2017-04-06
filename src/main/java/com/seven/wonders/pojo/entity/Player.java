package com.seven.wonders.pojo.entity;

/**
 * Created by Pavel Ruban on 25.02.2017.
 * Entity for Player
 */
public class Player {

    // FIELDS
    private Long id;

    private String name;

    private Boolean isAdmin;

    private String selectedWonderName;

    // CONSTRUCTORS
    public Player() {
    }

    public Player(String name, Boolean isAdmin, String selectedWonderName) {
        this.name = name;
        this.isAdmin = isAdmin;
        this.selectedWonderName = selectedWonderName;
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

    public void setIsAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public String getSelectedWonderName() {
        return selectedWonderName;
    }

    public void setSelectedWonderName(String selectedWonderName) {
        this.selectedWonderName = selectedWonderName;
    }
}
