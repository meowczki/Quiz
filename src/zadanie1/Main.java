package zadanie1;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger bigX=new BigInteger("10");
        BigInteger bigY=new BigInteger("2");
        System.out.println("x+y= "+bigX.add(bigY));
        System.out.println("x-y= "+bigX.subtract(bigY));
        System.out.println("x/y= "+bigX.divide(bigY));
        System.out.println("x*y= "+bigX.multiply(bigY));

    }
}
