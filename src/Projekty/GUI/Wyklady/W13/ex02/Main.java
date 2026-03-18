//package Projekty.GUI.Wyklady.W13.ex02;
//
//import javafx.application.Application;
//import javafx.application.Platform;
//import javafx.beans.property.BooleanProperty;
//import javafx.beans.property.IntegerProperty;
//import javafx.beans.property.SimpleBooleanProperty;
//import javafx.beans.property.SimpleIntegerProperty;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.control.PasswordField;
//import javafx.scene.layout.FlowPane;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Rectangle;
//import javafx.stage.Stage;
//
//public
//    class Main
//    extends Application {
//
//    private BooleanProperty ACCESS_GRANTED = new SimpleBooleanProperty();
//    private final int MAX_ATTEMPTS = 3;
//    private IntegerProperty ATTEMPT = new SimpleIntegerProperty();
//
//    @Override
//    public void start(Stage stage) throws Exception {
//        User user = new User();
//
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
//        Label lUserName = new Label("no name");
//        PasswordField fPassword = new PasswordField();
//
//        FlowPane flowPane = new FlowPane();
//        flowPane.getChildren().addAll( lUserName, fPassword);
//
//        lUserName.textProperty().bind(
//            user.userNameProperty()
//        );
//
//        fPassword.textProperty().addListener(
//            (obs, ov, nv) -> ACCESS_GRANTED.set(
//                user.passwordProperty().getValue().equals(nv)
//            )
//        );
////
////        ACCESS_GRANTED.addListener(
////            (obs, ov, nv) -> background.setFill(
////                ACCESS_GRANTED.get() ? Color.GREEN : Color.TOMATO
////            )
////        );
//
//        fPassword.setOnAction(
//            evt -> {
//                if(ACCESS_GRANTED.get())
//                    background.setFill(Color.GREEN);
//                else {
//                    background.setFill(Color.TOMATO);
//                    ATTEMPT.set(
//                        ATTEMPT.add(1).getValue()
//                    );
//                }
//            }
//        );
//
//        ATTEMPT.addListener(
//            (obs, ov, nv) -> {
//                if(nv.intValue() == MAX_ATTEMPTS)
//                    Platform.exit();
//            }
//        );
//
//        root.getChildren().addAll( background, flowPane);
//
//
//        stage.setScene(scene);
//        stage.show();
//    }
//}
