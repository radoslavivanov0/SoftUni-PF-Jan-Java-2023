package C06_ObjectsAndClasses.Exercise.EX04_Students;

public class Student {
    private String firstName;
    private String lastName;
    private double grade;
    public Student (String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }
    public double getGrade() {
        return this.grade;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
}
