package com.arolla.tennis;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TennisGameTest {

    @ParameterizedTest
    @MethodSource("providTestCaseAndExpectedResult")
    void sould_return_expected_param(int scoreP1, int scoreP2, String expected) {
        // Given
        TennisGame tennisGame;

        // When
        tennisGame = new TennisGame(scoreP1, scoreP2);

        // Then
        assertEquals(expected, tennisGame.score());

    }

    private static Stream<Arguments> providTestCaseAndExpectedResult() {
        return Stream.of(
                Arguments.of(1,0, "fifteen-love"),
                Arguments.of(1,1, "fifteen-all"),
                Arguments.of(1,2, "fifteen-thirty"),
                Arguments.of(1,3, "fifteen-forty"),
                Arguments.of(1,4, "player2-win"),

                Arguments.of(2,0, "thirty-love"),
                Arguments.of(2,1, "thirty-fifteen"),
                Arguments.of(2,2, "thirty-all"),
                Arguments.of(2,3, "thirty-forty"),
                Arguments.of(2,4, "player2-win"),

                Arguments.of(3,2, "forty-thirty"),
                Arguments.of(3,0, "forty-love"),

                Arguments.of(3,3, "deuce"),
                Arguments.of(4,4, "deuce"),
                Arguments.of(5,5, "deuce"),

                Arguments.of(4,3, "advantage-player1"),
                Arguments.of(5,4, "advantage-player1"),
                Arguments.of(6,5, "advantage-player1"),

                Arguments.of(3,4, "advantage-player2"),
                Arguments.of(4,5, "advantage-player2"),
                Arguments.of(5,6, "advantage-player2"),

                Arguments.of(5,3, "player1-win"),
                Arguments.of(6,4, "player1-win"),
                Arguments.of(7,5, "player1-win"),
                Arguments.of(7,0, "player1-win"),

                Arguments.of(3,5, "player2-win"),
                Arguments.of(4,6, "player2-win"),
                Arguments.of(5,7, "player2-win"),
                Arguments.of(0,7, "player2-win")

        );
    }

}