import java.util.Scanner;
public class initials {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s1=sc.nextLine();
        System.out.println("String enetered is: "+s1);
        System.out.println(s1.charAt(0));
        int i;
        

        System.out.println("Initials");
        for(i=0;i<s1.length();i++){
            if(s1.charAt(i)>=65 && s1.charAt(i)<=90){
                System.out.println(s1.charAt(i));
            }
        }
    }

    
}
