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

    @Test
    void should_return_fifteen_all_when_both_players_score() {
        // Given
        TennisGame tennisGame = new TennisGame();

        // When
        tennisGame.point("Player1");
        tennisGame.point("Player2");

        // Then
        assertEquals("fifteen-all", tennisGame.score());
    }

    @Test
    void should_return_thirty_fifteen_when_player1_scores_twice_player2_scores_once() {
        // Given
        TennisGame tennisGame = new TennisGame();

        // When
        tennisGame.point("Player1");
        tennisGame.point("Player1");
        tennisGame.point("Player2");

        // Then
        assertEquals("thirty-fifteen", tennisGame.score());
    }

    @Test
    void should_return_thirty_fifteen_when_player1_scores_twice_player2_scores_once_unordered() {
        // Given
        TennisGame tennisGame = new TennisGame();

        // When
        tennisGame.point("Player1");
        tennisGame.point("Player2");
        tennisGame.point("Player1");

        // Then
        assertEquals("thirty-fifteen", tennisGame.score());
    }
}