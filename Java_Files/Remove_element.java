
import java.util.Scanner;

public class Remove_element {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        int [] a = new int[size];

        for(int i =0;i<size;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("enter the index to remove");
        int index = sc.nextInt();

       if(index>a.length && index<0){
        System.out.println("invalid index");
       }else{
        for(int i=index;i<a.length-1;i++)
        a[i] = a[i+1];
       }
           
        System.out.println("after removing");
        for(int i=0;i<a.length-1;i++)
        System.out.print(a[i]+" ");



    }
}
