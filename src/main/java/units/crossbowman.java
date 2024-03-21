package units;

import Main.Position;

import java.util.ArrayList;
import java.util.Random;

public class crossbowman extends Person {
    static String personClass = "Арбалетчик"; // Класс
    static  int priority = 3;
    static int agil = new Random().nextInt(5, 11); // Ловкость
    static int strenge = new Random().nextInt(5, 11); // Сила
    static int intellect = 0; // Интелект
    static int luck; // Удача
    static int hp = 10 + strenge; // Здоровье
    static int maxHp = hp; // Максимальное здоровье
    static int armor = 1 + (agil / 5); // Броня
    static int damage = 1 + agil; // Урон
    static boolean inGame = true;
    static int arrows = 10; // Колличество стрел
    static int effectiveDistance = 5; // "До" дистанция нанесения эффективного урона



    public crossbowman(String name, int x, int y) {
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
                y,
                priority);
    }

    /**
     * Поиск ближайшего противника
     *
     * @param enemy массив с противниками
     * @return
     */
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
     * @param enemy противник
     */
    private void shot(Person enemy) {
        System.out.println("Стреляет по -> "+ enemy);
        arrows--;

        int distance = distanceTo(enemy);
        int dealingDamage = damage;
        if (distance > effectiveDistance) {
            luck = new Random().nextInt(100);
            if (luck < 30) {
                dealingDamage *= 2;
            } else {
                dealingDamage *= 0.5;
            }
        } else {
            dealingDamage *=  2;
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
