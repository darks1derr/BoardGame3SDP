package game;

public class ConsoleRenderer implements GameRenderer {
    @Override
    public void renderBoard(String boardData) {
        System.out.println("[Console] Rendering board: " + boardData);
    }

    @Override
    public void renderPiece(String piece, int x, int y) {
        System.out.println("[Console] Piece " + piece + " placed at (" + x + ", " + y + ")");
    }
}