package com.seven.wonders.pojo.entity;

import com.seven.wonders.pojo.enumer.Role;

/**
 * Created by Pavel Ruban on 25.02.2017.
 * Entity for Player
 */
public class Player {

    // FIELDS
    private Long id;

    private String name;

    private Role role;

    private String selectedWonderName;

    // CONSTRUCTORS
    public Player() {
    }

    public Player(String name, String selectedWonderName) {
        this.name = name;
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

    public String getSelectedWonderName() {
        return selectedWonderName;
    }

    public void setSelectedWonderName(String selectedWonderName) {
        this.selectedWonderName = selectedWonderName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
