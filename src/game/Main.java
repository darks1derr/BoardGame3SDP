package game;

public class Main {
    public static void main(String[] args) {
        GameRenderer consoleRenderer = new ConsoleRenderer();
        GameRenderer guiRenderer = new GuiRenderer();

        BoardGame chess = new ChessGame(consoleRenderer);
        chess.start();

        System.out.println("--- Switching renderer at runtime ---");
        chess.setRenderer(guiRenderer);
        chess.start();

        System.out.println("-------------------------------------");

        BoardGame monopoly = new MonopolyGame(guiRenderer);
        monopoly.start();

        System.out.println("--- Switching renderer at runtime ---");
        monopoly.setRenderer(consoleRenderer);
        monopoly.start();
    }
}