package Immutability;

public class Person {
    private final String name;
    private final String gender;

    private Person(String n, String g) {
        name = n;
        gender = g;
    }

    public static Person createPerson(String pName, String pGender) {
        return new Person(pName,pGender);
    }

    public String displayPerson() {
        return this.name + ", " + this.gender;
    }
}
