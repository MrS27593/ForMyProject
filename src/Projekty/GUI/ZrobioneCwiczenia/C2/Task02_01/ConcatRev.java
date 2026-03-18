package FinalneMarcinaIMoje.Task02_01;

//Klasa "ConcatRev" która implementuje interfejs funkcyjny TwoStringsOper
abstract class ConcatRev implements
        TwoStringsOper {
    //Przysłonięta metoda apply zwraca podobnie jak Concat tylko z zamienioną kolejnością. Metota concat lub prostu ze znakiem konkatenacji czyli +
    @Override
    public String apply(String one, String two) {
        String concatedRev=two.concat(one);
        String concatedRev2=two+one;
        return concatedRev;
    }
}
