package class_3;

import java.util.Scanner;

public class EleBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Units of electricity bill:-");
        int units = sc.nextInt();
        if(units<=50){
            double Bill = units*0.50*1.2;
            System.out.println("Bill amount is:"+Bill);
        } else if (units<=100) {
            double Bill = (25+(units-50)*0.75)*1.2;
            System.out.println("Bill amount is:"+Bill);
        }else if (units<=200) {
            double Bill = (100+(units-150)*1.2)*1.2;
            System.out.println("Bill amount is:"+Bill);

        }else{
            double Bill = (220+(units-250)*1.5)*1.2;
            System.out.println("Bill amount is:"+Bill);
        }
    }
}
