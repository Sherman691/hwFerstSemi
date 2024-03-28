package units;

import Main.Position;

import java.util.ArrayList;
import java.util.Random;

public class spearman extends Person {
    static String personClass = "Копейщик";
    static int priority = 2;

    public spearman(String name, int x, int y) {
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

    @Override
    public String toString() {
        return "[" + personClass + "] - " + super.toString() + " (" + position.toString() + ")";
    }

    private void attack(Person enemy) {
        int dealingDamage = damage;
        luck = new Random().nextInt(100);
        if (luck <= 30) {
            dealingDamage = damage * 2;
        }
        enemy.hp -= dealingDamage;
//        System.out.println("наносит"+dealingDamage);

    }

    private void move(Person toEnemy, ArrayList<Person> friends) {
        Position delta = position.getDelta(toEnemy.position);
        Position newPos = new Position(position.getX(), position.getY());
        int dX = delta.getX();
        int dY = delta.getY();
        if (dX!=0){
            dX = Math.abs(dX)/dX;
        }
        if (dY!=0){
            dY = Math.abs(dY)/dY;
        }
        if (dX != 0 && dY !=0){
            dY=0;
        }
        newPos.add(dX,dY);
        for (Person p : friends){
            if(p.position.check(newPos))


                return;
        }
        position = newPos;
//        System.out.println(position);
    }

    @Override
    public void step(ArrayList<Person> targetEnemies, ArrayList<Person> targetFriends) {

        Person target = this.searchOpponents(targetEnemies);
        if (hp <= 0 || target == null) {
            return;
        }
        if (distanceTo(target) <= 2) {
            attack(target);
        } else {
            move(target, targetFriends);
        }

    }

    @Override
    public String getInfo() {
        return personClass;

    }
}
