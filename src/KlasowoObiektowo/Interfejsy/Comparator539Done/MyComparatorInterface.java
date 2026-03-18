package KlasowoObiektowo.Interfejsy.Comparator539Done;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
public class MyComparatorInterface {
    public static void main(String[] args) {
        Osoba osoba = new Osoba("jan",18);
        Osoba osoba2 = new Osoba("jakub",92);
        Osoba osoba3 = new Osoba("Maja",4);
        List<Osoba> listaOsob = new ArrayList<>();
        listaOsob.add(osoba);
        listaOsob.add(osoba2);
        listaOsob.add(osoba3);
         Comparator<Osoba> comparatorPoWieku = new Comparator<Osoba>() {
            @Override
            public int compare(Osoba o1, Osoba o2) {
                return o1.wiek - o2.wiek;
            }
        };
        Comparator<Osoba> comparatorPoWieku2 = ((o1, o2) -> o1.wiek - o2.wiek);
        Comparator<Osoba> comparatorPoWieku3 = Comparator.comparingInt(o -> o.wiek);
        Comparator<Osoba> comparatorNajpierwPoImieniuPotemPoWieku = Comparator.comparing(Osoba::getImie).thenComparing(Osoba::getWiek);
        listaOsob.sort(comparatorPoWieku3);
    }
//    Comparator<Osoba> comparatorPoWieku2 = ((o1, o2) -> o1.wiek - o2.wiek);
//
//    Comparator<Osoba> comparatorPoWieku3 = Comparator.comparingInt(o -> o.wiek);
//
//    Comparator<Osoba> comparatorNajpierwPoImieniuPotemPoWieku = Comparator.comparing(Osoba::getImie).thenComparing(Osoba::getWiek);
}
class Osoba{
    public static void main(String[] args) {
        Osoba osoba = new Osoba("jan",18);
        Osoba osoba5 = new Osoba("jan",19);
        Osoba osoba6 = new Osoba("bogdan",18);
        Osoba osoba2 = new Osoba("jakub",92);
        Osoba osoba3 = new Osoba("Maja",4);
        List<Osoba> listaOsob = new ArrayList<>();
        listaOsob.add(osoba);
        listaOsob.add(osoba2);
        listaOsob.add(osoba3);
        listaOsob.add(osoba5);
        listaOsob.add(osoba6);
        Comparator<Osoba> comparatorPoWieku = new Comparator<Osoba>() {
            @Override
            public int compare(Osoba o1, Osoba o2) {
                return o1.wiek - o2.wiek;
            }
        };
        Comparator<Osoba> comparatorPoWieku2 = ((o1, o2) -> o1.wiek - o2.wiek);
        Comparator<Osoba> comparatorPoWieku3 = Comparator.comparingInt(o -> o.wiek);
        Comparator<Osoba> comparatorNajpierwPoImieniuPotemPoWieku = Comparator.comparing(Osoba::getImie).thenComparing(Osoba::getWiek);
        Comparator<Osoba> comparatorNajpierwPoWiekuPotemPoImieniu = Comparator.comparing(Osoba::getWiek).thenComparing(Osoba::getImie);
        listaOsob.sort(comparatorNajpierwPoImieniuPotemPoWieku);
        System.out.println(listaOsob);
        listaOsob.sort(comparatorNajpierwPoWiekuPotemPoImieniu);
        System.out.println(listaOsob);
        listaOsob.sort(odwrotnie);
        System.out.println(listaOsob);
    }
    String imie;
    int wiek;
    public Osoba(String ime, int wiek) {
        this.imie = ime;
        this.wiek = wiek;
    }
    public String getImie() {
        return imie;
    }
    public void setIme(String ime) {
        this.imie = ime;
    }
    public int getWiek() {
        return wiek;
    }
    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Osoba osoba)) return false;
        return getWiek() == osoba.getWiek() && Objects.equals(getImie(), osoba.getImie());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getImie(), getWiek());
    }
    @Override
    public String toString() {
        return "Osoba{" +
                "ime='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }
    public Comparator<Osoba> comparatorPoWieku = new Comparator<Osoba>() {
        @Override
        public int compare(Osoba o1, Osoba o2) {
            return o1.wiek - o2.wiek;
        }
    };
    Comparator<Osoba> comparatorPoWieku2 = ((o1, o2) -> o1.wiek - o2.wiek);
    Comparator<Osoba> comparatorPoWieku3 = Comparator.comparingInt(o -> o.wiek);
    Comparator<Osoba> comparatorNajpierwPoImieniuPotemPoWieku = Comparator.comparing(Osoba::getImie).thenComparing(Osoba::getWiek);
    static Comparator<Osoba> odwrotnie = Comparator.comparingInt(Osoba::getWiek).reversed();
}
