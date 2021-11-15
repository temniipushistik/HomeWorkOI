package FirstOne;

import java.util.Scanner;


public class IntegersSum {
    public static void main(String[] args) {
        Integer firstNumber;
        Integer secondNumber;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число :");

        firstNumber = checkingException(in.next());
                System.out.print("Введите второе число :");

        secondNumber = checkingException(in.next());
        {
            if (firstNumber > secondNumber) {
                System.out.println(String.format("Число %s больше %s", firstNumber, secondNumber));
            } else if (firstNumber < secondNumber) {
                System.out.println(String.format("Число %s мешьше %s", firstNumber, secondNumber));
            }
        }
        System.out.println("Сумма чисел: " + (firstNumber + secondNumber));
    }

    public static Integer checkingException(String s) {
        try{
            return Integer.parseInt(s);

        }catch (NumberFormatException e){
            System.out.println(e);
            System.exit(1);
           return null;
        }
    }

}

