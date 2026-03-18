package Projekty.GUI.Cwiczenia.c2.Task02_01;

public
    class Initials
    implements TwoStringsOper{
    @Override
    public String apply(String s1, String s2) {
        return s1.charAt(0)+""+s2.charAt(0);
    }
}
