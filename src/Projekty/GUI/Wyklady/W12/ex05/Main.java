//package Projekty.GUI.Wyklady.W12.ex05;
//
//import javafx.application.Application;
//import javafx.beans.binding.DoubleBinding;
//import javafx.beans.binding.NumberBinding;
//import javafx.beans.property.DoubleProperty;
//import javafx.beans.property.SimpleDoubleProperty;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.HBox;
//import javafx.stage.Stage;
//
//public
//class Main {
//
//    public static void main(String[] args) {
//
//        {
//            double size = 10.0;
//            double area = size * size;
//
//            System.out.println("double area: "+area);
//            size = 20.0;
//            System.out.println("double area: "+area);
//        }
//        {
//            Double size = Double.valueOf(10.0);
//            Double area = Double.valueOf(size.doubleValue() * size.doubleValue());
//
//            System.out.println("Double area: " + area.doubleValue());
//            size = Double.valueOf(20.0);
//            System.out.println("Double area: " + area.doubleValue());
//
//        }
//
//        {
//            DoubleProperty size = new SimpleDoubleProperty(10.0);
//            NumberBinding area = size.multiply(size);
//
//            System.out.println("NumberBinding: "+area.getValue());
//            size.set(20.0);
//            System.out.println("NumberBinding: "+area.getValue());
//
//        }
//        {
//            DoubleProperty size = new SimpleDoubleProperty(10.0);
//            NumberBinding area = new DoubleBinding() {
//                {
//                    super.bind(size);
//                }
//                @Override
//                protected double computeValue() {
//                    System.out.println("tu");
//                    return size.get() * size.get();
//                }
//            };
//
//            System.out.println("NumberBinding: "+area.getValue());
//            size.set(20.0);
//            System.out.println("NumberBinding: "+area.getValue());
//            System.out.println("NumberBinding: "+area.getValue());
//
//        }
//
//    }
//
//}
//
