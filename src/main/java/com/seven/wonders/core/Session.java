package com.seven.wonders.core;

import com.seven.wonders.pojo.entity.Player;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * Created by user on 15.03.2017.
 */

@Scope(value = "session",  proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
public class Session {
    private String currentGameId;

    private Player currentPlayer;

    public String getCurrentGameId() {
        return currentGameId;
    }

    public void setCurrentGameId(String currentGameId) {
        this.currentGameId = currentGameId;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }
}
