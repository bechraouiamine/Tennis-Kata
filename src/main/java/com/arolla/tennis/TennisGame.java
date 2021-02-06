package com.arolla.tennis;

/**
 * Created by aminebechraoui, on 03/02/2021, in com.arolla.tennis
 */
public class TennisGame {
    private static final String PLAYER1 = "Player1";
    private int scoreP1;
    private int scoreP2;

    public void point(String player) {
        if (PLAYER1.equals(player)) {
            scoreP1++;
        } else {
            scoreP2++;
        }
    }

    public String score() {
        if (scoreP1 == 1 && scoreP2 == 0) {
            return "fifteen-love";
        } else if (scoreP1 == 1 && scoreP2 == 1) {
            return "fifteen-all";
        } else if (scoreP1 == 2 && scoreP2 == 1) {
            return "thirty-fifteen";
        } else if (scoreP1 == 1 && scoreP2 == 2) {
            return "fifteen-thirty";
        } else if (scoreP1 == 2 && scoreP2 == 2) {
            return "thirty-all";
        } else if (scoreP1 == 3 && scoreP2 == 2) {
            return "forty-thirty";
        } else if (scoreP1 == 2 && scoreP2 == 3) {
            return "thirty-forty";
        } else if (scoreP1 >= 3 && scoreP2 >= 3
                && scoreP1 == scoreP2) {
            return "deuce";
        } else if (scoreP1 >= 4 && scoreP1-scoreP2 == 1) {
            return "advantage-player1";
        } else if (scoreP2 >= 4 && scoreP2-scoreP1 == 1) {
            return "advantage-player2";
        } else if (scoreP1 == 5 && scoreP2 == 3) {
            return "player1-win";
        }

        return "love-fifteen";
    }
}
