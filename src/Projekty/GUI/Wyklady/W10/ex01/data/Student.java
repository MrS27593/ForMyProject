package Projekty.GUI.Wyklady.W10.ex01.data;

public
    class Student {

    private String name;
    private String surname;
    private int sNumber;

    public Student(String name, String surname, int sNumber) {
        this.name = name;
        this.surname = surname;
        this.sNumber = sNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getsNumber() {
        return sNumber;
    }
}
