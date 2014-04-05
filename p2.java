//Sum of even valued Fibonacci numbers less than 4M
public class p2 {
	public static void main(String[] args) {
		int a = 1, b = 1, c = 0;
		int sum = 0;

		while (c < 4000000) {
			if (c % 2 == 0) {
				sum += c;
			}
			
			c = a + b;
			a = b;
			b = c;
		}

		System.out.println(sum);
	}
}