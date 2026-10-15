// import java.util.Scanner;

// class PrimeNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         boolean isPrime = true;

//         if (n <= 1) {
//             isPrime = false;
//         }

//         for (int i = 2; i <= Math.sqrt(n); i++) {
//             if (n % i == 0) {
//                 isPrime = false;
//                 break;
//             }
//         }

//         if (isPrime) {
//             System.out.println("Prime Number");
//         } else {
//             System.out.println("Not a Prime Number");
//         }

//         sc.close();
//     }
// }


// -------------------------------------------------------------------------------------------------------

// import java.util.*;

// public class PrimeNumber {

//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter Your Number:");
//          int n = sc.nextInt();

//         if (n <= 1) {
//             System.out.println("Not a Prime Number");
//         } else {
//             int count = 0;

//             for (int i = 1; i <= n; i++) {
//                 if (n % i == 0) {
//                     count++;
//                 }
//             }

//             if (count == 2) {
//                 System.out.println("Prime Number");
//             } else {
//                 System.out.println("Not a Prime Number");
//             }
//         }
//         sc.close();
//     }
// }