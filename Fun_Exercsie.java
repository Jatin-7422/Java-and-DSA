class Fun_Exercsie {

    public static void sum_odd(int n){
        int odd = 0;
        for (int i = 1; i <=n ; i++) {
            if (i%2 != 0) {
                odd+=i;
            }
        }
        System.out.println(odd);
    }

    public static void power(int n , int x){
        int InputVariable = 1;
        for (int i = 0; i < n; i++) {
            InputVariable = InputVariable * x;
        }
        System.out.println(InputVariable);
    }
    

    public static void main(String[] args) {
        sum_odd(5);
        power(2, 2); // find the power of the number
        
        int n = 5;
        int a = 0 , b = 1 ;
        System.out.print(a + " ");
        if (n>1) {
            for (int i = 2; i <= n; i++) {
                System.out.print(b+" ");
                int temp  = b;
                b = a + b;
                a = temp;
            }
            System.out.println();
        }
        
    }
}
