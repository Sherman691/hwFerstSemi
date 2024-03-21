package units;

import java.util.ArrayList;
import java.util.Random;

public class sniper extends Person {
    static String personClass = "Снайпер";
    static int priority = 3;
    static int arrows = 10; // Колличество стрел
    static int effectiveDistance = 5; // "От" дистанция нанесения эффективного урона

    public sniper(String name, int x, int y) {
        super(name,
                10,
                15,
                0,
                1,
                3,
                5,
                0,
                0,
                true,
                x,
                y,
                priority);
    }

    public Person searchOpponents(ArrayList<Person> enemy) {
        Person target = null;
        int distance = Integer.MAX_VALUE;
        for (Person p : enemy) {
            if (p.distanceTo(this) < distance) {
                distance = p.distanceTo(this);
                target = p;
            }
        }
        return target;
    }

    @Override
    public String toString() {
        return "[" + personClass + "] - " + super.toString() + " (" + position.toString() + ")";
    }

    /**
     * Выcтрел в противника
     *
     * @param enemy противник
     */
    private void shot(Person enemy) {
        System.out.println("Стреляет по -> "+ enemy);
        arrows--;
        luck = new Random().nextInt(100);
        if(luck <25){
            arrows++;
        }

        int distance = distanceTo(enemy);
        int dealingDamage = damage;
        if (distance < effectiveDistance) {
            dealingDamage *=0.5;
        } else {
            dealingDamage *=2;
        }
        System.out.println("(урон = "+ dealingDamage+")");
    }

    @Override
    public void step(ArrayList<Person> targetEnemies) {
        if (hp <= 0 || arrows <= 0) {
            if (arrows <= 0) {
                System.out.println(name + " - кончились стрелы");
            }
            return;
        }
        Person target = this.searchOpponents(targetEnemies);
        if (target != null) {
            shot(target);
        }
    }
}
