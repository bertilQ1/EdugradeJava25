public class Student {
    private String name;
    private char grade;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(char grade) {
        if (grade >= 'A' && grade <= 'F') {
            this.grade = grade;
        } else {
            System.out.println("You've written an invalid character");
        }
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("You've entered a invalid age or characters, please write in numbers.");
        }
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public char getGrade(){
        return this.grade;
    }
}

