package boardgame;

public class Board {
	
	private int rows; // linha
	private int columns; // colunas
	private Piece[][] pieces; // peças
	
	// criando construtor apenas com quantidade de linhas e colunas
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		// estanciar a matriz de peças na quantidade de linhas e colunas (rows)(columns)
		pieces = new Piece[rows][columns]; 
	}
	// criande get e set apenas de rows e columns
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	// criando métodos para retornar as peças e passando parâmetros de linhas e colunas sem ser o da variavel
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	// sobrecarga do método piece 
	public Piece piece(Position position) {
		return pieces[position.getColumn()][position.getRow()];
	}
	
}
