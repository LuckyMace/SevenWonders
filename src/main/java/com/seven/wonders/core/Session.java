package com.seven.wonders.core;

import com.seven.wonders.pojo.Game;
import com.seven.wonders.pojo.Player;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * Created by user on 15.03.2017.
 */

@Scope(value = "session",  proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
public class Session {
    private Game currentGame;

    private Player currentPlayer;

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public Game getCurrentGame() {
        return currentGame;
    }

    public void setCurrentGame(Game currentGame) {
        this.currentGame = currentGame;
    }
}
