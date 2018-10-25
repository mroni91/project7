package conditionalstatement;

import java.util.Scanner;

public class CompareValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers: " );    //+ sc.nextInt());
        int num1 = sc.nextInt(), num2 = sc.nextInt();


        //int num1 = 10, num2 = 20;

        if(num1>num2){
            System.out.println("Num1 is grater then num2");
        }else {
            System.out.println("Num2 is greater then num1");
        }
    }
}
