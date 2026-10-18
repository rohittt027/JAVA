import java.util.Scanner;

public class LargestOf3Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if ((A >= B) && (A >= C)) {
            System.out.print("largest is: A");

        // } else if ((B >= A) && (B >= C)) {
        } else if ((B >= C)) {
            System.out.print("largest is: B");

        } else {
            System.out.print("largest is: C");
        }
        sc.close();
    }
}
