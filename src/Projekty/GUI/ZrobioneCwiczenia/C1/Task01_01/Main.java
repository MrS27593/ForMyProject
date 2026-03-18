package FinalneMarcinaIMoje.Task01_01;

public class Main {
    public static void main(String[] args) {
        //utworzenie nowej referencji "s1" do obiektu Klasy anonimowej  typu klasy abstrakcyjnej
        Singer s1 = new Singer("Martin"){
            //przysłoniecie metody sing która w tym przypadku będzie zwracać odpowiedni String
            @Override
            public String sing() {
                return " Arrivederci, Roma...";
            }
        };

        //Utworzenie nowej referencji "s2" do obiektu Klasy anonimowej typu klasy abstrakcyjnej
        Singer s2 = new Singer("Joplin"){
            //przysłonięcie metody "sing", która w tym przypadku będzie zwracała odpowiedni string
            @Override
            public String sing() {
                return " ...for me and my Bobby MacGee";
            }
        };
        //Utworzenie nowej referencji "s3" do nowego obiektu klasy anonimowej typu klasy abstrakcyjnej
        Singer s3 = new Singer("Houston"){
            //Przysłonięcie metody "sing", która w tym przypadku będzie zwracała odpowiedni String
            @Override
            public String sing() {
                return "I will always love youuuu";
            }
        };
        //Utworzenie referencji tablicowej "sng" typu Singer a następnie wypełnienie jej naszymi referencjami do obiektów s1, s2, s3
        Singer sng[] = {s1, s2, s3};
        //Użycie enchanced for do wywołania wyświetlenia toStringa dla każdego elementu tablicy
        for (Singer s : sng) System.out.println(s);
        //W nowej linijce wyświetlamy dla tablicy wywołanie metody "loudest" z Klasy Singer
        System.out.println("\n" + Singer.loudest(sng));
    }
}