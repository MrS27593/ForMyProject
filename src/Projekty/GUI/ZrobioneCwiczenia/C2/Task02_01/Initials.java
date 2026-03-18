package FinalneMarcinaIMoje.Task02_01;

//Klasa Initials implementująca interfejs funkcyjny TwoStringsOper
abstract class Initials
        implements TwoStringsOper {
    //Przysłonięcie metody apply tak że zwraca pierwsze litery. Można tutaj wykorzystać substring lub charAt()
    @Override
    public String apply(String one, String two) {
        String a=one.substring(0,1);
        String b=two.substring(0,1);
        char c=one.charAt(0);
        char d=two.charAt(0);
        String e = ""+c+d;
        return e;
    }
}
