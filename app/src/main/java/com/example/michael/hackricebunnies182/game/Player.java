package com.example.michael.hackricebunnies182.game;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michael on 1/15/2016.
 */
public class Player {
    private Color color;
    private List<RouteCard> cards;
    private int score;

    public Player(Color color) {
        this.score = 0;
        this.color = color;
        this.cards = new ArrayList<>();
    }

    public void addCards(List<RouteCard> cards) {
        cards.addAll(cards);
    }
}
