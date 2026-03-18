package Projekty.GUI.Cwiczenia.c2.ex1;

public
    class Main
    extends MyActionAdapter {

    public static void main(String[] args) {
        Main m = new Main();
// nie ladnie
        m.addMyAction(
                new MyAction() {
                    @Override
                    public void action1() {
                        System.out.println("AnonMyAction.action1()");
                    }

                    @Override
                    public void action2() {
                        System.out.println("AnonMyAction.action2()");
                    }

                    @Override
                    public void action3() {
                        System.out.println("AnonMyAction.action3()");
                    }

                    @Override
                    public void action4() {
                        System.out.println("AnonMyAction.action4()");
                    }

                    @Override
                    public void action5() {
                        System.out.println("AnonMyAction.action5()");
                    }
                }
        );

        m.addMyAction(
            new MyActionAdapter(){
                @Override
                public void action1() {
                    super.action1();
                    System.out.println("AnonMyActionAdapter: jestem tutaj");
                }
            }
        );
        m.addMyAction(m);
        m.myLoop();
    }

    private MyAction[] myAction;
    private int actionCount;

    public Main() {
        this.myAction = new MyAction[10];
        this.actionCount = 0;
        this.addMyAction(this);
    }

    public void addMyAction(MyAction myAction){
        this.myAction[actionCount++] = myAction;
    }
    public void myLoop(){
        for(int i=0; i<10; i++){
            int rnd = 1 + (int)(Math.random()*5);
            System.out.println("Main.myLoop() -> i:"+i+"\trnd:"+rnd);
            switch (rnd){
                case 1 -> {
                    for(int j=0; j<actionCount; j++)
                        myAction[j].action1();
                }
                case 2 -> {
                    for(int j=0; j<actionCount; j++)
                        myAction[j].action2();
                }
                case 3 -> {
                    for(int j=0; j<actionCount; j++)
                        myAction[j].action3();
                }
                case 4 -> {
                    for(int j=0; j<actionCount; j++)
                        myAction[j].action4();
                }
                case 5 -> {
                    for(int j=0; j<actionCount; j++)
                        myAction[j].action5();
                }
            }
        }
    }

    @Override
    public void action2() {
        super.action2();
        System.out.println("Main przeslanieta metoda Main.acion2()");
    }
}