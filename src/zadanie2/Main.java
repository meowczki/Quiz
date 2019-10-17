package zadanie2;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            System.out.println("factorialFloat=" + factorialFloat(i) + " dla n= " + i);
        }
        BigInteger n = new BigInteger("31");
        BigInteger x = new BigInteger("1");
        for (BigInteger i = new BigInteger("1"); i.compareTo(n) == -1; i = i.add(x)) {
            System.out.println("factorialBigInteger=" + factorialBigInteger(i) + " dla n= " + i);
        }
    }

    public static float factorialFloat(int n) {
        float fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static BigInteger factorialBigInteger(BigInteger n) {
        BigInteger fact = new BigInteger("1");
        BigInteger x = new BigInteger("1");
        for (BigInteger i = new BigInteger("1"); i.compareTo(n.add(x)) == -1; i = i.add(x)) {
            fact = fact.multiply(i);
        }
        return fact;
    }
}
