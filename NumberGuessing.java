package Practical8;

import java.util.*;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) list.add(i);
        Collections.shuffle(list);

        int[] target = new int[4];
        for (int i = 0; i < 4; i++) target[i] = list.get(i);

        int chances = 10;
        while (chances > 0) {
            System.out.println("Guess 4 numbers (no duplicates):");
            int[] guess = new int[4];
            for (int i = 0; i < 4; i++) {
                guess[i] = input.nextInt();
            }

            int score = 0;
            for (int i = 0; i < 4; i++) {
                if (guess[i] == target[i]) score++;
            }

            chances--;
            if (score == 4) {
                System.out.println("You Won! You got the actual number!");
                break;
            } else if (chances == 0) {
                System.out.print("The actual number is ");
                for (int i = 0; i < 4; i++) System.out.print(target[i] + " ");
                System.out.println("You Lose.");
            } else {
                System.out.println("You have score " + score + " out of the 4 numbers. You have " + chances + " chances left.");
            }
        }
    }
}