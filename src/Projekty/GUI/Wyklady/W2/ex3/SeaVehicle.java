package Projekty.GUI.Wyklady.W2.ex3;


//Publiczny interfejs SeaVehicle
public
    interface SeaVehicle {

    //metoda "getDistanceMM"
    int getDistanceMM();

    //Metoda "startEngine". Tutaj użyte zostało default ale równie dobrze można by użyć static.
    default void startEngine(){

    }
}
