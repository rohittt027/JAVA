// public class LeapYear {
//     public static void main(String[] args) {

//         int year = 2024;

//         if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
//             System.out.println("Leap Year");
//         } else {
//             System.out.println("Not a Leap Year");
//         }
//     }
// }





// -------------------------------------------------------------------------------------------------------

// import java.util.Scanner;

// public class LeapYear {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter yea");
//         int year = sc.nextInt();

//         if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
//             System.out.println("Leap Year");
//         } else {
//             System.out.println("Not a Leap Year");
            
//             sc.close();
            
//         }

//     }
// }


// -------------------------------------------------------------------------------------------------------


// import java.util.Scanner;

// public class LeapYear {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Input the year: ");
//         int year = sc.nextInt();

//         boolean x = (year % 4) == 0;
//         boolean y = (year % 100) != 0;
//         boolean z = ((year % 100 == 0) && (year % 400 == 0));

//         if (x && (y || z)) {
//             System.out.println(year + " is a leap year");
//         } else {
//             System.out.println(year + " is not a leap year");
//         }

//         sc.close();
//     }
// }
