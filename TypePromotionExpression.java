// import java.util.*;

// public class TypePromotionExpression {
//     public static void main(String[] args){
//         char a = 'a';
//         char b = 'b';
        // char c = a - b; --> error
        // System.out.println((int)(b));
        // System.out.println((int)(a));
        // System.out.println(a);
//         // System.out.println(b-a);
//     }


    
// }



// ----------------------------------------------------------------------------------------

// public class TypePromotionExpression {
//     public static void main(String[] args){
//         short a = 5;
//         byte b = 25;
//         char c = 'c';
//         byte bt = (byte) (a + b + c);
//         System.out.println(bt);
//     }
// }


// ---------------------------------------------------------------------------------------------

// public class TypePromotionExpression {

//     public static void main(String[] args){
//         int a = 10;
//         float b = 20.25f;
//         long c = 25;
//         double d = 30;
//         double ans = a + b + c + d;
//         System.out.println(ans);
//     }
// }



// ----------------------------------------------------------------------------------------------

// public class TypePromotionExpression {

//     public static void main(String[] args) {
//         byte b = 5;
//         byte a = (byte) (b * 2);
//         System.out.p 
//     }
// }


// ---------------------------------------------------------------------------------------------------

// public class TypePromotionExpression {
//     public static void main(String[] args) {
//         byte a = 10;
//         char b = 'a'; // ASCII/Unicode value = 97
//         short c = 20;
//         int d = 50;
//         float e = 5.5f;
//         double f = 12.34;

//         // Expression evaluation:
//         // 1. (a * b) me a (byte) aur b (char) int ban jate hain -> result int
//         // 2. (d / c) me c (short) int ban jata hai -> result int
//         // 3. (f * e) me e (float) double ban jata hai -> result double
//         // Final result poora double ban jata hai.
//         double result = (a * b) + (d / c) - (f * e);

//         System.out.println("Result: " + result);
//     }
// }