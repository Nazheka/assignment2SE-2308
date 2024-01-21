package models;

import interfaces.Payable;
import java.util.List;

public class Person implements Payable, Comparable<Person>{
    private final int id;
    private static int countId = 1;
    private String name;
    private String surname;

    public static List<Person> people;

    public Person() {
        this.id = countId++;
    }

    public Person(String name, String surname) {
        this.id = countId++;
        setName(name);
        setSurname(surname);
    }


    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }

    public String toString() {
        return id + ". " + name + " " + surname;
    }

    public String getPosition() {
        return "Student";
    }
    public int compareTo(Person person) {
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());
    }

}
