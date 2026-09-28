package game;

public class ChessGame extends BoardGame {
    public ChessGame(GameRenderer renderer) {
        super(renderer);
    }

    @Override
    public void start() {
        renderer.renderBoard("8x8 Chessboard");
        renderer.renderPiece("White King", 4, 0);
        renderer.renderPiece("Black Queen", 3, 7);
    }
}