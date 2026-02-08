class Increment {
   public static void main(String[] args) {
    int a = 20;
    int b = -10;
    //int c = (a++)+b;
    int c = a+(++b);//sir took this
    int d = (a++) - (b++) + (++c);
    System.out.println(a+","+b+","+c+","+d);

   }    
}
