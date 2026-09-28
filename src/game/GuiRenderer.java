package game;

public class GuiRenderer implements GameRenderer {
    @Override
    public void renderBoard(String boardData) {
        System.out.println("[GUI Window] Drawing board graphics for: " + boardData);
    }

    @Override
    public void renderPiece(String piece, int x, int y) {
        System.out.println("[GUI Window] Drawing sprite " + piece + " at coordinates (" + (x * 32) + "px, " + (y * 32) + "px)");
    }
}