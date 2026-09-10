package class_3;

import java.util.Scanner;

public class CheckRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Positive Number:");
        int num = sc.nextInt();
        if (num >=0 && num<10){
            System.out.println("Number is in the range of 0 to 10");
        } else if (num>10 && num<20) {
            System.out.println("Number is in the range of 11 to 19");
            
        }
        else{
            System.out.println("Number is greater than or equal to 20");
        }
    }
}
