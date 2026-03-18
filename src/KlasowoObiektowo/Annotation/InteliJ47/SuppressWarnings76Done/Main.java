package KlasowoObiektowo.Annotation.InteliJ47.SuppressWarnings76Done;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    @SuppressWarnings("unchecked")
    public void method(){
        List list = new ArrayList<>();
    }

//    @SuppressWarnings("deprecation")
//    public void test(){
//        Thread.stop();
//    }

//    @SuppressWarnings("unchecked")
//    public void test(){
//        List<String> list = (List<String>) getRawList();
//    }

    @SuppressWarnings("eawtypes")
    List list = new ArrayList();

    @SuppressWarnings("unused")
    private int temp;

    @SuppressWarnings({"unchecked", "rawtypes"})
    public void method1() {}

//    public void method() {
//        @SuppressWarnings("unchecked")
//        List<String> list = (List<String>) raw;
//    }

//    @SuppressWarnings("deprecation")
//    public void migrate() {
//        legacyMethod();
//    }


}
