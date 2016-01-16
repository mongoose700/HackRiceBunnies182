package com.example.michael.hackricebunnies182.game;

import java.util.List;
import java.util.Map;

/**
 * Created by Michael on 1/15/2016.
 */
public class GameMap {
    private Map<City, ? extends Map<City, Integer>> edgeDistances;
    private Map<City, ? extends Map<City, Integer>> shortestPathLengths;
}
