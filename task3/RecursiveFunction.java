package task3;

import java.math.BigInteger;
import java.util.ArrayList;

public class RecursiveFunction {
    public static void main(String[] args) {
        ArrayList<BigInteger> A = new ArrayList<>();

        BigInteger[] f = new BigInteger[1000];
        f[0] = BigInteger.ONE;
        f[1] = BigInteger.valueOf(3);

        if (f[0].testBit(0)) A.add(f[0]);
        if (f[1].testBit(0)) A.add(f[1]);

        for (int n = 2; A.size() < 40; n++) {
            // f(n) = 5*f(n-1) + f(n-2)
            f[n] = f[n-1].multiply(BigInteger.valueOf(5)).add(f[n-2]);

            if (f[n].testBit(0)) {
                A.add(f[n]);
            }
        }

        System.out.println("A[39] = " + A.get(39));
    }
}