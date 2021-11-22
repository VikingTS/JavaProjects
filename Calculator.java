import java.util.Scanner;


public class Calculator {


    public static void main (String[] args){
        //System.out.println("Hello World!");
        char operator;
        double num1, num2;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Operator (+) (-) (*) (/)");
        operator = input.next().charAt(0);

        System.out.println("Enter First Number: ");
        num1 = input.nextDouble();
        System.out.println("Enter Second Number: ");
        num2 = input.nextDouble();

        input.close();

        switch(operator){
            case '+': 
                System.out.printf("%.2f + %.2f = %.2f", num1, num2, (num1+num2));
                break;
            case '-': 
                System.out.printf("%.2f - %.2f = %.2f", num1, num2, (num1-num2));
                break;
            case '*': 
                System.out.printf("%.2f X %.2f = %.2f", num1, num2, (num1*num2));
                break;
            case '/': 
                if (num2 != 0){
                    System.out.printf("%.2f  / %.2f = %.2f", num1, num2, (num1/num2));
                }
                else {
                    System.out.println("We are Unable to Divide By Zero!");
                }
                break;
            default:
                System.out.printf("You Have Entered an Invalid Operator");
        }
    
    }
}