import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the letter");
        char l=sc.next().charAt(0);
        //System.out.println(l);
        switch(l){
            case 'A':
                System.out.println("EXCELLENT");
                break;
            case 'B':
                System.out.println("GOOD");
                break;
            case 'C':
                System.out.println("AVERAGE");
                break;
            case 'D':
                System.out.println("POOR");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }

        
    }
    
}
