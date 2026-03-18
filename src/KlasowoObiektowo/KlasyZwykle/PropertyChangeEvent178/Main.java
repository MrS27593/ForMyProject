package KlasowoObiektowo.KlasyZwykle.PropertyChangeEvent178;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.addPropertyChangeListener(evt -> {

            System.out.println("zmieniono właściwość "+evt.getPropertyName());
            if (evt.getOldValue()==null){
                System.out.println("Wartość nie została nadana");
            }else{
                System.out.println("stara nazwa "+evt.getOldValue());
            }
            System.out.println("nowa nazwa to "+evt.getNewValue());
        });

        person.setName("Jan");
        person.setName("Jakub");
    }
}

class Person{
    private String name;
    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        propertyChangeSupport.firePropertyChange("name",oldName,name);
    }

    public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener){
        propertyChangeSupport.addPropertyChangeListener(propertyChangeListener);
    }

    public void removePropertyChangeListener(PropertyChangeListener propertyChangeListener){
        propertyChangeSupport.removePropertyChangeListener(propertyChangeListener);
    }
}
