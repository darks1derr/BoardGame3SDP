package game;

public class MonopolyGame extends BoardGame {
    public MonopolyGame(GameRenderer renderer) {
        super(renderer);
    }

    @Override
    public void start() {
        renderer.renderBoard("Monopoly Square Track");
        renderer.renderPiece("Car Token", 0, 0);
        renderer.renderPiece("Hat Token", 10, 0);
    }
}