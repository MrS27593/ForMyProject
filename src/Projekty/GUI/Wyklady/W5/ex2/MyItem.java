package Projekty.GUI.Wyklady.W5.ex2;

//Publicz klasa MyItem
public
    class MyItem {

    //Prywatne pole "value" o typie int
    private int value;

    //publiczny konstruktor "MyItem" który przypisuje argument do pola obiektu
    public MyItem(int value) {
        this.value = value;
    }

    //Przysłonięcie metody toString która zwracać ma "MyItem ([wartość])"
    @Override
    public String toString() {
        return "MyItem("+value+")";
    }
}
