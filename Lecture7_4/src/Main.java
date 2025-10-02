import javax.security.auth.login.AccountNotFoundException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Team team = new Team(3);
        team.addPlayer(new Player("Janne"));
        team.addPlayer(new Player("Lennart"));
        team.addPlayer(new Player("Bertil"));

        team.listPlayers();

        Zoo zoo = new Zoo();
        zoo.addAnimal(new Animal("Monkey"));
        zoo.addAnimal(new Animal("Sloth"));
        zoo.addAnimal(new Animal("Elephant"));

        zoo.listAnimals();

        School school = new School(2);
        school.addTeacher(new Teacher("Mr. Smith"));
        school.addTeacher(new Teacher("Mrs. Johnson"));

        school.addStudent(new Student("Alice"));
        school.addStudent(new Student("Bob"));

        System.out.println("Teachers:");
        school.listTeachers();

        System.out.println("Students:");
        school.listStudents();


    }
}