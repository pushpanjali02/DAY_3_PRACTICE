import java.util.Scanner;
public class SumOf2Numbers {
    public static void main(String[] args) {
       
        new SumOf2Numbers().getvalues();
    }
    public void getvalues(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sum=summation(num1,num2);
        System.out.println("sum is: "+sum);
    }
    public int summation(int num1,int num2){
        return num1+num2;
    }
}
