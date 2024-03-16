package Main;

public class Position {
    private int curX;
    private int curY;

    private int widht;
    private int height;

    public Position(int x, int y) {
        curX = x;
        curY = y;
        widht = 10;
        height = 10;
    }

    public int getX() {
        return curX;
    }

    public int getY() {
        return curY;
    }
    public  void setX (int x){curX = x;}
    public  void setY (int y){curY = y;}

    public boolean isMove(int x, int y) {
        return x >= 0 && x < widht && y >= 0 && y < height;
    }

    public void moveTo(int dx, int dy) {
        if (isMove(curX + dx, curY + dy)) {
            curX += dx;
            curY += dy;
        }
    }

    @Override
    public String toString() {
        return curX + ":" + curY;
    }
}
