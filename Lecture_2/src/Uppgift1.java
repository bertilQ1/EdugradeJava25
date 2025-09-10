public class Uppgift1 {
    public static void main(String[] args){
        int age = 30;
        double height = 1.75;
        char initial = 'A';
        String name = "Alice";
        boolean isStudent = true;

        System.out.println(((Object) name).getClass().getName());
        System.out.println(((Object) height).getClass().getName());
        System.out.println(((Object) age).getClass().getName());
        System.out.println(((Object) initial).getClass().getName());
        System.out.println(((Object) isStudent).getClass().getName());




    }
}

