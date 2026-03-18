package FinalneMarcinaIMoje.Task03_01;

public class Main {


    public static void main(String[] args) {

        Parabola parabola1=new Parabola(1,-1,-5.0/4.0);
        double parabola1Result = FunDD.xminim(parabola1,0,1);
        System.out.println(parabola1Result);


////////////////////////////////////////////////////

        Parabola p = new Parabola(1, 1, -2);


        FunDD f = (x) -> {
            double y;
            double z;
            y = FunDD.xminim(p, 0, 2);
            z=p.fun(x);
            return z;
        };


//////////////////////////////////////////////////////

        FunDD pp = new FunDD () {
            @Override
            public double fun(double x) {
                return   Math.sqrt(Math.pow(x-0.75,2) + 1);
            }
        };

        System.out.println(FunDD.xminim(pp,0,2));


/////////////////////////////////////////////////////

        FunDD lamdba = x -> Math.pow(x,2)*(x-2);

        System.out.println(FunDD.xminim(a->Math.pow(a,2)*(a-2),0,2)); //opcja 1

        System.out.println(FunDD.xminim(lamdba,0,2)); //opcja 2


    }
}
