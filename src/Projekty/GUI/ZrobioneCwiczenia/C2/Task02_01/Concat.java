package FinalneMarcinaIMoje.Task02_01;

abstract class Concat
        implements TwoStringsOper {
    @Override
    public String apply(String one, String two) {
        String concated=one.concat(two);
        String concated2=one+two;
        return concated;
    }
}
