import java.util.Scanner;
public class Count_Vowels{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string: ");
        String s = sc.next();
        char [] ch = {'a','e','i','o','u'};
        int count =0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            for(char vowel : ch ){
                if(c == vowel){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}