package KlasowoObiektowo.SlowaKluczowe.ClassDone;

 class Main {
     protected String name;

}
class Car{
     String marka;
    int rok;
    void jedz(){
        System.out.println("Samochód jedzie");
    }
    public Car(String m, int r){
        marka=m;
        rok=r;
    }
    public Car(){

    }

    public static void main(String[] args) {
        Car car = new Car();
        car.marka = "Toyota";
        car.rok=2020;
        car.jedz();
        Car car1 = new Car("Audi R8",2020);


        Main main = new Main();


    }
}

class Person{
     private String name;
     private int age;
     public Person(String name, int age){
         this.name=name;
         this.age=age;
     }


     public void przywitajSie(){
         System.out.println("Cześć mam na imię "+name);
    }

    public int getAge(){
         return age;
    }

    public void setAge(int age){
         assert age > 0;
        String string = "Wiek nie może być ujemny ";
        this.age=age;
    }

    public static void main(String[] args) {
        Person ja = new Person("Tomek ",25);
        ja.przywitajSie();
    }
}