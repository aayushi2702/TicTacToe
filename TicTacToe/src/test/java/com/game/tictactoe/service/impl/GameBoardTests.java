package com.game.tictactoe.service.impl;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.tictactoe.game.enums.Player;
import com.tictactoe.game.enums.Position;
import com.tictactoe.game.service.impl.GameBoard;

@RunWith(MockitoJUnitRunner.class)
public class GameBoardTests {
	
	private GameBoard gameBoard;

    @Before
    public void setUp() {
        gameBoard = new GameBoard();
    }

	@Test
	public void shouldSaveInputValueOnGameBoard() {
		gameBoard.setPlayerInPosition(Position.TWO, Player.X);
		assertThat(gameBoard.getPlayerInPosition(Position.TWO)).isEqualTo(Player.X.getValue());
	}

	@Test
	public void getCountPositionsOccupiedOnGameBoard() {
		assertThat(gameBoard.getCountOfPositionsOccupied()).isZero();
	}
	
	@Test
    public void checkFirstRowOccupiedBySamePlayer() {
        gameBoard.setPlayerInPosition(Position.ONE, Player.X);
        gameBoard.setPlayerInPosition(Position.FIVE, Player.O);
        gameBoard.setPlayerInPosition(Position.TWO, Player.X);
        gameBoard.setPlayerInPosition(Position.NINE, Player.O);
        gameBoard.setPlayerInPosition(Position.THREE, Player.X);
        assertThat(gameBoard.isFirstRowOccupiedBySamePlayer()).isTrue();
    }
}