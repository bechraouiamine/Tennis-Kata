package com.arolla.tennis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TennisGameTest {
    @Test
    void should_return_fifteen_love_when_player_one_score() {
        // Given
        TennisGame tennisGame = new TennisGame();

        // When
        tennisGame.point("Player1");

        // Then
        assertEquals("fifteen-love", tennisGame.score());
    }

    @Test
    void should_return_love_fifteen_when_player_two_score() {
        // Given
        TennisGame tennisGame = new TennisGame();

        // When
        tennisGame.point("Player2");

        // Then
        assertEquals("love-fifteen", tennisGame.score());
    }
}