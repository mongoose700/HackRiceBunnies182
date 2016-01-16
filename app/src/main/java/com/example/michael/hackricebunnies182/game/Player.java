package com.example.michael.hackricebunnies182.game;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michael on 1/15/2016.
 */
public class Player {
    private PlayerColor color;
    private List<RouteCard> cards;
    private int score;

    public Player(PlayerColor color) {
        this.score = 0;
        this.color = color;
        this.cards = new ArrayList<>();
    }

    public void addCards(List<RouteCard> cards) {
        cards.addAll(cards);
    }
}
