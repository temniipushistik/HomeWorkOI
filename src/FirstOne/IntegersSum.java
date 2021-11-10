package FirstOne;

import java.util.Scanner;


public class IntegersSum {
    public static void main(String[] args) {
        Integer firstNumber;
        Integer secondNumber;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число :");
        firstNumber = in.nextInt();
        System.out.print("Введите второе число :");
        secondNumber = in.nextInt();
        {
            if (firstNumber > secondNumber) {
                System.out.println(String.format("Число %s больше %s", firstNumber, secondNumber));
            } else if (firstNumber < secondNumber) {
                System.out.println(String.format("Число %s мешьше %s", firstNumber, secondNumber));
            }
        }
        System.out.println("Сумма чисел: " + (firstNumber + secondNumber));
    }

}

