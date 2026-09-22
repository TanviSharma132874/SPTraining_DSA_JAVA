package class_5;

import java.util.Scanner;

public class NoOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
//        int count =0;
//        while(num>0){
////            while(num!=0){
//            num = num/10;
//            count++;
//        }
//        System.out.println(count);
        int digit = (int)Math.log10(num)+1;
        System.out.println(digit);
    }
}
//  Count of odd number..
//
//class Solution {
//    public int countOdds(int low, int high) {
//        int count = 0;
//        for (int i = low; i<=high; i++){
//            if(i %2 != 0){
//                count++;
//            }
//        }
//        return count;
//    }
//}

//
//if(high %2 ==0){
//high--;
//        }
//        if(low>high){
//        return 0;
//        }
//        else{
//        return ((high+1)/2 - (low/2));
//        }
//        }
//        }


//        return ((high+1)/2 - (low/2));
