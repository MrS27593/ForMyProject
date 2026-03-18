package Projekty.GUI.Cwiczenia.c2.Task02_01;

public
    class Separ
    implements TwoStringsOper {

    private String separ;
    public Separ(String s) {
        this.separ = s;
    }

    @Override
    public String apply(String s1, String s2) {
        return s1 + separ + s2;
    }
}
