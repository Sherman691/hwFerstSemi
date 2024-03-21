package units;

import Main.ActionInterfase;
import Main.Position;

import java.util.ArrayList;

import static java.lang.Integer.MAX_VALUE;


public abstract class Person implements ActionInterfase {
    protected int hp;
    protected int armor;
    protected int damage;
    protected String name;
    protected int maxHp;
    protected int luck;
    protected int strenge;
    protected int agil;
    protected int intellect;
    protected boolean inGame;
    protected Position position;
    public int priority;


    public Person(String name,
                  int hp,
                  int maxHp,
                  int armor,
                  int luck,
                  int damage,
                  int strenge,
                  int agil,
                  int intellect,
                  boolean inGame,
                  int x,
                  int y,
                  int priority) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.armor = armor;
        this.luck = luck;
        this.damage = damage;
        this.strenge = strenge;
        this.agil = agil;
        this.intellect = intellect;
        this.inGame = inGame;
        position = new Position(x, y);
        this.priority = priority;
    }


    @Override
    public String toString() {
        return name;
    }

    public void setPosition(int x, int y) {
        position.setX(x);
        position.setY(y);
    }

    /**
     * Дистанция до target
     * @param target
     * @return
     */
    public int distanceTo(Person target) {
        return (int) Math.sqrt(Math.pow(position.getX() - target.position.getX(), 2) + Math.pow(position.getY() - target.position.getY(), 2));
    }



}