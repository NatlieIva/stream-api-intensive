package ru.itsjava.exsercises.excersise7;

import ru.itsjava.init.UniversityInitializer;
import ru.itsjava.model.Student;

import java.util.Comparator;
import java.util.List;

public class MinMaxPractice {

    public static void main(String[] args) {
        List<Student> students = UniversityInitializer.initStudents();
        System.out.println(students);

//        Найти студента с наименьшим возрастом

        Student student1 = students.stream()
                .min(Comparator.comparing(student -> student.getAge()))
                .get();

        System.out.println(student1);


        //Найти студента с наибольшим возрастом

        Student student2 = students.stream()
                .max(Comparator.comparing(student -> student.getAge()))
                .get();
        System.out.println("student2 = " + student2);
    }
}