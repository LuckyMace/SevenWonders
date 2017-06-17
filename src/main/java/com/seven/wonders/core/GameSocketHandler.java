package com.seven.wonders.core;

import com.seven.wonders.core.Application;
import com.seven.wonders.core.Session;
import com.seven.wonders.pojo.entity.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by user on 17.06.2017.
 */
@Component
public class GameSocketHandler {

    @Autowired
    private Application application;

    @Autowired
    private Session session;

    @SendTo("/topic/playerList")
    public List<Player> updatePlayers() throws Exception {
        return application.getAllGames().get(session.getCurrentGameId()).getPlayers();
    }
}
