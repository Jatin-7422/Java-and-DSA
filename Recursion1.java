class Recursion1 {

    public static void printnumbers(int n) {
        if (n==6) {
            return;  // Base Condition
        }

        System.out.println(n); //Print  statement
        printnumbers(n+1); //Recursion
    }

    // Sum of N Natural Numbers

    public static void PrintNaturalNumbers(int i , int n, int sum) { // (Kis number prr hai , base condition , sum)
       
        if (i==n) {

            sum+=i;
            System.out.println(sum);
            return;
        }

        sum += i ;
        PrintNaturalNumbers( i+1, n,  sum); 
        
    }

    //Factorial Number

    public static int FactorialNumber(int n) {

        if (n==1 || n==0) {
            return 1;
        }

        int fact_nm1 = FactorialNumber(n-1);
        int fact_n = n*fact_nm1;

        return fact_n;
    }

    // Fibonacci Series 
    public static void PrintFibonacciSeries(int a, int b, int n) { // (0 , 1 , n-2 --> number of terms)
        if (n==0) {
            return;
        }

        int c = a+b;
        System.out.println(c);

        PrintFibonacciSeries(b, c, n-1);
    }

    // x^n (Stack Height = n)
    public static int calcxpower(int x , int n ){
        if (n==0) { // base case 1
            return 1;
        }
        if (x==0) { // base case 2
            return 0;
        }


        int xPow_1 = calcxpower(x,n - 1);
        int xPown = x * xPow_1;

        return xPown;
    }


    // x^n  (Stack Height = logn)
    public static int calcxpower2(int x , int n ){
        if (n==0) { // base case 1
            return 1;
        }
        if (x==0) { // base case 2
            return 0;
        }

        if (n%2==0) {
            return calcxpower2(x,n/2)*calcxpower2(x, n/2);
        } else {
            
            return calcxpower2(x,n/2)*calcxpower2(x, n/2) *x;
        }
        
    }

    public static void main(String[] args) {
        int n=1;

        printnumbers(n);

        PrintNaturalNumbers(1, 5, 0);

        int var = FactorialNumber(5);
        System.out.println(var);

        int a=0, b=1;
        System.out.println(a);
        System.out.println(b);
        int x =7;
        PrintFibonacciSeries(a, b, x-2);

        System.out.println(calcxpower(2, 5));
        System.out.println(calcxpower2(2, 5));
    }
}