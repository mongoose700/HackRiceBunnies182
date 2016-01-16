package com.example.michael.hackricebunnies182.game;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michael on 1/15/2016.
 */
public class Draw {

    private int mustKeep;
    private Player player;
    private List<CheckedRouteCard> cards;

    public Draw(List<CheckedRouteCard> cards, Player player, int mustKeep) {
        this.cards = cards;
        this.player = player;
        this.mustKeep = mustKeep;
    }
}
