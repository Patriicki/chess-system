package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

// É uma subclasse da classe Piece
// se tornou uma classe abstrata para nao implementar os metodos de Piece
public abstract class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    // Diferencia as peças. Adversária ou do Oponente
    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p != null && p.getColor() != color;
    }
}
