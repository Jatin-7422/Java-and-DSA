class Variables {
    public static void main(String[] args) {
        //  Variables
        int a = 10;
        int b = 15;
        int sum = a+b;
        System.out.println(sum);

        double amount = 1.56;
        System.out.println(amount+sum);

        String name  = "Jatin Kumar";
        System.out.println(name);


        // Dynamic typed language
        name  = "Vasu kumar";
        sum = a * b;
        System.out.println(sum + " " + name);


        //  solve this  => a * b / a - b 
        a=5;
        b=4;
        int ans  = (a * b ) / (a - b);
        System.out.println(ans);
    }
}
