package KlasowoObiektowo.Interfejsy.ToDoubleFunction50;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleFunction;

public class Main {
    public static void main(String[] args) {

    }
}

class Student{
    String name;
    double grade;
    public Student(String name, double grade){
        this.name=name;
        this.grade=grade;
    }


    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(new Student("Ala",4.5),
                new Student("Jan",3.9),
                new Student("Ola",5.0));

        double countOfGrades = studentList.stream().map( student -> student.grade).count();
        System.out.println(countOfGrades);

        System.out.println();

        ToDoubleFunction<String> result = s -> s.length();
        System.out.println(result.applyAsDouble("OCeny"));

        System.out.println();

        double averageGrade = studentList.stream().mapToDouble(student ->student.grade).average().orElse(0.0);
        System.out.println(averageGrade);
    }
}
