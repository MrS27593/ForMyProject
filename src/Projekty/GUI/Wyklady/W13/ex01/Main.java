//package Projekty.GUI.Wyklady.W13.ex01;
//
//import javafx.application.Application;
//import javafx.beans.value.ChangeListener;
//import javafx.beans.value.ObservableValue;
//import javafx.scene.Group;
//import javafx.scene.Scene;
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
//        Group root = new Group();
//        Scene scene = new Scene( root, 320, 240);
//
//        Rectangle background = new Rectangle( 100, 100);
//        background.setFill(Color.DEEPSKYBLUE);
//
//        background.widthProperty().bind(
//            scene.widthProperty()
//        );
//
//        background.heightProperty().bind(
//            scene.heightProperty()
//        );
//
//        background.widthProperty().addListener(
//            new ChangeListener<Number>() {
//                @Override
//                public void changed(
//                    ObservableValue<? extends Number> obs,
//                    Number ov,
//                    Number nv
//                ) {
//                    System.out.println(ov +" -> "+ nv);
//                }
//            }
//        );
//
//        root.getChildren().addAll( background);
//
//
//        stage.setScene(scene);
//        stage.show();
//    }
//}
