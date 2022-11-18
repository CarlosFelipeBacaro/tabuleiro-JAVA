package boardgame;

public class Board {
	
	private int rows; // linha
	private int columns; // colunas
	private Piece[][] pieces; // peças
	
	// criando construtor apenas com quantidade de linhas e colunas
	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		// estanciar a matriz de peças na quantidade de linhas e colunas (rows)(columns)
		pieces = new Piece[rows][columns]; 
	}
	// criande get e set apenas de rows e columns
	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	// criando métodos para retornar as peças e passando parâmetros de linhas e colunas sem ser o da variavel
	public Piece piece(int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[row][column];
	}
	// sobrecarga do método piece 
	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[position.getColumn()][position.getRow()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position" + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return piece(position) != null;
	}
}
