package com.arolla.tennis;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aminebechraoui, on 03/02/2021, in com.arolla.tennis
 */
public class TennisGame {
    private static final String SEPARATOR = "-";
    private static final String PLAYER1 = "player1";
    private static final String PLAYER2 = "player2";
    private static final Map<Integer, String> scores = new HashMap<Integer, String>() {{
        put(0, "love");
        put(1, "fifteen");
        put(2, "thirty");
        put(3, "forty");
    }
    };
    private static final String DEUCE = "deuce";
    private static final String ADVANTAGE = "advantage";
    private static final String ALL = "all";
    private static final String WIN = "win";

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
        String result = new String();
        if (scoreP1 <4 && scoreP2 <4 && scoreP1+scoreP2 != 6) {
            if(scoreP2 == scoreP1) {
                result += scores.get(scoreP1) + SEPARATOR + ALL;
            } else {
                result += scores.get(scoreP1) + SEPARATOR + scores.get(scoreP2);
            }
            return result;
        } else {
            if (scoreP1 == scoreP2) {
                result = DEUCE;
            } else if (Math.abs(scoreP1-scoreP2) == 1) {
                result = ADVANTAGE;
                if (scoreP1>scoreP2) {
                    result += SEPARATOR + PLAYER1;
                } else {
                    result += SEPARATOR + PLAYER2;
                }
            } else if (Math.abs(scoreP1-scoreP2) >= 2) {
                if (scoreP1>scoreP2) {
                    result = PLAYER1 + SEPARATOR + WIN;
                } else {
                    result = PLAYER2 + SEPARATOR + WIN;
                }
            }
        }
        return result;
    }
}
