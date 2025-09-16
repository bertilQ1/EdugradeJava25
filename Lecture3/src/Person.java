public class Person {

    String name;
    int age;
    String occupation;

    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.occupation = "Unknown";
    }

    public void introduce() {
        System.out.println("Hello my name's " + name + " and I'm " + age + " and I work at " + occupation);
    }

    public static void main(String[] args) {
        Person defaultPerson = new Person();
        System.out.println("name: " + defaultPerson.name);
        System.out.println("age: " + defaultPerson.age);
        System.out.println("occupation: " + defaultPerson.occupation);

        Person person = new Person("bertil", 18, "McDonalds");
        person.introduce();
    }
}
