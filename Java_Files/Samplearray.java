class Samplearray {
    public static void main(String[] args) {
        int  num = 1234,temp = num; 
        String n =""+num;
        int count = n.length(), rev =0; 
         temp = num;
        for(int i=0;i<count/2;i++,num/=10){
            rev = rev*10+num%10;
        }
        n = ""+num+rev;
        System.out.println(n);
        

    }
}