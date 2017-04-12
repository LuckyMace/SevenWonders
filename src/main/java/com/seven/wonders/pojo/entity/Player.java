package com.seven.wonders.pojo.entity;

import com.seven.wonders.pojo.entity.wonder.AbstractWonder;
import com.seven.wonders.pojo.enumer.Role;
import com.seven.wonders.pojo.enumer.Wonder;

/**
 * Created by Pavel Ruban on 25.02.2017.
 * Entity for Player
 */
public class Player {

    // FIELDS
    private Long id;

    private String name;

    private Role role;

    private AbstractWonder wonder;

    private Wonder selectedWonder;

    // CONSTRUCTORS
    public Player() {
    }

    public Player(String name, Wonder selectedWonder) {
        this.name = name;
        this.selectedWonder = selectedWonder;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public AbstractWonder getWonder() {
        return wonder;
    }

    public void setWonder(AbstractWonder wonder) {
        this.wonder = wonder;
    }

    public Wonder getSelectedWonder() {
        return selectedWonder;
    }

    public void setSelectedWonder(Wonder selectedWonder) {
        this.selectedWonder = selectedWonder;
    }
}
