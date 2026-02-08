

public class findtwosum {
    public static void main(String[] args) {
        int [] a = {2,7,4,11,15};
        int target = 13;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i] + a[j] == target){
                    System.out.println(i+"  "+j);
                }
            }
        }
       
    }   
    
}
