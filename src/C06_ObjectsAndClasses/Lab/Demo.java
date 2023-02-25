package C06_ObjectsAndClasses.Lab;

public class Demo {
    static class Person {
        String name;
        String town;
        int age;
        public Person() {

        }
        public String getName() {
            return this.name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getTown() {
            return this.town;
        }
        public void setTown(String town) {
            this.town = town;
        }
    }

    public static void main(String[] args) {
        Person test = new Person();
        test.setName("Veronika");
        test.setTown("Pleven");
        String name = test.getName();
        String town = test.getTown();
        System.out.println("My name is: " + name);
        System.out.println("My town is: " + town);
    }
}
