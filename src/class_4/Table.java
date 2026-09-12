package class_4;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();
        for(int i =10; i>0; i--){
            System.out.println("Table of "+num+" is:"+num*i);
        }
    }
}
