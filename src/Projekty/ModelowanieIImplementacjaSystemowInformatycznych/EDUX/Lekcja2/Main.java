package Projekty.ModelowanieIImplementacjaSystemowInformatycznych.EDUX.Lekcja2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Jackob",2998);
        System.out.println(employee);
    }
}
class Employee{
    private static List<Employee> extent = new ArrayList<>();
    private double salary;
    private String name;
    public Employee (String name, double salary){
        this.salary = salary;
        this.name = name;
        extent.add(this);
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String toString(){
        return String.format("Emp %s sal: %s", getName(), getSalary());
    }
}