import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your number :");
        int num = sc.nextInt();

        if (num % 15 == 0) {
            System.out.print("FizzBuzz");

        } else if (num % 3 == 0) {
            System.out.print("Fizz");

        } else if (num % 5 == 0) {
            System.out.print("Buzz");

        } else {
            System.out.print(num);
        }

        sc.close();

    }

}
