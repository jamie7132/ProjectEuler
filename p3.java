//largest prime factor of 600851475143
import java.math.BigInteger;

public class p3 {
	public static void main(String[] args) {
		BigInteger n = new BigInteger("600851475143");
		BigInteger maxPrime = new BigInteger("-1");

		for (BigInteger i = new BigInteger("2"); i.compareTo(n) <= 0; 
				i = i.add(BigInteger.ONE)) {

			if (n.remainder(i).equals(BigInteger.ZERO)) {
				n = n.divide(i);

				if (i.isProbablePrime(100)) {
					maxPrime = i;
				}
			}
		}

		System.out.println(maxPrime);
	}
}