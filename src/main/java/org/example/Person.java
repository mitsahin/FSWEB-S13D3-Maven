package org.example;

public class Person {

    // Instance variables
    private String firstName;
    private String lastName;
    private int age;

    // Eklediğimiz 3 değişken
    private String city;
    private String job;
    private boolean married;

    // Constructor 1
    public Person(String firstName, String lastName, int age) {
        this(firstName, lastName, age, "Unknown", "Unknown", false); // constructor chaining
    }

    // Constructor 2 (overloading)
    public Person(String firstName, String lastName, int age, String city, String job, boolean married) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
        this.job = job;
        this.married = married;
    }

    // Methods

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}