//package Projekty.GUI.Wyklady.W14.ex7;
//
//
//import javafx.application.Application;
//import javafx.collections.FXCollections;
//import javafx.collections.ListChangeListener;
//import javafx.collections.ObservableList;
//import javafx.scene.Scene;
//import javafx.scene.control.*;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.FlowPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.StackPane;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Rectangle;
//import javafx.stage.Stage;
//
//public
//class Main
//        extends Application {
//
//    @Override
//    public void start(Stage stage) throws Exception {
//        ObservableList<String> oList = FXCollections.observableArrayList(
//                "Red", "Green", "Blue"
//        );
//        oList.addListener(
//                (ListChangeListener<? super String>) evt -> {
//                    System.out.println(oList);
//                }
//        );
//
//        ListView<String> listView = new ListView<>(oList);
//
//        ObservableList<String> itemsToSelect = FXCollections.observableArrayList(
//                "Yellow", "Orange", "Pink"
//        );
//
//        listView.setEditable(true);
//        listView.setCellFactory(
//                par -> new ListCell<>(){
//
//                    Rectangle rectangle = new Rectangle( 30, 30);
//
//                    RadioButton rb1 = new RadioButton();
//                    RadioButton rb2 = new RadioButton();
//
//                    HBox hBox = new HBox( rb1, rb2);
//
//                    StackPane stackPane = new StackPane( rectangle, hBox);
//
//                    @Override
//                    protected void updateItem(String s, boolean b) {
//                        super.updateItem(s, b);
//                        if(s != null) {
//                            rectangle.setFill(
//                                    Color.web(s)
//                            );
//                            setText(s);
//                            setGraphic(stackPane);
//                        }
//                    }
//                }
//        );
//
//        BorderPane root = new BorderPane();
//        root.setCenter(listView);
//
//        TextField textField = new TextField();
//        Button button = new Button("add");
//
//        button.setOnAction(
//                e -> {
//                    try {
//                        Color.web(textField.getText());
//                        oList.add(textField.getText());
//                    }catch (IllegalArgumentException ex){
//                        System.out.println("no color");
//                    }
//                }
//        );
//
//        FlowPane flowPane = new FlowPane( textField, button);
//
//        root.setBottom( flowPane);
//
//
//        stage.setScene( new Scene(root, 640, 480));
//        stage.show();
//    }
//
//}
//
