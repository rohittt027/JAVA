// public class FunctionOrMethod {

//     public static void PrintHelloWorld() {
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//     }

//     public static void main(String[] args) {
//         PrintHelloWorld(); //functional call
//     }

// }

// ----------------------------------------------------------------------------------------------------------

import java.util.Scanner;

public class FunctionOrMethod {

    public static void calculateSum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum is :" + sum);

        sc.close();
    }

    public static void main(String[] args) {
        calculateSum();

    }
}