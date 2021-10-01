package nl.novi.overerven;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String streetName;
    private String bsnNumber;
    private double balance;

    //Lege constuctor
    public Person() {
    }

    //Constructor
    public Person(String firstName, String lastName, String streetName, String bsnNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetName = streetName;
        this.bsnNumber = bsnNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getBsnNumber() {
        return bsnNumber;
    }

    public void setBsnNumber(String bsnNumber) {
        this.bsnNumber = bsnNumber;
    }

    // Getter lastName
    public String getLastName() {
        return lastName;
    }

    //Setter lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Overige getters & setters weggelaten.

    public void eat(String food) {
        System.out.println("I eat " + food);
    }

    public abstract void work();
}

