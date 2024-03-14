package units;

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

    public Person(String name, int hp,
                  int maxHp, int armor, int luck,
                  int damage, int strenge, int agil,
                  int intellect, boolean inGame) {
        this.name = name;
        this.hp = hp+strenge;
        this.maxHp = hp+strenge;
        this.armor = armor+agil;
        this.luck = luck;
        this.damage = damage;
        this.strenge = strenge;
        this.agil = agil;
        this.intellect = intellect;
        this.inGame = true;
    }



    @Override
    public String toString() {
        return name;
    }
}