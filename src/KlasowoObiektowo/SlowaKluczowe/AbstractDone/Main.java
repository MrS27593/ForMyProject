package KlasowoObiektowo.SlowaKluczowe.AbstractDone;

public class Main{
    public static void main(String[] args) {
        //Są trzy możliwości tworzenia referencji z wykorzystaniem klasy abstrakcyjnej
        //1. Tworzymy obiekt referencji do klasy pochodnej o konstruktorze pochodnej tak więc musimy napisać metodę
        Dziecko dziecko1 = new Dziecko("a",13,10) {
            @Override
            void giveASound() {
                System.out.println("ojoj");
            }
        };
        //2. Utworzenie klasy anonimowej z nadpisaniem metody
        Osoba osoba = new Osoba("a",10) {
            @Override
            void giveASound() {
                System.out.println("cześć");
            }
        };
        //3 Utworzenie referencji osoba1 do obiektu klasy Osoba i przypisanie wartości za pomocą konstruktora Dziecka
        Osoba osoba1 = new Dziecko("a",13,10);
        //osoba klasy anonimowej wywołuje giveSound ktore wyświetla cześć za pomocą nadpisanej metody
        System.out.println("1");
        osoba.giveASound();
        //osoba klasy anonimowej wywołuje say() ktore info o sobie.
        System.out.println("2");
        osoba.say();
        //dziecko1 jako referencja dziecka wywołuje say() które wyświetla to co w klasie Osoba, czyli info
        System.out.println("3");
        dziecko1.say();
        //osoba1 jako referencja Osoby wywołuje say() które wyświetla to co w klasie Osoba ,czyli info
        System.out.println("4");
        osoba1.say();
        //efekt jest ten sam obojętnie czy wywoła metodę dziecko, czy, osoba, bo jest to stała metoda
        //nienadpisywana z klasy Osoba
        //Wywołanie przez dziecko1 metody giveSound() które wyświetli to co jest nadpisane w klasie pochodnej
        System.out.println("5");
        dziecko1.giveASound();
        //Wywołanie przez dziecko1 metody giveSound() które wyświetli to co jest nadpisane w klasie pochodnej
        System.out.println("6");
        osoba1.giveASound();
        //do tej metody ma dostęp tylko dziecko1, bo jest referencja do dziecka
        System.out.println("7");
        dziecko1.dzieckoMet();
        //Utworzenie postaci o
        Character warior = new Warrior("WariorMax");
        Character wizard = new Wizard("WizzardGandalf");
        //Warior i Wizzard wywołują metodę move() która jest taka sama wyświetla ich imie i że się poruszają
        warior.move();
        wizard.move();
        //Teraz wywołują nadpisane metody abstrakcyjne
        warior.specialAbility();
        wizard.specialAbility();
    }
}

abstract class Osoba {
    String name;
    int age;
    void say(){
        System.out.println("Mam na imie "+name+" i mam "+age+" lat");
    }
    abstract void giveASound();
    public Osoba(String name, int age){
        this.name=name;
        this.age=age;
    }
}
/*
Każda klasa abstrakcyjna ma pola, normalne metody z ciałem i metodę abstrakcyjną bez ciała
 */
class Dziecko extends Osoba{
    int moc;
    @Override
    void giveASound() {
        System.out.println("Płaczę ");
    }
    public Dziecko(String s, int a, int moc){
        super("a",9);
        this.moc=moc;
    }
    public void dzieckoMet(){
        System.out.println("Jestem dzieckiem");
    }
}
//Abstrakcyjna klasa Charakter
abstract class Character {
    String name;
    Character(String name) {
        this.name = name;
    }
    void move() {
        System.out.println(name + " moves forward");
    }
    abstract void specialAbility();
}
class Wizard extends Character {
    Wizard(String name) {
        super(name);
    }
    @Override
    void specialAbility() {
        System.out.println(name + " casts a fireball!");
    }
}
class Warrior extends Character {
    Warrior(String name) {
        super(name);
    }
    @Override
    void specialAbility() {
        System.out.println(name + " swings a mighty sword!");
    }
}
