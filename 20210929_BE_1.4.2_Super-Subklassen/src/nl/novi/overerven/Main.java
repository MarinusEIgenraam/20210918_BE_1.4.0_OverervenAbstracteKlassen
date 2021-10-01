package nl.novi.overerven;

public class Main {
    public static void main(String[] args) {
        FamilyDoctor familyDoctor = new FamilyDoctor();

        familyDoctor.setLastName("House");
        familyDoctor.setHospitalName("Princeton");

        System.out.println("Doctor " + familyDoctor.getLastName() + " works at " + familyDoctor.getHospitalName());

        familyDoctor.eat("Spinach");
        familyDoctor.work();

        familyDoctor.eat("Grass", false);

    }
}