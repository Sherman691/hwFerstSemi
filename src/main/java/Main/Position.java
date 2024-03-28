package Main;

import java.net.CookieHandler;

public class Position {

    private int curX;
    private int curY;

    private int widht = 10;
    private int height = 10;

    public Position(int x, int y) {
        curX = x;
        curY = y;
    }

    public void setXY(int x, int y) {
        curY = y;
        curX = x;
    }
    public int getX() {
        return curX;
    }

    public int getY() {
        return curY;
    }


    public void setCurY(int curY) {
        this.curY = curY;
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
    public Position getDelta(Position target){
        return  new Position(target.getX() - getX(),
                            target.getY() - getY());
    }
    public boolean check  (Position pt){

        return curX == pt.curX && curY == pt.curY;
    }

    public void add(int dX, int dY) {
        curX += dX;
        curY += dY;
    }


}
