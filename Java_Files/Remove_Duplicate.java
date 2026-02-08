import java.util.Scanner;

public class Remove_Duplicate{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        int [] a = new int [size];
        System.out.println("enter the array elements");
        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
       int k =  RemoveDuplicate(a);

        for(int i=0;i<k;i++){
            System.out.print(a[i]+ " ");
        }
    }


    public static int  RemoveDuplicate(int [] nums){
        if(nums ==null||nums.length==0)
            return 0;
        
        int uniqueindex = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] !=nums[uniqueindex]){
                uniqueindex++;
                nums[uniqueindex] = nums[i];
            }
        }
            return uniqueindex+1;
    }
}