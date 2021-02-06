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
    void should_return_thirty_fifteen_when_player1_scores_twice_player2_scores_once_unordered_first_case() {
        // Given
        TennisGame tennisGame = new TennisGame();

        // When
        tennisGame.point("Player1");
        tennisGame.point("Player2");
        tennisGame.point("Player1");

        // Then
        assertEquals("thirty-fifteen", tennisGame.score());
    }

    @Test
    void should_return_thirty_fifteen_when_player1_scores_twice_player2_scores_once_unordered_second_case() {
        // Given
        TennisGame tennisGame = new TennisGame();

        // When
        tennisGame.point("Player2");
        tennisGame.point("Player1");
        tennisGame.point("Player1");

        // Then
        assertEquals("thirty-fifteen", tennisGame.score());
    }

    @Test
    void should_return_fifteen_thirty_when_player1_scores_once_player2_scores_twice() {
        // Given
        TennisGame tennisGame = new TennisGame();

        // When
        tennisGame.point("Player2");
        tennisGame.point("Player2");
        tennisGame.point("Player1");

        // Then
        assertEquals("fifteen-thirty", tennisGame.score());
    }

    @Test
    void should_return_fifteen_thirty_when_player1_scores_once_player2_scores_twice_unordered_first_case() {
        // Given
        TennisGame tennisGame = new TennisGame();

        // When
        tennisGame.point("Player2");
        tennisGame.point("Player1");
        tennisGame.point("Player2");

        // Then
        assertEquals("fifteen-thirty", tennisGame.score());
    }

    @Test
    void should_return_fifteen_thirty_when_player1_scores_once_player2_scores_twice_unordered_second_case() {
        // Given
        TennisGame tennisGame = new TennisGame();

        // When
        tennisGame.point("Player1");
        tennisGame.point("Player2");
        tennisGame.point("Player2");

        // Then
        assertEquals("fifteen-thirty", tennisGame.score());
    }

    @Test
    void should_return_thirty_all_when_both_player_score_twice() {
        // Given
        TennisGame tennisGame = new TennisGame();

        // When
        tennisGame.point("Player1");
        tennisGame.point("Player1");
        tennisGame.point("Player2");
        tennisGame.point("Player2");

        // Then
        assertEquals("thirty-all", tennisGame.score());
    }

    @Test
    void should_return_forty_thirty_player1_scores_3_player2_scores_2() {
        // Given
        TennisGame tennisGame = new TennisGame();

        // When
        tennisGame.point("Player1");
        tennisGame.point("Player1");
        tennisGame.point("Player1");
        tennisGame.point("Player2");
        tennisGame.point("Player2");

        // Then
        assertEquals("forty-thirty", tennisGame.score());
    }

    @Test
    void should_return_thirty_forty_player1_scores_2_player2_scores_3() {
        // Given
        TennisGame tennisGame = new TennisGame();

        // When
        tennisGame.point("Player1");
        tennisGame.point("Player1");
        tennisGame.point("Player2");
        tennisGame.point("Player2");
        tennisGame.point("Player2");

        // Then
        assertEquals("thirty-forty", tennisGame.score());
    }

    @Test
    void should_return_forty_all_player1_scores_3_player2_scores_3() {
        // Given
        TennisGame tennisGame = new TennisGame();

        // When
        tennisGame.point("Player1");
        tennisGame.point("Player1");
        tennisGame.point("Player1");
        tennisGame.point("Player2");
        tennisGame.point("Player2");
        tennisGame.point("Player2");

        // Then
        assertEquals("forty-all", tennisGame.score());
    }

}