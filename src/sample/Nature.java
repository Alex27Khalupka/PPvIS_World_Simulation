package sample;

public class Nature {
    private boolean alive;
    private int posX;
    private int posY;

    public boolean isAlive(){
        return this.alive;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
