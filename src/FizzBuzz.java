import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Welcome to Fizz Buzz!!\nEnter a number!");
        while (true) {
            int read;
            try {
                Scanner input = new Scanner(System.in);
                read = input.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("Enter integer number!!");
                continue;
            }
            System.out.println(fizzbuzz(read));
            break;
        }
    }

    public static List<String> fizzbuzz(int n) {
        List<String> fizzbuzz = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzbuzz.add("FizzBuzz");
            } else if (i % 3 == 0) {
                fizzbuzz.add("Fizz");
            } else if (i % 5 == 0) {
                fizzbuzz.add("Buzz");
            } else {
                fizzbuzz.add(String.valueOf(i));
            }
        }
        return fizzbuzz;
    }
}
