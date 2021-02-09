package ru.itsjava.exsercises.excersise1;


import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalInterfacesPractice {


    public static void main(String[] args) {
        Runnable runnable = () ->
                System.out.println("Привет я лямбда");

        runnable.run();
        runnable.run();

        Predicate<Long> isNegative = (l) -> l < 0;

        System.out.println("isNegative.test(5L) = " + isNegative.test(5L));
        System.out.println("isNegative.test(-5L) = " + isNegative.test(-5L));
        System.out.println("isNegative.test(0L) = " + isNegative.test(0L));

        Predicate<Long> isPositive = l -> l > 0;

        //Написать свой предикат,
        //который проверяет является ли первый символ у строки числом
        //Воспользоваться Character.isDigit()

        Predicate<String> isNumber = str -> Character.isDigit(str.charAt(0));
        System.out.println("isNumber.test(\"1Hello\") = " + isNumber.test("1Hello"));
        System.out.println("isNumber.test(\"Hello\") = " + isNumber.test("Hello"));

        BiFunction<Integer, Integer, Integer> sum = (num1, num2) -> num1 + num2;
        BinaryOperator<Integer> sumBinaryOperator = (num1, num2) -> num1 + num2;
        System.out.println("sum.apply(5,4) = " + sum.apply(5, 4));
        System.out.println("sum.apply(5,4) = " + sumBinaryOperator.apply(5, 4));


        //Написать свой оператор разности для типа int

        BinaryOperator<Integer> dif = (num1, num2) -> num1 - num2;
        System.out.println("dif.apply(5,4) = " + dif.apply(5,4));

        //home
    }
}
