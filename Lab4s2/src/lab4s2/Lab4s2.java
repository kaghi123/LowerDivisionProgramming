package lab4s2;

import java.util.Scanner;

public class Lab4s2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String in = input.next();
        
        int value = Integer.parseInt(in);
        System.out.println(getTimeForRecursive(value));
        System.out.println(getTimeForDynamic(value));

    }

    public static long getTimeForRecursive(int n) {

        long startTime1 = System.currentTimeMillis();

        fib1(n);

        return System.currentTimeMillis() - startTime1;

    }

    public static long fib1(long index) {
        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else {
            return fib1(index - 1) + fib1(index - 2);
        }
    }

    public static long getTimeForDynamic(int n) {

        long startTime2 = System.currentTimeMillis();

        fib2(n);

        return System.currentTimeMillis() - startTime2;

    }

    public static long fib2(long n) {
        long f0 = 0;
        long f1 = 1;
        long f2 = 1;

        if (n == 0) {
            return f0;
        } else if (n == 1) {
            return f1;
        } else if (n == 2) {
            return f2;
        }

        for (int i = 3; i <= n; i++) {
            f0 = f1;
            f1 = f2;
            f2 = f0 + f1;
        }
        return f2;
    }
}
