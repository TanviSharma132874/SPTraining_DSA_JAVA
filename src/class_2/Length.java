package class_2;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Length {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String Name = sc.nextLine();
        System.out.println("Length of the name :"+ Name.length());

        System.out.println("Enter a Character : ");
        char ch = sc.next().charAt(0);

        int ascii = ch;
        System.out.println("The ascii of character" +ch + "is :"+ascii);
        System.out.println("The ascii of character" +ch + "is :"+(int) ch);
        System.out.println("22" + "10");
    }
}
