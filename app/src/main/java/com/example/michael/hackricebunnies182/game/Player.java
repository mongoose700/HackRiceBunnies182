package com.example.michael.hackricebunnies182.game;

import java.util.ArrayList;
import java.util.List;

/**
 * A player of the game
 */
public class Player {
    private final PlayerColor color;
    private final List<RouteCard> cards;
    private int score;

    public Player(PlayerColor color) {
        this.score = 0;
        this.color = color;
        this.cards = new ArrayList<>();
    }

    public void addCards(List<RouteCard> addedCards) {
        cards.addAll(addedCards);
    }
}
