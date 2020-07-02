package ru.atom.mm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.atom.mm.model.GameSession;
import ru.atom.mm.model.Connection;
import ru.atom.mm.service.ConnectionQueue;

import java.util.ArrayList;

import static ru.atom.mm.model.GameSession.PLAYERS_IN_GAME;


@SpringBootApplication
public class MatchMakerApp {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(MatchMakerApp.class, args);
        ConnectionQueue connectionQueue = new ConnectionQueue();
        boolean isTrue = true;
        while (isTrue = true) {
            for (int i= 0; i < PLAYERS_IN_GAME ; i++){
                connectionQueue.getQueue().poll();

                if (i == PLAYERS_IN_GAME){
                    GameSession newGame = new GameSession();
                    i = 0;
                }
            }
        }
    }
}
