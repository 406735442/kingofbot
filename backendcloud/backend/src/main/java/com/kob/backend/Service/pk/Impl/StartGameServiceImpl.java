package com.kob.backend.Service.pk.Impl;

import com.kob.backend.Consumer.WebSocketServer;
import com.kob.backend.Service.pk.StartGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StartGameServiceImpl implements StartGameService {
    @Autowired
    private  WebSocketServer webSocketServer;
    @Override
    public String startGame(Integer aId, Integer bId) {
        System.out.println("start game" + aId + " " + bId);
        webSocketServer.startGame(aId,bId);
        return "start successfully!";
    }
}
