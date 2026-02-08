import java.util.Scanner;

public class Shifting_left {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of times to shift");
        int shift = sc.nextInt(); 
        int [] a= {1,2,3,4,5};
        
        for (int j = 0; j < shift; j++) {
            int temp = a[0];
            for(int i=0;i<a.length-1;i++){
            a[i] = a[i+1];
            }
            a[a.length-1] = temp;
    }

        for(int arr : a)
            System.out.print(arr+" ");
    }
    }

