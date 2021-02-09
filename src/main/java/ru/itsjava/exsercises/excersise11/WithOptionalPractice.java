package ru.itsjava.exsercises.excersise11;

import ru.itsjava.init.UniversityInitializer;
import ru.itsjava.model.Student;

import java.util.List;
import java.util.Optional;

public class WithOptionalPractice {

    public static void main(String[] args) {
        List<Student> students = UniversityInitializer.initStudents();
        System.out.println(students);
        //Найти любого студента
        Student anyStudent = students.stream()
                .findAny()
                .get();
        System.out.println(anyStudent);

        //Найти первого студента
        Student firstStudent = students.stream()
                .findFirst()
                .get();
        System.out.println("firstStudent = " + firstStudent);

//        Найти имя любого студента,который учится на факультете programming
//        и возраст которого больше 18
        Student studentFound = students.stream()
                .filter(student -> student.getFaculty().getName().equals("Programming")
                        && student.getAge() > 18)
                .findAny()
                .get();
        System.out.println("studentFound = " + studentFound);

    }
}
