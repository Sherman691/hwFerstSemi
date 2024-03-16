package units;

import java.util.ArrayList;

public class sniper extends Person {
    static  String personClass = "Снайпер";
    public sniper(String name, int x, int y) {
        super(name,
                10,
                15,
                0,
                1,
                0,
                5,
                0,
                0,
                true,
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
