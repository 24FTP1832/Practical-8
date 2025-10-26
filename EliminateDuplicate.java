package Practical8;

import java.util.Scanner;
import java.util.Arrays;

public class EliminateDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (numbers[i] == numbers[j]) {
                    numbers[j] = 0;
                }
            }
        }

        Arrays.sort(numbers);
        System.out.print("The distinct numbers are: ");
        for (int num : numbers) {
            if (num != 0) System.out.print(num + " ");
        }
    }
}