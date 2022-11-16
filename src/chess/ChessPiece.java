package chess;

import boardgame.Board;
import boardgame.Piece;

// peças de xadrez
// como tem um construtor na classe Piece terá que fazer um construtor para essa tambem
public class ChessPiece extends Piece{
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	// não posso deixar o set por que não poderá ser modificada a cor de uma peça ela poderá ser simplesmente acessado pelo get
	public Color getColor() {
		return color;
	}
	
	
}
