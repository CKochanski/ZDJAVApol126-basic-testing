package pl.sda;

public class Person {

    private String firstName;
    private String lastName;

    private Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static Person create(String firstName, String lastName) {
        return new Person(firstName, lastName);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

}
