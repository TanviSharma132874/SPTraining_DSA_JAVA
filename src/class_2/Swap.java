package class_2;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
//        int temp;
        System.out.println("Before swapping :"+"a is :"+ a +"b is :" + b);
//        temp = a;
//        a = b;
//        b = temp;



//          a = a+b;
//          b = a-b;
//          a = a-b;


        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println("After swapping :"+"a is :"+ a +"b is :" + b);
    }
}
