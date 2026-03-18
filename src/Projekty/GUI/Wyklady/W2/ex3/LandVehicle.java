package Projekty.GUI.Wyklady.W2.ex3;


//Publiczny interfejs "LandVehicale"
public
    interface LandVehicle {

    //Metoda "getDistanceKM" zwracająca inta, bez ciała. Jest to metoda funkcyjna, a cały interfejs jest interfejsem funkcyjnym
    int getDistanceKM();

    // nicniezwracająca metoda "startEngine" która wyświetla komunikat "check engine" jeśli metoda "getDistanceKM" zwróci większą liczbę niż 10000
    default void startEngine(){
        if( getDistanceKM() > 10000)
            System.out.println(
                "check engine"
            );
    }
}
