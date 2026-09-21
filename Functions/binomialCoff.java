package Functions;

public class binomialCoff {
    public static int Factorial(int n){
        int f = 1;

        for(int i = 1; i <= n ; i++){
            f = f * i;
        }
        return f; // factorial of n
    }

    public static int binomialCofficiant(int n, int r){
          int fact_n = Factorial(n);
          int fact_r = Factorial(r);
          int fact_nmr = Factorial(n - r);

          int binomialCoff = fact_n / (fact_r * fact_nmr);
          
          return binomialCoff;
    }

    public static void main(String[] args) {
         System.out.println(Factorial(4 )); 
         System.out.println(binomialCofficiant(5,2));
    }
    
}
