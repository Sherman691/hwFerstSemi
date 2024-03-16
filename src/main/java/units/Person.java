package units;

import Main.Position;

public abstract class Person {
    protected int hp = 10;
    protected int armor = 0;
    protected int damage = 0;
    protected String name;
    protected int maxHp;
    protected int luck;
    protected int strenge;
    protected int agil;
    protected int intellect;
    protected boolean inGame;
    protected Position position;

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
                  int y) {
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
    }


    @Override
    public String toString() {
        return name;
    }

    public void setPosition(int x, int y) {
        position.setX(x);
        position.setY(y);
    }

    public int distatnseTo(Person target) {
        return (int) Math.sqrt(Math.pow(position.getX() - target.position.getX(), 2) + Math.pow(position.getY() - target.position.getY(), 2));
    }
}