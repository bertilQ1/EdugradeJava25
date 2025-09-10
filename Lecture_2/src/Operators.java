public class Operators {
    public static void main(String[] args) {
        System.out.println("Operatorer");

        System.out.println(10 + 5); //Plus
        System.out.println(10 - 5); //Minus
        System.out.println(10 * 5); //gånger
        System.out.println(10 / 5); //delat
        System.out.println(10 % 3); //Modulus, returnerar extra nummer efter delning

        /*
        == Lika med
        != INTE like med
        > större än
        < mindre än

         */

        System.out.println("Jämförelese operatorer");

        boolean isEqual = (5 == 5);
        boolean isNotEqual = (5 != 4);
        boolean isGreater = (5 > 3);
        boolean isLesser = (3 < 5);
        boolean isGreaterOrEqual = (5 >= 5);
        boolean isLesserOrEqual = (3 <= 5);

        System.out.println(isEqual);
        System.out.println(isNotEqual);
        System.out.println(isGreaterOrEqual);
        System.out.println(isLesserOrEqual);
        System.out.println(isGreater);
        System.out.println(isLesser);




    }


}
