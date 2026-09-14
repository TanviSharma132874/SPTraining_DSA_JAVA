package class_6;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        char choice;
        do{
            System.out.println("Do you want to continue. Press Y/N....");
            Scanner sc = new Scanner(System.in);
            choice = sc.next().charAt(0);
            int num = (int)Math.random()*100;

        }while (choice=='Y'||choice=='y');
    }
}
