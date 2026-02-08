class Conditional1{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 50;
        int res = a>b? a>c?a:c : b>c?b:c;
        System.out.println(res);
        // int res1 = a>b?a:b;
        
        // System.out.println(res1>c?res1:c);
        
        
    }
}