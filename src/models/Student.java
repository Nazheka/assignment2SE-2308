package models;

public class Student extends Person{
    private double gpa;

    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        setGpa(gpa);
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    @Override
    public double getPaymentAmount() {
        if (gpa > 2.7) {
            return 36660;
        } else {
            return 0;
        }
    }
}
