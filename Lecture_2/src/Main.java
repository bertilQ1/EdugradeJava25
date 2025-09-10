//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello World");
        System.out.println(7);
        System.out.println(7.23);
        System.out.println('A');
        System.out.println(true);
        System.out.println(false);

        int age = 25;
        double price = 19.99;
        char grade = 'A';
        String name = "Anna";
        boolean isStudent = true;



        System.out.println(age);

        System.out.println("The cost of this course is $" + price);

        System.out.println("Your grade is " + grade);

        System.out.println("Hello " + name);

        System.out.println("Is the student enroled? "  + isStudent);

        age = 28;

        System.out.println(age);

        // ((Object) name).getClass().getName()

        System.out.println(((Object) name).getClass().getName());
        System.out.println(((Object) price).getClass().getName());
        System.out.println(((Object) grade).getClass().getName());
        System.out.println(((Object) isStudent).getClass().getName());
        System.out.println(((Object) age).getClass().getName());

        // kommentar

        /*


        Rad kommentar



        */



    }
}
