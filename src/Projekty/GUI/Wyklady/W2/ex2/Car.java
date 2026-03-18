package Projekty.GUI.Wyklady.W2.ex2;

//Publiczna klasa Car implementująca interfejs LandVehicle
public
    class Car
    implements LandVehicle {

    //prywatne pole obiektowe "distKM" typu int
    private int distKM;

    //Przysłonięcie metody "getDistanceKM" która normalnie pochodzi z interfejsu gdzie tam jest pusta. Teraz zwraca wartośc pola "distKM"
    @Override
    public int getDistanceKM() {
        return distKM;
    }

    //Wywołanie konstruktora bez argumentowego sprawia, że do pola  automatycznie przypisujemy wartość 10001
    public Car() {
        this.distKM = 10001;
    }
}
