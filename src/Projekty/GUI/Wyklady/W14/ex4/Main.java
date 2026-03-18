//package Projekty.GUI.Wyklady.W14.ex4;
//
//import javafx.application.Application;
//import javafx.collections.FXCollections;
//import javafx.collections.ListChangeListener;
//import javafx.collections.ObservableList;
//import javafx.scene.Scene;
//import javafx.scene.control.ListView;
//import javafx.scene.control.cell.ChoiceBoxListCell;
//import javafx.scene.layout.BorderPane;
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
//            ChoiceBoxListCell.forListView(
//                itemsToSelect
//            )
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
