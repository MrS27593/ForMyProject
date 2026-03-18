package Projekty.GUI.Wyklady.W7.ex1;

public
class Main {

    public static void main(String[] args) {
        Operation operation = new Operation();

        Thread addThread = new Thread(
                () -> {
                    for(int i=0; i<10000; i++) {
                        operation.add();
                    }
                    System.out.println("addThread");
                }
        );

        Thread subThread = new Thread(
                () -> {
                    for(int i=0; i<10000; i++){
                        operation.sub();
                    }
                    System.out.println("subThread");
                }
        );

        addThread.start();
        subThread.start();

        try {
            addThread.join();
            subThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        operation.show();

    }

}