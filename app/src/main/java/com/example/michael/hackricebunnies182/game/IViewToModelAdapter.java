package com.example.michael.hackricebunnies182.game;

import java.util.List;
import java.util.Optional;

/**
 * Adapter from View to Model
 */
public interface IViewToModelAdapter {

    /** Returns the players in the game */
    List<Player> getPlayers();

    /** Returns a new Draw of up to three cards from the deck of available cards
     * for the given Player to choose */
    Draw getNewDraw(Player player);

    /** Accepts a Draw returned by getNewDraw, with certain cards now designated as kept */
    void makeChoice(Draw choice);
}
