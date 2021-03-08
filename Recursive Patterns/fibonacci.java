public class fibonacci {

    public static int fibo(int n){
       
        if ( n == 0 ) return 0;
        if (n == 1) return 1;
        int value = fibo(n-1) + fibo(n-2);
        //System.out.println( n +"=" + value);
        return value;
    }
    public static void main(String[] args) {
       System.out.println(fibo(10));


       int n = 30, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        System.out.println("");
    }
}
