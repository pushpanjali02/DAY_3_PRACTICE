import java.util.Scanner;
public class Substring{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s1=sc.nextLine();
        System.out.println("Enter the string which we want to ckeck whether it is there in the above string or not");
        //String s1=sc.nextLine();
        String s2=sc.nextLine();
        boolean b1=s1.contains(s2);
        if(b1==true){
            System.out.println(s2+" present in "+s1);
        }
        else{
            System.out.println(s2+" not present in "+s1);
        }
    }
}