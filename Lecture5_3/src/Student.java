public class Student {
    private String name;
    private char grade;

    public Student(String name, char grade){
        this.name = name;
        this.grade = grade;
    }

    public void printDetails() {
        System.out.println("Your name is " + name + " and your grade is " + grade + "!");
    }
}
