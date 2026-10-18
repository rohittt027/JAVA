import java.util.Scanner;

public class NegativePositiveNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number :");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("number is : positive");
        } else {
            System.out.println("number is : negative");
        }
        sc.close();

    }
}
