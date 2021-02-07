package com.arolla.tennis;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aminebechraoui, on 03/02/2021, in com.arolla.tennis
 */
public class TennisGame {
    private static final String SEPARATOR = "-";
    private static final String PLAYER1 = "Player1";
    private static final Map<Integer, String> scores = new HashMap<Integer, String>() {{
        put(0, "love");
        put(1, "fifteen");
        put(2, "thirty");
        put(3, "forty");
    }
    };
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
            if(scoreP2 == scoreP1) {
                result += SEPARATOR + "all";
            } else {
                result += SEPARATOR + scores.get(scoreP2);
            }
            return result;
        } else if (scoreP1 == 2 && scoreP2 <4) {
            result = "thirty";
            if(scoreP2 == scoreP1) {
                result += SEPARATOR + "all";
            } else {
                result += SEPARATOR + scores.get(scoreP2);
            }
            return result;
        } else if (scoreP1 == 3 && scoreP2 == 2) {
            return "forty-thirty";
        } else if (scoreP1 == 3 && scoreP2 == 1) {
            return "forty-fifteen";
        } else if (scoreP1 == 3 && scoreP2 == 0) {
            return "forty-love";
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
