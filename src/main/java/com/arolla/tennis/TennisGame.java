package com.arolla.tennis;

/**
 * Created by aminebechraoui, on 03/02/2021, in com.arolla.tennis
 */
public class TennisGame {
    public static final String SEPARATOR = "-";
    private static final String PLAYER1 = "Player1";
    private int scoreP1;
    private int scoreP2;

    public TennisGame() {

    }

    public TennisGame(int scoreP1, int scoreP2) {
        this.scoreP1 = scoreP1;
        this.scoreP2 = scoreP2;
    }

    public void point(String player) {
        if (PLAYER1.equals(player)) {
            scoreP1++;
        } else {
            scoreP2++;
        }
    }

    public String score() {
        String result;
        if (scoreP1 == 1 && scoreP2 <4) {
            result = "fifteen";
            if(scoreP2 == 0) {
                result += SEPARATOR + "love";
            } else if (scoreP2 == 1) {
                result += SEPARATOR + "all";
            } else if (scoreP2 == 2) {
                result += SEPARATOR + "thirty";
            } else if (scoreP2 == 3) {
                result += SEPARATOR + "forty";
            }
            return result;
        } else if (scoreP1 == 2 && scoreP2 == 1) {
            return "thirty-fifteen";
        } else if (scoreP1 == 2 && scoreP2 == 2) {
            return "thirty-all";
        } else if (scoreP1 == 3 && scoreP2 == 2) {
            return "forty-thirty";
        } else if (scoreP1 == 2 && scoreP2 == 3) {
            return "thirty-forty";
        } else if (scoreP1 == 3 && scoreP2 == 0) {
            return "forty-love";
        } else if (scoreP1 == 2 && scoreP2 == 0) {
            return "thirty-love";
        } else if (scoreP1 >= 3 && scoreP2 >= 3
                && scoreP1 == scoreP2) {
            return "deuce";
        } else if (scoreP1 >= 4 && scoreP1-scoreP2 == 1) {
            return "advantage-player1";
        } else if (scoreP2 >= 4 && scoreP2-scoreP1 == 1) {
            return "advantage-player2";
        } else if (scoreP1 >= 4 && scoreP1-scoreP2 >= 2) {
            return "player1-win";
        } else if (scoreP2 >= 4 && scoreP2-scoreP1 >= 2) {
                return "player2-win";
            }

        return "love-fifteen";
    }
}
