public class Find_max_value {
    public static void main(String[] args) {
        int [] a = {1,2,8};
        int length = a.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int arr: a){
            if(arr<min) min= arr;
            if(arr>max) max = arr;
        }
        
        int count =0;
        for(int i=min+1;i<max;i++){
            for(int arr:a)
                if(i==arr)
                    count--;
            count++;          
        }
        System.out.println(count);
    }
    
}
