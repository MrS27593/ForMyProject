package Projekty.GUI.Cwiczenia.c4.Task04_01;

public
    class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person("+name+" "+getAge()+")";
    }

    public int compareTo(Person p){
        return this.age - p.age;
    }

    public static void sort(Person[] data){
        for(int i = 0; i < data.length-1; i++){
            int minInd = i;
            for(int j = i + 1; j < data.length; j++)
                if(data[minInd].compareTo(data[j]) > 0)
                    minInd = j;

            Person tmp = data[minInd];
            data[minInd] = data[i];
            data[i] = tmp;
        }
    }
}
