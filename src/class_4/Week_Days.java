package class_4;

import java.util.Scanner;

public class Week_Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Week Number: ");
        int week = sc.nextInt();
        switch (week){
            case 1: case 2: case 11: case 12:

                System.out.println("Winter");
                break;
            case 3: case 4: case 5: case 6:

                System.out.println("Summer");
                break;
            case 7: case 8: case 9: case 10:
                System.out.println("Rainy");
                break;
            default:
                System.out.println("Invalid");
//
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Invalid week day");
        }
    }
}
