package C06_ObjectsAndClasses.Exercise.EX06_OrderByAge;

public class Person {
    private String name;
    private String ID;
    private int age;

    public Person(String name, String ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getID() {
        return this.ID;
    }

    public int getAge() {
        return this.age;
    }
}
