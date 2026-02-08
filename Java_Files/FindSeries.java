import java.util.Scanner;

public class FindSeries {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = 5;
    
    int first = 30;
    int second = 35;
    int third = 0;

    int odd = 8,even =6;
    System.out.print(first+" "+second+" ");

    for(int i=1;i<n;i++){
        if(i%2==1){
            third = first+odd;
            first = third;
            odd= odd+8;
        }else{
            third = second+even;
            second = third;
            even+=6;
        }
        
        System.out.print(third + " ");
    }
    
  }
}

