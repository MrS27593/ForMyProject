package Projekty.GUI.Wyklady.W6.ex2;

//Publiczna klasa MyOperation która dziedziczy po Thread
public
    class MyOperation
    extends Thread{

    //Publiczne statyczne pole "counter" typu int
    public static int counter = 0;
    //Prywatne statyczne, finalne pole "flag" typu Ocject
    private static final Object flag = new Object();

    //Prywatne pole "ch" typu char
    private char ch;

    //Konstruktor przypisujący argument do pola "ch"
    public MyOperation(char ch) {
        this.ch = ch;
    }

    @Override
    public void run() {
        //Wywołanie 10000 razy
        for (int i = 0; i < 10000; i++)
            //Za pomocą switch rozpoatrujemy dwa przypadki
            switch (ch) {
                //Przypadek kiedy podamy +
                case '+' -> {
                    synchronized (flag) {
                        counter += 1;
                    }
                }
                //Przypadek kiedy podamy -
                case '-' -> {
                    synchronized (flag) {
                        counter -= 1;
                    }
                }
            }

        System.out.println(ch + " " + counter);

    }
}
