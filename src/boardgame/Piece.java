package boardgame;

public class Piece {
	protected Position position;// posição
	private Board board;// a classe board vai ter uma associação com a classe position
	/*criando construtores e passando apenas o tabuleiro(Board) na hora de criar a peça(piece)
	 * por que a posição de uma peça recem criada vai ser inicialmente nula dizendo que essa peça
	 * não foi colocada no tabuleiro ainda */
	public Piece(Board board) {// para criar uma peça eu tenho qeu informar o board(tabuleiro)
		this.board = board;
		position = null;
	}
	// criando somente o get do tabuleiro por que eu não quero que ele seja alterado com o set 
	// somente classes e sub classes do mesmo pacote vai pode acessar o meu tabuleiro por conta do (protected) 
	protected Board getBoard() {
		return board;
	}
	
	
	
}
