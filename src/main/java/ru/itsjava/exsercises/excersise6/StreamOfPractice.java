package ru.itsjava.exsercises.excersise6;

import ru.itsjava.init.UniversityInitializer;
import ru.itsjava.model.Student;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOfPractice {

    public static void main(String[] args) {
        //объединить 2 списка целых чисел
        Stream<Integer> integerStream1 = Stream.of(1, 2);
        Stream<Integer> integerStream2 = Stream.of(3, 4);

        List <Integer> numbers = Stream.concat(integerStream1, integerStream2)
                .collect(Collectors.toList());
        System.out.println("numbers = " + numbers);


    }
}
