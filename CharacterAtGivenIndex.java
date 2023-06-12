import java.util.Scanner;
public class CharacterAtGivenIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s1=sc.nextLine();
        System.out.println("Enter the index number");
        int i=sc.nextInt();
        char[] arr=new char[30];
        arr=s1.toCharArray();
        System.out.println("Character at index "+i+" is "+arr[i]);

 
    }
    
}
