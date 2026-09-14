package class_5;

public class Rev_Num {
    public static void main(String[] args) {
        int num = 5432;
        int rem;
        int rev_num=0;
        while(num!=0){
            rem = num%10;
            rev_num = rev_num*10+rem;
            num = num/10;


        }
        System.out.println(rev_num);
    }

}

//
//class Solution {
//    public int reverse(int x) {
//        long rev_num = 0;
//        while(x != 0){
//            int rem = x % 10;
//
//
//            rev_num = rev_num * 10 + rem;
//            x = x/10;
//        }
//        if(rev_num < Integer.MIN_VALUE || rev_num > Integer.MAX_VALUE){
//            return 0;
//        }
//        return (int) rev_num;