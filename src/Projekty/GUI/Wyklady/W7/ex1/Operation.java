package Projekty.GUI.Wyklady.W7.ex1;

public
class Operation {

    private int counter = 0;

    public synchronized void add(){
        counter += 1;
    }

//    public void add(){
//        synchronized (this) {
//            counter += 1;
//        }
//    }

//    public void add(){
//        counter += 1;
//    }

    public synchronized void sub(){
        counter -= 1;
    }

    //    public void sub(){
//        synchronized (this) {
//            counter -= 1;
//        }
//    }
//    public void sub(){
//        counter -= 1;
//    }
    public void show(){
        System.out.println("\ncounter: "+counter);
    }
}