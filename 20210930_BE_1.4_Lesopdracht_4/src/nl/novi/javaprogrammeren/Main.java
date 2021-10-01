package nl.novi.javaprogrammeren;

import nl.novi.javaprogrammeren.overerving.ApolloRocket;
import nl.novi.javaprogrammeren.overerving.Rocket;

public class Main {
    /*
    Bekijk onderstaande code. Er zijn twee klasse, twee objecten.
    ApolloRocket extends Rocket.

    De ApolloRocket is speciaal. Wanneer deze geïnstantieerd wordt, moeten we ook het aantal motoren meegeven. Pas de
    constructor aan.

    Maak vervolgens in deze klasse een ApolloRocket object aan en roep de toString()-methode aan.
     */

    public static void main(String[] args) {
        Rocket genericRocket = new Rocket(100);

        genericRocket.fly(10);
        System.out.println(genericRocket.toString());

        Rocket apolloRocket = new ApolloRocket(3, 4);

        System.out.println(apolloRocket.toString());
    }
}
