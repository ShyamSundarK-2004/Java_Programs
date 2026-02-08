public class Logical_AND {
    public static void main(String[] args) {
        char size = 'l';
        int money = 1000;

        char t_size = 'l' ;
        int price = 750 ;
        String res = size == t_size && money>=price ? "Buy" : "Can't buy";

        System.out.println(res);

    }
}
