//package Projekty.GUI.Wyklady.W14.ex3;
//
//import javafx.application.Application;
//import javafx.collections.FXCollections;
//import javafx.collections.ListChangeListener;
//import javafx.collections.ObservableList;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.ListView;
//import javafx.scene.control.SelectionMode;
//import javafx.scene.control.cell.TextFieldListCell;
//import javafx.scene.layout.BorderPane;
//import javafx.stage.Stage;
//import javafx.util.converter.IntegerStringConverter;
//
//public
//    class Main
//    extends Application {
//
//    @Override
//    public void start(Stage stage) throws Exception {
//        ObservableList<Integer> oList = FXCollections.observableArrayList( 10, 20, 30);
//        oList.addListener(
//            (ListChangeListener<? super Integer>) evt -> {
//                System.out.println(oList);
//            }
//        );
//
//        ListView<Integer> listView = new ListView<>(oList);
//
//        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
//        listView.getSelectionModel().selectedIndexProperty().addListener(
//            e -> {
//                System.out.println(
//                    listView.getSelectionModel().getSelectedItems()
//                );
//            }
//        );
//
//        listView.setEditable(true);
//        listView.setCellFactory(
//            TextFieldListCell.forListView(
//                new IntegerStringConverter()
//            )
//        );
//
//        BorderPane root = new BorderPane();
//        root.setCenter(listView);
//
//        Button button = new Button("add");
//        button.setOnAction(
//            e -> {
//                oList.add(
//                    (int)(Math.random()*255)
//                );
//            }
//        );
//
//        root.setBottom(button);
//
//        stage.setScene( new Scene(root, 640, 480));
//        stage.show();
//    }
//
//}
