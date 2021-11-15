package SecondOne;
import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] array = new int[10];
        int sum = 0;
        int min = 101;
        int index = -1;
        for (int i = 0; i < array.length; i++) {

            array[i] = rnd.nextInt(100);
            System.out.print(array[i] + " ");
            sum += array[i];
            if (array[i] < min) {
                min = array[i];
                index = i;
            }

        }
        System.out.println();
        System.out.println("Сумма всех чисел массива: " + sum);
        System.out.println("Индекс минимального элемента массива " + index + " Значение минимального элемента массива: " + min);


    }


}
