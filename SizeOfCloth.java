import java.util.Scanner;
public class SizeOfCloth{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the symbol");
        char c= sc.next().charAt(0);
        if(c=='S'||c=='s'){
            System.out.println("Small");

        }
        else if(c=='L'||c=='l'){
            System.out.println("Large");

        }
        else if(c=='M'||c=='m'){
            System.out.println("Medium");


        }
        else{
            System.out.println("Invaild input");
        }
    }
}


