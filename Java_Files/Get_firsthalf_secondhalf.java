import java.util.Scanner;

class Get_firsthalf_secondhalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] a = {10,20,30,40,50};
        System.out.println("original array:");
        for(int arr:a)
            System.out.println(arr);

        System.out.println();

        int [] firsthalf = get_firsthalf(a);

    }

    public static int[] get_firsthalf(int []arr){
        int mid = arr.length/2;
        int [] first_half = new int[mid];
        for(int i=0;i<mid;i++)
            first_half[i] = arr[i];

        return first_half;
    }
}