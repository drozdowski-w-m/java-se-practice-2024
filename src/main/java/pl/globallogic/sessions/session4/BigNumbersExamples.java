package pl.globallogic.sessions.session4;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigNumbersExamples {

    private static BigInteger calculateFactorialBig(int number){
        BigInteger result = BigInteger.ONE;

        for (int i= number; i>0 ; i--){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(calculateFactorialBig(1000).toString().length());
        BigInteger bigNumber1 = new BigInteger("2132312445558127481246781254812578126387123681231274681281");
        BigInteger bigNumberFromArray = new BigInteger(
                new byte[]{64,56,34,78,90}
        );
        BigInteger bigIntegerFromInteger = BigInteger.valueOf(2131826568348L);

        BigInteger i = new BigInteger("45");
        BigInteger j = new BigInteger("63");
// GCD
        System.out.println(j.gcd(i));
        System.out.println(i.multiply(j).mod(new BigInteger("4")));
//immutability
//problem with big decimal - substract 0.04 - 0.03
// same with bigdecimal
        double d1 = 0.04;
        double d2 = 0.03;
        System.out.println(d1 - d2);

        BigDecimal bigd1 = new BigDecimal("0.04");
        BigDecimal bigd2 = new BigDecimal("0.03");
        System.out.println(bigd1.subtract(bigd2));

        BigDecimal alotofSignsAfterComa = new BigDecimal("232315.7128368712638216821");
        MathContext context = new MathContext(3, RoundingMode.CEILING);
        System.out.println(alotofSignsAfterComa.abs(context));







    }
}
