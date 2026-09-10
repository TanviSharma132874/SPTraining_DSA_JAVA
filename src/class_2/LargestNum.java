package class_2;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        String output = (a>b)?"a is larger":"b is larger";
        System.out.println(output);

    }
}
