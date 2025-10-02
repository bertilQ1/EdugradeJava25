import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] numbers = {64, 32, 22, 19, 15, 6, 2};
        System.out.println("Array before sorting");
        for (int number : numbers) {
            System.out.println(number + " ");

            List<Integer> numbers1 = new ArrayList<>();
            numbers1.add(5);
            numbers1.add(25);
            numbers1.add(45);
            numbers1.add(65);
            numbers1.add(85);

            int index = linearSearch(numbers1,25);
            System.out.println("Index of 25: " + index);

            numbers1.set(2,300);
            System.out.println(numbers);


        }

    bubbleSort(numbers);

    System.out.println("\nArray after sorting");
    for(int number : numbers){
        System.out.println(number + "");
    }




    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }

    public static int linearSearch(List<Integer> list, int key){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) == key){
                return i;
            }
        }
        return -1;
    }
}