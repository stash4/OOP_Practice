package ex5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("整数値を入力してください．");
        while (scanner.hasNext()) {
            int number = 0;
            try {
                number = scanner.nextInt();
                numbers.add(number);
            } catch (InputMismatchException e) {
                System.out.println("整数値ではありません: " + e);
                scanner.next();
                continue;
            }
        }
        if (numbers.size() <= 0) {
            System.out.println("整数値は入力されていません．");
        } else {
            System.out.println("入力された整数値は， ");
            for (int number : numbers) {
                System.out.println(number);
            }
            System.out.println("入力された整数値の合計は， ");
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println(sum);
            System.out.println("入力された整数値の平均は， ");
            double average = sum / (double) numbers.size();
            System.out.println(average);
        }
    }
}