package nl.novi.javaprogrammeren;

import nl.novi.javaprogrammeren.overerving.Rocket;
import nl.novi.javaprogrammeren.overerving.SpaceXRocket;

public class Main {
    /*
    Bekijk onderstaande code. Er zijn twee klasse, twee objecten.
    SpaceXRocket extends Rocket.

    Op dit moment vliegen beide raketten 100 meter per 1 fuel-eenheid.
    Pas de code zo aan dat de SpaceXRocket 150 meter per 1 fuel-eendheid omhoog gaat.
    Gebruik hiervoor super() of Override.

    Je hoeft alleen code aan te passen in SpaceXRocket
     */

    public static void main(String[] args) {
        Rocket genericRocket = new Rocket(100);

        genericRocket.fly(10);
        System.out.println(genericRocket.toString());

        SpaceXRocket spaceXRocket = new SpaceXRocket(100);
        spaceXRocket.fly(10);
        System.out.println(spaceXRocket.toString());
    }
}
