package nl.novi.overerven;

public class MainHandyman {

    public static void main(String[] args) {
        Handyman handyman = new Handyman("Sjaak", "Timmerman", "Oude Gracht",
                "02345678", "12-AAA-9");



        System.out.println("Het kenteken is: " + handyman.getLicensePlateNumber());
        System.out.println("Mijn voornaam is"+handyman.getFirstName());
    }
}