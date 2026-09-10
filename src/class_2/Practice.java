package class_2;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args){
        System.out.println("Enter a Num:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result = (num>0)?"Positive":"Negative";
        System.out.println(result);
        String output = (num% 2 == 0)?"Even":"Odd";
        System.out.println(output);
    }

}
