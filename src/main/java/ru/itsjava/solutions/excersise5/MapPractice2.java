package ru.itsjava.solutions.excersise5;

import ru.itsjava.init.UniversityInitializer;
import ru.itsjava.model.Student;

import java.util.List;
import java.util.stream.Collectors;

public class MapPractice2 {

    public static void main(String[] args) {
        List<Student> students = UniversityInitializer.initStudents();

        List<String> names = students.stream()
                .map(student -> student.getName().toUpperCase())
                .collect(Collectors.toList());

        System.out.println(names);
    }
}
//Внутри map у нас функциональный интерфейс Function