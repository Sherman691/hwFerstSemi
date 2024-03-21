package units;

import java.util.ArrayList;
import java.util.Random;


public class peasant extends Person {
    static  String personClass = "Крестьянин";
    static int priority = 0;

    public peasant(String name, int x, int y) {
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
        return "["+personClass+"] - "+  super.toString()+" ("+ position.toString()+")";
    }


    @Override
    public void step(ArrayList<Person> target) {

    }
}
