package nl.novi.overerven;

import java.util.ArrayList;
import java.util.List;

public class MainPoly {
    public static void main(String[] args) {
        //Polymorph declaration
        Person someDoctor = new FamilyDoctor();
        someDoctor.setFirstName("Jan");
        someDoctor.setLastName("Jansen");
        someDoctor.setBsnNumber("555888693");
        someDoctor.setStreetName("Nieuwe Gracht");

        Person someHandyman = new Handyman("Sjaak", "Metselaar", "Kijzersgracht", "01234567", "1-AAA-2");

        // Deeze list bevat person-objecten
        List<Person> persons = new ArrayList<>();

        // We gooien een Family doctor-object in de lijst die een persoon verwacht
        persons.add(someDoctor);
        // We gooien een Family doctor-object in de lijst die een persoon verwacht
        persons.add(someHandyman);

        for (Person p : persons) {
            // Er kunnen hier elke methode aanroepen die ook in de Persoon-klasse staat.
            p.work();
            p.eat("Salad");

        }
    }
}
