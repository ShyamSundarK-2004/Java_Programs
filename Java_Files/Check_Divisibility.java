import java.util.Scanner;

public class Check_Divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number to check devisibility:");
        int num = sc.nextInt();

        if(num%5==0 && num%11==0){
            System.out.println(num+" is divisible by both 5 and 11");
        }
        else{
            System.out.println(num+" is not divisible by both 5 and 11");
        }
        sc.close();
    }
    
}
