package FinalneMarcinaIMoje.Task03_02;

interface Func {

    double apply(double x);

    static Func compose(Func f, Func g) {
        return x ->{                        //jeden argument nie trzeba nawiasow
            return  f.apply(g.apply(x));
        } ;
    }

}