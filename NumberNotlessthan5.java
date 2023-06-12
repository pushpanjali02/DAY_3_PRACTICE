import java.util.Scanner;
public class NumberNotlessthan5 {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>5){
                System.out.println(arr[i]);
               
            }
            else{
                break; 
            }
        }       
    }
    
}
