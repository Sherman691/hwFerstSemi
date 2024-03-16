package units;

import java.util.ArrayList;
import java.util.Random;

public class crossbowman extends Person {
    static  String personClass = "Арбалетчик";
    static int agil = new Random().nextInt(20,51);
    static int strenge = new Random().nextInt(5,11);
    static int intellect = 0;
    static int luck = new Random().nextInt(10,51);
    static int hp = 10 + strenge;
    static int maxHp = hp;
    static int armor= 1+(agil/5);
    static int damage = 1 + agil;
    static boolean inGame = true;
    public crossbowman(String name, int x, int y ) {
        super(name,
                hp,
                maxHp,
                armor,
                luck,
                damage,
                strenge,
                agil,
                intellect,
                inGame,
                x,
                y);
    }

    public  Person searchOpponents(ArrayList<Person> enemy){
        Person target = null;
        int distance = Integer.MAX_VALUE;
        for (Person p : enemy){
            if (p.distatnseTo(this) < distance){
                distance = p.distatnseTo(this);
                target = p;
            }
        }
        return target;
    }

    @Override
    public String toString() {
        return "["+personClass+"] - "+  super.toString()+" ("+ position.toString()+")";
    }
}
