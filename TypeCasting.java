// public class TypeCasting {
//     public static void main(String[] args){
//         double x = 10.85;
//         int y = (int) x;
//         System.out.println(y);
//     }
    
// }


// ---------------------------------------------------------------------------------------------------

// public class TypeCasting {

//     public static void main(String[] args){
//         int largeNumber = 130;
//         byte byteNumber = (byte) largeNumber;
        
//         System.out.println("Byte value is:" + byteNumber);
//     }
// }


// ___________________________________________________________________________________________________

// public class TypeCasting {

//     public static void main(String[] args){
//         double valDouble = 150.99;
//         int valInt = (int) valDouble;

//         System.out.println("Origina value :" + valDouble);
//         System.out.println("Casted value :" + valInt);
//     }
// }

// ---------------------------------------------------------------------------------------------------

// public class TypeCasting {
//     public static void main(String[] args) {
//         // 1. Implicit / Widening Casting (Automatic)
//         // Chhote data type se bade data type me convert hona (int -> double)
//         int num = 25;
//         double doubleNum = num;

//         System.out.println("--- Widening (Implicit) Casting ---");
//         System.out.println("Integer value: " + num);
//         System.out.println("Converted to Double: " + doubleNum);

//         // 2. Explicit / Narrowing Casting (Manual)
//         // Bade data type se chhote data type me convert karna (double -> int)
//         double price = 99.75;
//         int roundedPrice = (int) price; // Manual casting zaroori hai

//         System.out.println("\n--- Narrowing (Explicit) Casting ---");
//         System.out.println("Double value: " + price);
//         System.out.println("Converted to Integer: " + roundedPrice);
//     }
// }