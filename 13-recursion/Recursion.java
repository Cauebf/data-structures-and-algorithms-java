public class Recursion {

    public static void main(String[] args) {

        // recursion =  When a thing is defined in terms of itself. - Wikipedia
        //              Apply the result of a procedure, to a procedure.
        //              A recursive method calls itself. Can be a substitute for iteration.
        //              Divide a problem into sub-problems of the same type as the original.
        //              Commonly used with advanced sorting algorithms and navigating trees

        //              Advantages:
        //              easier to read/write
        //              easier to debug

        //              Disadvantages
        //              sometimes slower
        //              uses more memory

        walk(5);
        // walk(100000); // StackOverflowError
        System.out.println(factorial(5));
    }

    private static void walk(int steps) {

        // Iterative approach
        // for (int i = 0; i < steps; i++) {
        //    System.out.println("You take a step");
        // }

        // Recursive approach
        if (steps < 1) return; // base case
        System.out.println("You take a step");
        walk(steps - 1); // recursive case
    }

    private static int factorial(int n) {

        if (n == 1) return 1; // base case
        return n * factorial(n - 1); // recursive case
    }
}
