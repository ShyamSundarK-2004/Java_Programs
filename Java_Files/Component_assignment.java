class Component_assignment {
    public static void main(String[] args) {
        int n = 100;

        String res = (n%5==0 && !(n%2==0 || n%3==0))? "Yes":"No";
        // String res = (n%5==0 && !(n%2==0 && n%3==0))? "Yes":"No";
        System.out.println(res);
    }
}
