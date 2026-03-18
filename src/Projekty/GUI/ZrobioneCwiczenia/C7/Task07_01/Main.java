package FinalneMarcinaIMoje.Task07_01;

import java.util.*;

class Main {
    public static void main(String[] args) {

        //Stworzenie referencji do tablicy typu String i wypełnienie jej danymi
        String[] arr = {
                "salon A", "Mercedes", "130000",
                "salon B", "Mercedes", "120000",
                "salon C", "Ford", "110000",
                "salon B", "Opel", "90000",
                "salon C", "Honda", "95000",
                "salon A", "Ford", "105000",
                "salon A", "Renault", "75000"
        };





        Map<String, List<Car>> map = new HashMap<String, List<Car>>(); //Typy w Hashmap

        //Stworzenie trzech zmiennych odpowiadających
        String salon;
        String brand;
        String price;


        //można zauważyć że elementy się powtarzają co 3 więc iteracja co trzy i przypisanie do zmiennych odpowiednich wartości
        for(int i = 0; i < arr.length; i+=3) {
            salon = arr[i];
            brand = arr [i+1];
            price = arr [i+2];
            //Co iteracja powstawać będzie samochód o podanych argumentach
            Car a = new Car(brand,price);
            //Jeżeli mapa nie zawiera jeszcze klucza jakim jest salon
            if(!map.containsKey(salon)){
                //Utwórz nową listę
                List<Car> list = new ArrayList<Car>();
                //do listy dodajemy nowo powstały samochód który składa się z kolejnych argumentów
                list.add(a);

                map.put(salon,list);
            }else{
                //Jeżeli mapa już zawiera dany salon to do tego salonu dorzucamy kolejna listę w postaci samochodu
                map.get(salon).add(a);
            }
        }

        //Pomocnicza zmienna int
        int minValue = 100000;
        //zmienna "car" typu String
        String car = "";
        //zmienna "key" typu String
        String key="";

        //Przechodzimy przez wszystkie klucze które są typu String czyli mamy 3 iteracje bo jest Salon A,B,C
        for(String klucz: map.keySet()){
            //Listę samochodów przypisujemy wartośc czyli samochód dla odpowiedniego klucza
            List<Car> list = map.get(klucz);
            //Przechodzimy przez wsyzstkie elementy z listy czyli przez wszystkie samochody
            for(int i = 0; i < list.size(); i++)
            //Jeżeli dla danego samochodu wartośc zwracana za pomocą getPrice jest niższa niż w zmiennej pomocniczej to
            //zmienna pomocnicza ustalana jest na wartość tej ceny najtańszego pojazdu
            if(list.get(i).getPrice() < minValue){
                minValue = list.get(i).getPrice();
                //zmienna "car" zmienia się na nazwę tego najtańszego pojazy
                car = list.get(i).getNameOfCar();
                //A klucz ustalany jest na wartośc tego salonu z którego pochodzi ten właśnie najtańszy samochód
                key=klucz;
            }
        }

        System.out.println(map);
        System.out.println(minValue);
        System.out.println(car);
        System.out.println(key);




//    for(List<Car> a : )
//            listOfCars.add(a);

    }
}

class Car{
    private String nameOfCar;
    private String price;

    public Car(String nameOfCar, String price){
        this.nameOfCar=nameOfCar;
        this.price=price;

    }

    public String toString(){
        return nameOfCar+" "+price;
    }

    public String getNameOfCar() {
        return nameOfCar;
    }

    public int getPrice() {
        return Integer.parseInt(price);
    }
}
