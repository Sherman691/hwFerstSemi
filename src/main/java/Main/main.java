package Main;

import units.*;


import units.Person;

public class main {

    public static void main(String[] args) {
        firstSemi();
    }

    public static void firstSemi() {
//    Проанализировать персонажей
//    "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах".
//    Для каждого определить 8 полей данных(здоровье, сила итд)
//    3-4 поля поведения(методов атаковать, вылечить итд).
//    Создать абстрактный класс и иерархию наследников.
//    Расположить классы в пакет так, чтобы в основной программе небыло видно их полей.
//    В не абстрактных классах переопределить метод toString()
//    так чтобы он возвращал название класса или имя.
//    Создать в основной программе по одному обьекту каждого
//    не абстрактного класса и вывести в консоль его имя.

        peasant peasant = new peasant("Крестьянин");
        crossbowman crossbowman = new crossbowman("Арбалетчик");
        monk monk = new monk("Монах");
        robber robber = new robber("Разбойник");
        sniper sniper = new sniper("Снайпер");
        spearman spearman = new spearman("Копейщик");
        wizard wizard = new wizard("Колдун");
        System.out.println(peasant);
        System.out.println(crossbowman);
        System.out.println(monk);
        System.out.println(robber);
        System.out.println(sniper);
        System.out.println(spearman);
        System.out.println(wizard);

    }
}


