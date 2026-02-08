
import java.util.Scanner;

public class Shifting_right {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of times to shift");
        int shift = sc.nextInt(); 
        int [] a= {1,2,3,4,5};
        
        for(int j = 0;j<shift;j++){
            int temp = a[a.length-1];
            for(int i=a.length-1;i>0;i--){
                a[i] = a[i-1];
            }
            a[0] = temp;
        }
      

        for(int arr : a)
            System.out.print(arr+" ");
    }

}
