import java.util.Scanner;
public class concatenation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 2 strings");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println("String after concatenation is "+s1.concat(s2));
    }
    
}
