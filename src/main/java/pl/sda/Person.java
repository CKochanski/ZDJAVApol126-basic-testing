package pl.sda;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    private Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static Person create(String firstName, String lastName, int age) {
        return new Person(firstName, lastName, age);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getFullNameWithAge() {
        return getFullName() + " age:" + age;
    }

}
