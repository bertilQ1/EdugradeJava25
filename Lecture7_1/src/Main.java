//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double avg = sum / numbers.length;
        System.out.println(avg);

        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int max = findMax(numbers1);
        int min = findMin(numbers1);

        System.out.println(max);
        System.out.println(min);
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findMin(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}