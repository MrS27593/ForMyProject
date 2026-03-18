package FinalneMarcinaIMoje.Task04_01;

import java.util.Arrays;

class Person implements Comparable<Person>{

    private String name;

    private int age;

    private int pesel;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String toString(){
        return getName() + " " + getAge();
    }

    @Override
    public int compareTo( Person person ){
        if(person.getAge() < this.getAge())
            return 1;
        else if (person.getAge() > this.getAge())
            return -1;
        return 0;

    }

    //Tutaj gotowa metoda z JDK
    public static void sort(Person[] persons){
        Arrays.sort(persons);
    }


    //Tutaj metoda własna
    public static void sort2( Person[] personArray){
        for(int i = 0; i < personArray.length;i++){
            for(int j = 0; j < personArray.length - 1 - i; j++){
                //Sortowanie od najstarszego do najmłodszego
                if(personArray[j].compareTo(personArray[j+1])>0){
//                    Person tmp = personArray[j];
//                    personArray[j]=personArray[j+1];
//                    personArray[j+1]=tmp;
                    //sortowanie od najmłodszego do najstarszego
                } else if (personArray[j].compareTo(personArray[j+1])<0) {
                    Person tmp = personArray[j];
                    personArray[j]=personArray[j+1];
                    personArray[j+1]=tmp;
                    //jak tan sam wiek to bez znaczenia
                } else{
                    personArray[j]=personArray[j];
                    personArray[j+1]=personArray[j+1];
                }
            }
        }
    }
}
