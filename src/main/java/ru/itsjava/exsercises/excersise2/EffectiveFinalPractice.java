package ru.itsjava.exsercises.excersise2;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class EffectiveFinalPractice {

    public static void main(String[] args) {
        String name = "Виталий";
        name = "Виталик";

        final String name2 = name;
        Consumer<Integer> printBestPerson =
                (age) -> System.out.println(name2 + ":" + age);

        printBestPerson.accept(30);

        final String positive = "Число положительно";
        Predicate <Integer> isPositive1 = num -> num > 0;
//       Consumer <Integer> isPositive = (num>0) -> System.out.println(positive);

        // Задать переменную типа String в которой храним значение "Число положительно"
        // Написать свой предикат, который пишет фразу из переменной
        // и возвращает true/false, если число >0, если число больше нуля

//home
    }
}
//Переменные переданные в лямбды должна быть final или effective final
//Лямбды оперируют значениями!!! (а не переменными)