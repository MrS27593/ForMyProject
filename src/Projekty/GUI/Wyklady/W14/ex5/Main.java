//package Projekty.GUI.Wyklady.W14.ex5;
//
//import javafx.application.Application;
//import javafx.collections.FXCollections;
//import javafx.collections.ListChangeListener;
//import javafx.collections.ObservableList;
//import javafx.scene.Scene;
//import javafx.scene.control.ListCell;
//import javafx.scene.control.ListView;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Rectangle;
//import javafx.stage.Stage;
//
//public
//    class Main
//    extends Application {
//
//    @Override
//    public void start(Stage stage) throws Exception {
//        ObservableList<String> oList = FXCollections.observableArrayList(
//            "Red", "Green", "Blue"
//        );
//        oList.addListener(
//            (ListChangeListener<? super String>) evt -> {
//                System.out.println(oList);
//            }
//        );
//
//        ListView<String> listView = new ListView<>(oList);
//
//        ObservableList<String> itemsToSelect = FXCollections.observableArrayList(
//             "Yellow", "Orange", "Pink"
//        );
//
//        listView.setEditable(true);
//        listView.setCellFactory(
//            par -> new ListCell<>(){
//
//                Rectangle rectangle = new Rectangle( 30, 30);
//
//                @Override
//                protected void updateItem(String s, boolean b) {
//                    super.updateItem(s, b);
//                    if(s != null) {
//                        rectangle.setFill(
//                                Color.web(s)
//                        );
//                        setText(s);
//                        setGraphic(rectangle);
//                    }
//                }
//            }
//        );
//
//        BorderPane root = new BorderPane();
//        root.setCenter(listView);
//
//
//        stage.setScene( new Scene(root, 640, 480));
//        stage.show();
//    }
//
//}
