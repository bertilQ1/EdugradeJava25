import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(25);
        numbers.add(29);
        numbers.add(32);
        numbers.add(45);
        numbers.add(68);

        int max = findMax(numbers);
        int min = findMin(numbers);

        System.out.println(max);
        System.out.println(min);

        System.out.println("before removal " + numbers);

        numbers.remove(2);

        System.out.println("After removal " + numbers);

        int sum = 0;
        for (int number : numbers){
            sum +=number;
        }
        System.out.println(sum);
    }

    public static int findMax(List<Integer> list){
        int max = list.get(0);
        for (int number : list) {
            if (number > max){
                max = number;
            }
        }
        return max;
    }
    public static int findMin(List<Integer> list){
        int min = list.get(0);
        for (int number : list) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}