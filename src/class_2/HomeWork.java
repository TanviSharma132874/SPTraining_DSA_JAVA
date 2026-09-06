package class_2;
import java.util.Scanner;
public class HomeWork {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Name: ");
        String Fname = sc.next();
        System.out.println("Enter the Last Name: ");
        String Lname = sc.next();
        System.out.println("The Full Name is : " + Fname + " " + Lname);
    }
}
