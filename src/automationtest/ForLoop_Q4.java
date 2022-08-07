package automationtest;

import java.util.Scanner;

public class ForLoop_Q4 {
    public static void main(String[] args) {
        ForLoop_Q4 Q4 = new ForLoop_Q4();
        Q4.printMyname(10 , "Harita");
    }
    public void printMyname(int a, String b){
        System.out.println("how many time");
         Scanner sc = new Scanner(System.in);
         int name = (sc.nextInt());
        int i = name;

         for (i = 10 ; i < 0; i++);
        System.out.println("Harita");


    }
}
