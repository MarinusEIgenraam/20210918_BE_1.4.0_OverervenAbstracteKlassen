package nl.novi.overerven;

public class FamilyDoctor extends Person {

    private String hospitalName;

    //Constructor weggelaten.

    // Getter hospitalName
    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    @Override
    public void work() {
        System.out.println("I do family-doctor-work.");
    }

    public void eat(String food, boolean like) {
        super.eat(food);
        if(like) {
            System.out.print(". And I like it.");
        } else {
            System.out.print(". And it tastes awful!");
        }
    }
    

}