package ru.itsjava.exsercises.excersise5;

import ru.itsjava.init.UniversityInitializer;
import ru.itsjava.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapPractice {

    public static void main(String[] args) {
        //из списка студентов вернуть список имен
        List<Student> students = UniversityInitializer.initStudents();
        System.out.println(students);

        List<String> names = students.stream()
                .map(student -> student.getName())
                .collect(Collectors.toList());

        System.out.println(names);

    }
}
