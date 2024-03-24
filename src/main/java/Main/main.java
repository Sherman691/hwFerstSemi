package Main;

import units.*;


import java.util.ArrayList;
import java.util.Random;

public class main {

    public static void main(String[] args) {

        PrintTeam();
    }



    public static void secondSemi_CreateTeam(ArrayList<Person> team, int number, int start) {
//        Создать две команды по 10 человек.
//        Первая команда: крестьянин, волшебник, арбалетчик, копейщик.
//        Вторая: крестьянин, снайпер, монах и вор.
//        Каждому задать случайное имя и вывести в консоль.
//        Добавить в проект класс, предназначенный для хранения координат.
//        Добавить в абстрактный класс поле, экземпляр класс координат.
//        Пробросить координаты через конструкторы наследников так, чтобы создавая объекты вы передавали в параметрах имя и аоординаты.
//        Скорректировать алгоритм заполнения комманд.
//        Кроме имён каждый персонаж должен иметь координаты.
//        Одна комманда находится с левой стороны другая с правой(у=0 и у=9).
//        В класс лучников добавить метод поиск ближайшего противника.
//        Алгоритм расчёта расстояний реализовать в классе координат.
        while (--number >=0){
            int n = start + new Random().nextInt(4);
            switch (n){
                case 0:
                    team.add(new crossbowman(getName(),0, number));
                    break;
                case 1:
                    team.add(new monk(getName(),0, number));
                    break;
                case 2:
                    team.add(new spearman(getName(),0, number));
                    break;
                case 3:
                    team.add(new peasant(getName(), start*3, number));
                    break;
                case 4:
                    team.add (new robber(getName(),9, number));
                    break;
                case 5:
                    team.add (new sniper(getName(),9, number));
                    break;
                case 6:
                    team.add (new wizard(getName(),9, number));
                    break;

            }
        }

    }
    private static void PrintTeam(){
        ArrayList<Person> red = new ArrayList<>();
        ArrayList<Person> blue = new ArrayList<>();
        ArrayList<Person> all = new ArrayList<>();
        secondSemi_CreateTeam(red,10, 0);
        secondSemi_CreateTeam(blue,10, 3);
        all.addAll(red);
        all.addAll(blue);
        all.sort(new PrioritySort());
        for (int i = 0; i <10; i++) {
            System.out.println("Ход: " + i);
            System.out.println();

            for (Person p : all) {
                System.out.println(p + " делает ход.");
                if (red.contains(p)) {
                    p.step(blue, red);
                } else {
                    p.step(red, blue);
                }
            }
        }
    }

    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
}


