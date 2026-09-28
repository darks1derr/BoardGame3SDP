package game;

public interface GameRenderer {
    void renderBoard(String boardData);
    void renderPiece(String piece, int x, int y);
}