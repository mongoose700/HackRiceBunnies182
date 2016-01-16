package com.example.michael.hackricebunnies182.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;


/**
 * The model (as per MVC)
 */
public class Model {

    private Deck deck;
    private List<Player> players;
    private GameMap map;

    public Model(Set<PlayerColor> colors) {
        players = new ArrayList<>();
        for (PlayerColor c : colors)
            players.add(new Player(c));
        Collections.shuffle(players);
        map = new GameMap();
        deck = map.createDeck();
    }

    public IViewToModelAdapter getAdapter() {
        return new IViewToModelAdapter() {
            @Override
            public List<Player> getPlayers() {
                return players;
            }

            @Override
            public Draw getNewDraw(Player player) {
                return null; //TODO: create new draw
            }

            @Override
            public void makeChoice(Draw choice) {
                //TODO: implement
            }
        };
    }


}
