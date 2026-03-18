//package Projekty.GUI.Wyklady.W13.ex03;
//
//import javafx.concurrent.Task;
//import javafx.concurrent.Worker;
//
//import java.util.concurrent.atomic.AtomicBoolean;
//
//public
//    class MyWorker {
//
//    public Worker<String> worker;
//    public AtomicBoolean shouldThrow = new AtomicBoolean();
//
//    public MyWorker() {
//        this.worker = new Task<String>() {
//            @Override
//            protected String call() throws Exception {
//                final int total = 250;
//
//                updateTitle("MySimpleTask");
//                updateMessage("Starting ...");
//                updateProgress( 0, total);
//
//                Thread.sleep(3000);
//
//                for(int i=0; i<=total; i++){
//                    Thread.sleep(20);
//                    System.out.print(".");
//                    if(shouldThrow.get())
//                        throw new RuntimeException(
//                            "Exception @ "+System.currentTimeMillis()
//                        );
//
//                    updateTitle("MySimpleTask (" + i +")");
//                    updateMessage("Progress "+ i + " of " + total + "items");
//                    updateProgress( i, total);
//                }
//                return "Compleated @" + System.currentTimeMillis();
//            }
//        };
//    }
//}
