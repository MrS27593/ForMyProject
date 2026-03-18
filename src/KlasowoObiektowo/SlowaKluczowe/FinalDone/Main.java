package KlasowoObiektowo.SlowaKluczowe.FinalDone;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final int MAX_USERS = 100;
//        MAX_USERS = 200;  ERROR
        final List<String> list = new ArrayList<>();
        list.add("a");
//        list = new ArrayList<>(); ERROR


    }

    class Config{
        final String url;
        Config(String url){
            this.url = url;
        }
    }

    class Parent {
        final void show(){
            System.out.println("Parent");
        }
    }

    class Child extends Parent{
//        void show(){
//
//        } EROR nie można nadpisać finalnej metody
    }

    final class Utility{
        static void help(){

        }
    }

//    class MyUtil extends Utility{
//
//    } ERROR nie można dziedziczyć po klasie finalnej
    final class AppConfig{
        public static final String APP_NAME = "MyApp";
        public static final int PORT = 8080;

        private AppConfig(){

        }
}
}
