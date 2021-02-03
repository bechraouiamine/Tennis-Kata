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
        assertEquals("fifteen-Love", tennisGame.score());
    }
}