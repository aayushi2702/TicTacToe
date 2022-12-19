package com.tictcatoe.game.exceptions;

public class PositionOccupiedException extends RuntimeException {

	public PositionOccupiedException(String message) {
		super(message);
	}
}