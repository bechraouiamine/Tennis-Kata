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
    void should_return_deuce_player1_scores_3_player2_scores_3() {
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
        assertEquals("deuce", tennisGame.score());
    }

    @Test
    void should_return_deuce_both_player_score_4() {
        // Given
        TennisGame tennisGame = new TennisGame();

        // When
        tennisGame.point("Player1");
        tennisGame.point("Player1");
        tennisGame.point("Player1");
        tennisGame.point("Player2");
        tennisGame.point("Player2");
        tennisGame.point("Player2");
        tennisGame.point("Player1");
        tennisGame.point("Player2");


        // Then
        assertEquals("deuce", tennisGame.score());
    }

    @Test
    void should_return_deuce_both_player_score_5() {
        // Given
        TennisGame tennisGame = new TennisGame();

        // When
        tennisGame.point("Player1");
        tennisGame.point("Player1");
        tennisGame.point("Player1");
        tennisGame.point("Player2");
        tennisGame.point("Player2");
        tennisGame.point("Player2");
        tennisGame.point("Player1");
        tennisGame.point("Player2");
        tennisGame.point("Player1");
        tennisGame.point("Player2");

        // Then
        assertEquals("deuce", tennisGame.score());
    }

    @Test
    void should_return_advantage_player1_when_p1_scores_4_p2_scores_3() {
        // Given
        TennisGame tennisGame = new TennisGame();

        // When
        tennisGame.point("Player1");
        tennisGame.point("Player1");
        tennisGame.point("Player1");
        tennisGame.point("Player2");
        tennisGame.point("Player2");
        tennisGame.point("Player2");
        tennisGame.point("Player1");

        // Then
        assertEquals("advantage-player1", tennisGame.score());
    }

    @Test
    void should_return_advantage_player1_when_p1_scores_5_p2_scores_4() {
        // Given
        TennisGame tennisGame = new TennisGame();

        // When
        tennisGame.point("Player1");
        tennisGame.point("Player1");
        tennisGame.point("Player1");
        tennisGame.point("Player2");
        tennisGame.point("Player2");
        tennisGame.point("Player2");
        tennisGame.point("Player1");
        tennisGame.point("Player2");
        tennisGame.point("Player1");

        // Then
        assertEquals("advantage-player1", tennisGame.score());
    }

    @Test
    void should_return_advantage_player1_when_p1_scores_6_p2_scores_5() {
        // Given
        TennisGame tennisGame = new TennisGame();

        // When
        tennisGame.point("Player1");
        tennisGame.point("Player1");
        tennisGame.point("Player1");
        tennisGame.point("Player2");
        tennisGame.point("Player2");
        tennisGame.point("Player2");
        tennisGame.point("Player1");
        tennisGame.point("Player2");
        tennisGame.point("Player1");
        tennisGame.point("Player2");
        tennisGame.point("Player1");

        // Then
        assertEquals("advantage-player1", tennisGame.score());
    }

    @Test
    void should_return_advantage_player2_when_p1_scores_3_p2_scores_4() {
        // Given
        TennisGame tennisGame = new TennisGame();

        // When
        tennisGame.point("Player1");
        tennisGame.point("Player1");
        tennisGame.point("Player1");
        tennisGame.point("Player2");
        tennisGame.point("Player2");
        tennisGame.point("Player2");
        tennisGame.point("Player2");

        // Then
        assertEquals("advantage-player2", tennisGame.score());
    }

    @Test
    void should_return_advantage_player2_when_p1_scores_4_p2_scores_5() {
        // Given
        TennisGame tennisGame = new TennisGame();

        // When
        tennisGame.point("Player1");
        tennisGame.point("Player1");
        tennisGame.point("Player1");
        tennisGame.point("Player2");
        tennisGame.point("Player2");
        tennisGame.point("Player2");
        tennisGame.point("Player2");
        tennisGame.point("Player1");
        tennisGame.point("Player2");

        // Then
        assertEquals("advantage-player2", tennisGame.score());
    }

    @Test
    void should_return_advantage_player2_when_p1_scores_5_p2_scores_6() {
        // Given
        TennisGame tennisGame = new TennisGame();

        // When
        tennisGame.point("Player1");
        tennisGame.point("Player1");
        tennisGame.point("Player1");
        tennisGame.point("Player2");
        tennisGame.point("Player2");
        tennisGame.point("Player2");
        tennisGame.point("Player2");
        tennisGame.point("Player1");
        tennisGame.point("Player2");
        tennisGame.point("Player1");
        tennisGame.point("Player2");

        // Then
        assertEquals("advantage-player2", tennisGame.score());
    }

    @Test
    void should_return_player1_win_p1_scores_5_player2_scores_3() {
        // Given
        TennisGame tennisGame = new TennisGame();

        // When
        tennisGame.point("Player1");
        tennisGame.point("Player1");
        tennisGame.point("Player1");
        tennisGame.point("Player2");
        tennisGame.point("Player2");
        tennisGame.point("Player2");
        tennisGame.point("Player1");
        tennisGame.point("Player1");

        // Then
        assertEquals("player1-win", tennisGame.score());
    }

    @Test
    void should_return_player1_win_p1_scores_6_player2_scores_4() {
        // Given
        TennisGame tennisGame = new TennisGame();

        // When
        tennisGame.point("Player1");
        tennisGame.point("Player1");
        tennisGame.point("Player1");
        tennisGame.point("Player2");
        tennisGame.point("Player2");
        tennisGame.point("Player2");
        tennisGame.point("Player1");
        tennisGame.point("Player2");
        tennisGame.point("Player1");
        tennisGame.point("Player1");

        // Then
        assertEquals("player1-win", tennisGame.score());
    }

}