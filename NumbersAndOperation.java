import java.util.Scanner;
public class NumbersAndOperation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers and the symbol of the operation to be performed");
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        char ch=sc.next().charAt(0);
        System.out.println(num1+" "+num2+" "+ch);
        switch(ch){
            case '+':
                System.out.println("sum is "+(num1+num2));
                break;
            case '-':
                System.out.println("Subtraction of 2 numbers is: "+(num1-num2));
                break;
            case '*':
                System.out.println("Product is: "+(num1*num2));
                break;
            case '/':
                System.out.println("Quotient is: "+(num1/num2));
                break;
            default:
                System.out.println("Invalid input");
                break;


        }
    }
}
