package class_3;

import java.util.Scanner;

public class NotesCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Amount");
        int amount = sc.nextInt();

        if(amount >=500){
            int notes = amount/500;
            amount= amount%500;
            System.out.println("500 notes are:"+notes);
        }
        if(amount >=200){
            int notes = amount/200;
            amount= amount%200;
            System.out.println("200 notes are:"+notes);
        }
        if(amount >=100){
            int notes = amount/100;
            amount= amount%100;
            System.out.println("100 notes are:"+notes);
        }
        if(amount >=50){
            int notes = amount/50;
            amount= amount%50;
            System.out.println("50 notes are:"+notes);
        }
        if(amount >=20){
            int notes = amount/20;
            amount= amount%20;
            System.out.println("20 notes are:"+notes);
        }
        if(amount >=10){
            int notes = amount/10;
            amount= amount%10;
            System.out.println("10 notes are:"+notes);
        }
        if(amount >=5){
            int notes = amount/5;
            amount= amount%5;
            System.out.println("5 notes are:"+notes);
        }
        if(amount >=2){
            int notes = amount/2;
            amount= amount%2;
            System.out.println("2 notes are:"+notes);
        }
        if(amount == 1){
            int notes = amount;
            System.out.println("1 notes are:"+notes);
        }

    }
}


//
//int amount = sc.nextInt();
//int notes = amount/500;
//amount = amount%500;
//        System.out.println("500 notes are : "+notes);
//notes = amount/200;
//amount = amount%200;
//        System.out.println("200 notes are : "+notes);
//notes = amount/100;
//amount = amount%100;
//        System.out.println("100 notes are :"+notes);
//notes = amount/50;
//amount = amount%50;
//        System.out.println("50 notes are :"+notes);
//notes = amount/20;
//amount = amount%20;
//        System.out.println("20 notes are :"+notes);
//notes = amount/10;
//amount = amount%10;
//        System.out.println("10 notes are :"+notes);
//notes = amount/5;
//amount = amount%5;
//        System.out.println("5 notes are :"+notes);
//notes = amount/2;
//amount = amount%2;
//        System.out.println("2 notes are :"+notes);
//notes = amount/1;
//amount = amount%1;
//        System.out.println("1 notes are :"+notes);