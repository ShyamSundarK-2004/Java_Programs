import java.util.Scanner;

public class Prime_or_not {
    public static void main(String []args){
        Scanner sc=   new Scanner(System.in);
        boolean isprime = true;
        System.out.println("enter a value for n");
        int n = sc.nextInt();
        for(int i=2;i<n/2;i++){
            if(n%i==0)
                isprime = false;
        }

        System.out.println(isprime?"is prime":"not a prime");
    }
}
