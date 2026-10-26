import java.util.Scanner;

public class WeekAndWeekend {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("enter day number :");
        int dayNo = sc.nextInt();

        switch(dayNo){
            // case 1:{}
            // case 2:{}
            // case 3:{}
            // case 4:{}
            // case 5:{System.out.println("Weekday"); break;}
            // case 6:{}
            // case 7:{System.out.println("Weekend"); break;}
            // default: System.out.println("Invalid day");

            case 1, 2, 3, 4, 5:{System.out.println("Weekday"); break;}
            case 6, 7:{System.out.println("Weekend"); break;}
            default:System.out.println("Invalid day");
        }
        sc.close();

    }
}