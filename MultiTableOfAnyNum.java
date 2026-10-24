
// Multiplication Table of a Number :-

import java.util.Scanner;

public class MultiTableOfAnyNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int multi = 1;

        System.out.print("enter your number :");
        num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            multi = num * i;
            System.out.println(num + " x " + i + " = " + multi);

        }
        sc.close();

    }
}
