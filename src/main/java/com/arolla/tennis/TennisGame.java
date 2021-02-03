package com.arolla.tennis;

/**
 * Created by aminebechraoui, on 03/02/2021, in com.arolla.tennis
 */
public class TennisGame {
    private String whoScored = new String();

    public void point(String player) {
        whoScored += player;
    }

    public String score() {
        if (whoScored.equals("Player1")) {
            return "fifteen-love";
        } else if (whoScored.equals("Player1Player2")) {
            return "fifteen-all";
        } else if (whoScored.equals("Player1Player1Player2")
                || whoScored.equals("Player1Player2Player1")) {
            return "thirty-fifteen";
        }
        return "love-fifteen";
    }
}
