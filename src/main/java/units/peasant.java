package units;

import java.util.Random;


public class peasant extends Person {
    static  String personClass = "Крестьянин";

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
                y);
    }
    @Override
    public String toString() {
        return "["+personClass+"] - "+  super.toString()+" ("+ position.toString()+")";
    }
}
