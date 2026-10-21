import java.util.Scanner;

public class PrintNum1toN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 1;
        System.out.print("enter number :");
        int n = sc.nextInt();

        while (num <= n) {
            System.out.print(num + " ");
            num++;

        }
        sc.close();
    }

}
