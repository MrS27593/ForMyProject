package Projekty.GUI.Wyklady.W2.ex3;



//Publiczna klasa Amphibian która implementuje dwa interfejsy, LandVehicle i SeaVehicle
public
    class Amphibian
    implements LandVehicle, SeaVehicle {

    //Prywatne pole typu int o nazwie distKM
    private int distKM;

    //Prywatne pole distMM o typie int
    private int distMM;

    //zaimplementowanie metody getDistanceKM z Interfejsu LandVehicle która zraca pole distKM
    @Override
    public int getDistanceKM() {
        return distKM;
    }

    //zaimplementowanie metody getDistanceKM z Interfejsu LandVehicle która zraca pole distKM
    @Override
    public int getDistanceMM() {
        return distMM;
    }

    //Zaimplementowanie metody "startEngine" która to wywołuje bazową metodę startEngine która to pochodzi z Interfejsu LandVehicle
    @Override
    public void startEngine() {
        LandVehicle.super.startEngine();
    }
}
