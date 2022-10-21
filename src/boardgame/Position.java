package boardgame;

public class Position {
	private int row; // linha
	private int column; // coluna
	// construtores
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}
	// criando os gets e seters
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	// criando toString
	@Override
	public String toString() {
		return row + "," + column;
	}
	
	
	
	
	
	
}
