package com.arolla.tennis;

/**
 * Created by aminebechraoui, on 03/02/2021, in com.arolla.tennis
 */
public class TennisGame {
    private String whoScored;

    public void point(String player) {
        whoScored = player;
    }

    public String score() {
        if (whoScored.equals("Player1")) {
            return "fifteen-love";
        }
        return "love-fifteen";
    }
}
