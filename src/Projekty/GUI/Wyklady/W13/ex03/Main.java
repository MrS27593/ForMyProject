//package Projekty.GUI.Wyklady.W13.ex03;
//
//import javafx.application.Application;
//import javafx.beans.binding.Bindings;
//import javafx.beans.binding.StringBinding;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.ProgressBar;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.GridPane;
//import javafx.scene.layout.HBox;
//import javafx.stage.Stage;
//
//
//public
//class Main
//        extends Application {
//
//    @Override
//    public void start(Stage stage) throws Exception {
//        MyWorker myWorker = new MyWorker();
//
//        ProgressBar progressBar = new ProgressBar();
//        progressBar.setMinWidth(250);
//
//        progressBar.progressProperty().bind(
//            myWorker.worker.progressProperty()
//        );
//
//        HBox topPane = new HBox(progressBar);
//        topPane.setAlignment(Pos.CENTER);
//        topPane.setPadding(new Insets( 10, 10, 10, 10));
//        topPane.setSpacing(10);
//
//        Label title = new Label();
//        Label message = new Label();
//        Label state = new Label();
//        Label totalWork = new Label();
//        Label workDone = new Label();
//        Label progress = new Label();
//        Label value = new Label();
//        Label exception = new Label();
//
//        title.textProperty().bind(
//                myWorker.worker.titleProperty()
//        );
//
//        message.textProperty().bind(
//                myWorker.worker.messageProperty()
//        );
//
//        state.textProperty().bind(
//                Bindings.format("%s", myWorker.worker.stateProperty())
//        );
//
//        value.textProperty().bind(
//                myWorker.worker.valueProperty()
//        );
//
//        totalWork.textProperty().bind(
//                myWorker.worker.totalWorkProperty().asString()
//        );
//
//        workDone.textProperty().bind(
//                myWorker.worker.workDoneProperty().asString()
//        );
//
//        progress.textProperty().bind(
//                Bindings.format("%5.2f%%", myWorker.worker.progressProperty().multiply(100))
//        );
//
//        exception.textProperty().bind(
//                new StringBinding() {
//                    {
//                        super.bind(myWorker.worker.exceptionProperty());
//                    }
//                    @Override
//                    protected String computeValue() {
//                        final Throwable exception = myWorker.worker.getException();
//                        if(exception == null)
//                            return "";
//                        return exception.getMessage();
//                    }
//                }
//        );
//
//        GridPane centerPane = new GridPane();
//
//        String[] titles = {
//                "Title:", "Message:", "State:", "TotalWork:", "Work done:",
//                "Progress: ", "Value: ", "Exception: "
//        };
//        Label[] labels = { title, message, state, totalWork, workDone, progress, value, exception};
//
//        for(int i=0; i < titles.length; i++){
//            centerPane.add( new Label(titles[i]), 0, i);
//            centerPane.add( labels[i], 1, i);
//        }
//
//        Button startButton = new Button("Start");
//        Button cancelButton = new Button("Cancel");
//        Button exceptionButton = new Button("Exception");
//
//        startButton.setOnAction(
//                actionEvent -> new Thread(
//                    (Runnable) myWorker.worker
//                ).start()
//        );
//        cancelButton.setOnAction(
//                actionEvent -> myWorker.worker.cancel()
//        );
//
//        exceptionButton.setOnAction(
//                actionEvent -> myWorker.shouldThrow.getAndSet(true)
//        );
//
//
//        HBox bottomPane = new HBox( startButton, cancelButton, exceptionButton);
//        bottomPane.setAlignment(Pos.CENTER);
//        bottomPane.setPadding(new Insets( 10, 10, 10, 10));
//        bottomPane.setSpacing(10);
//
//
//        BorderPane root = new BorderPane();
//        root.setTop(topPane);
//        root.setCenter(centerPane);
//        root.setBottom(bottomPane);
//
//        stage.setScene(
//                new Scene( root, 320, 280)
//        );
//        stage.show();
//    }
//}
