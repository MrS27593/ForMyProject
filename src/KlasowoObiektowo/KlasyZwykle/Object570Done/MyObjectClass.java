package KlasowoObiektowo.KlasyZwykle.Object570Done;

public class MyObjectClass {
    public static void main(String[] args) {

    }
}

class Person{
    private String name;

    public Person(String name){
        this.name=name;
    }

    public String toString(){
        return "Osoba "+name;
    }

    public boolean equals(Object object){
        if(this==object) return true;
        if(object == null || getClass() != object.getClass()) return false;
        Person other = (Person) object;
        return this.name.equals(other.name);
    }

    public int hashCode(){
        return this.name.hashCode();
    }
}
