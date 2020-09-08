package chess;

import boardGame.Board;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
	}

	public chessPiece[][] getPieces() {
		chessPiece[][] piece = new chessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				piece[i][j] = (chessPiece) board.piece(i, j);
			}
		}
		return piece;
	}

}
