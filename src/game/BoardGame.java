package game;

public abstract class BoardGame {
    protected GameRenderer renderer;

    public BoardGame(GameRenderer renderer) {
        this.renderer = renderer;
    }

    public void setRenderer(GameRenderer renderer) {
        this.renderer = renderer;
    }

    public abstract void start();
}