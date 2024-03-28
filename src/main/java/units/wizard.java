package units;

import java.util.ArrayList;

public class wizard extends Person {
    static  String personClass = "Волшебник";
    static int priority = 1;
    public wizard(String name, int x, int y) {
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
                y,
                priority);
    }
    @Override
    public String toString() {
        return "["+personClass+"] - "+  super.toString()+" ("+ position.toString()+")"+hp;
    }

    @Override
    public void step(ArrayList<Person> enemies, ArrayList<Person> friends) {

    }

    @Override
    public String getInfo() {
        return personClass;
    }
}
