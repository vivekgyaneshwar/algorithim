package algorithms;

public class BigO {


    public void foo(int[] array) {

        for (int i = 0; i < array.length; i++) {
            // ...
        }

        for (int i = 0; i < array.length; i++) {
            // ...
        }

    }

    public void bar(int[] array1, int[] array2) {

        for (int i = 0; i < array1.length; i++) {
            // ...
            for (int j = 0; j < array2.length; j++) {
                // ...
            }
        }

    }

    public void baz(int[] array) {

        for (int i = 0; i < array.length; i++) {
            // ...
            for (int j = 0; j < array.length; j++) {
                // ...
                if (array[i] < array[j]) {
                    // Launch!
                }
            }
        }

    }

    public void beep(int[] array) {

        for (int i = 0; i < array.length; i++) {
            // ...
            for (int j = 0; j < array.length; j++) {
                // ...
                for (int k = 0; k < 9999999; k++) {
                    // Jump!
                }
            }
        }

    }

    public static void main(String[] args) {
        int n = 100;
//        constantComplexity(n);
//        linearComplexity(n);
//        logNComplexity(n);
        //nLogNComplexity(n);
//        polynomialComplexity(8);
//        exponentialComplexity(6);
        factorialComplexity(n);
    }

    private static void linearComplexity(int n) {

        int m = n-2;
        //O(n)
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        ////O(m)
        for (int i = 0; i < m; i++) {
            System.out.println(i);
        }
    }

    private static void factorialComplexity(int n) {
        //In most cases, this is pretty much as bad as it'll get.
        // This class of algorithms has a run time proportional to the factorial of the input size.
        //example of this is solving the traveling salesman problem using a brute-force approach to solve it.
        //4*3*2*1=24
        for (int i = 1; i <= factorial(4); i++){
            System.out.println("Hey - I'm busy looking at: " + i);
        }
    }

    private static int factorial(int n) {
        //exit condition
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }

    private static void exponentialComplexity(int n) {
        //Now we are getting into dangerous territory; these algorithms grow in proportion to some factor
        // exponentiated by the input size. O(2^n) algorithms double with every additional input.
        //O(3^n) algorithms triple with every additional input, O(kn) algorithms will get k times bigger with every additional input.
        int count=0;
        for (int i = 1; i <= Math.pow(3, n); i++){
//            System.out.println("Hey - I'm busy looking at: " + i);
            count++;
        }
        System.out.println(count);
    }

    private static void polynomialComplexity(int n) {
        //quadratic O(n^2) is faster than O(n^3) which is faster than O(n^4), ..O(n^n)etc.
        int count = 0;
        for (int i = 1; i <=n; i++) {
            count++;
            for(int j = 1; j <=n; j++) {
                count++;
                for(int k = 1; k < n; k++) {
                    count++;
                    //System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
                }
            }
        }
        System.out.println("total iterations--"+count);
    }

    private static void nLogNComplexity(int n) {
        for (int i = 1; i <= n; i++){
            for(int j = 1; j < n; j = j * 2) {
                System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
            }
        }
    }

    private static void logNComplexity(int n) {
        //Constant time algorithms are (asymptotically) the quickest. Logarithmic time is the next quickest.
        //running time grows in proportion to the logarithm of the input (in this case, log to the base 2):
        for (int i = 1; i < n; i = i * 2){
            System.out.println("Hey - I'm busy looking at: " + i);
        }
    }

    private static int constantComplexity(int n) {
        //example is also constant time. Even if it takes 3 times as long to run, it doesn't depend on the size of the
        // input, n. We denote constant time algorithms as follows: O(1). Note that O(2), O(3) or even O(1000)
        // would mean the same thing.

        System.out.println("Hey - your input is: " + n);
        System.out.println("Hmm.. I'm doing more stuff with: " + n);
        System.out.println("And more: " + n);
        return n;
    }
}