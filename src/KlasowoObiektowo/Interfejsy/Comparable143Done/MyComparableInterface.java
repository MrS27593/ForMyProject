package KlasowoObiektowo.Interfejsy.Comparable143Done;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyComparableInterface {
    public static void main(String[] args) {

    }
}
class Person implements Comparable<Person>{

    String name;
    int age;
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return name+ "(" + age + ")";
    }
    @Override

    public int compareTo(Person o) {
        return Integer.compare(this.age,o.age);
    }

    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        peopleList.add(new Person("Przemek",26));
        peopleList.add(new Person("Magda",19));
        peopleList.add(new Person("Piotr",50));

        Collections.sort(peopleList);
        System.out.println(peopleList);


    }
}