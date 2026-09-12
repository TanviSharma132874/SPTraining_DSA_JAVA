package class_5;

import java.util.Scanner;

public class SumOfDigit_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        int rem;
        int sum = 0;
        while(num!=0){
//            while(num!=0){
            rem = num%10;
            sum = sum+rem;
            num = num/10;
//            num++;
        }
        System.out.println(sum);
//        for(System.out.println("hello");  ;){
//            System.out.println("HI");
//        }
//        for( ; ; ){}
    }
}
