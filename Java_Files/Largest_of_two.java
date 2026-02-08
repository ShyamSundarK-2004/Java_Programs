import java.util.Scanner;

class Largest_of_two {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n1:");
        int n1 = sc.nextInt();
        System.out.println("enter the value of n2:");
        int n2 = sc.nextInt();

        if(n1>n2){
            System.out.println(n1+" is the largest");
        }
        else{
            System.out.println(n2+" is the largest");
        }
        
    }
    
}
