package class_5;

public class SumOfOddNo {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i<=20; i++){
            if(i%2 != 0){
//                System.out.println(i);
                sum = sum +i;
            }
        }
        System.out.println(sum);
    }
}
