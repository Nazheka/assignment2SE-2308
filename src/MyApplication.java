import models.Employee;
import models.Person;
import models.Student;

import java.util.ArrayList;
import java.util.Collections;

public class MyApplication {
    public static void main(String[] args) {
        Person.people = new ArrayList<>();
        Person.people.add(new Student("Akezhan", "Bakytzhanov", 4.0));
        Person.people.add(new Employee("Nursultan", "Nazarbayev", "ex president", 999999999));
        Person.people.add(new Student("Nurzhan", "Bakir", 1.67));
        Person.people.add(new Employee("Nazheka", "Botabekov", "unemployed", 0));
        Collections.sort(Person.people);
        printData(Person.people);
    }

    public static void printData(Iterable <Person> people) {
        for (Person p : people) {
            System.out.println(p.toString() + " earns " + p.getPaymentAmount() + " tenge");
        }
    }

}
