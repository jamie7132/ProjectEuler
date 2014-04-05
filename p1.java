//sum of numbers less than 1000 divisible by 3 or 5
public class p1 {
	public static void main(String[] args) {
		System.out.println(sumDivBy(999, 3) + sumDivBy(999, 5) 
			- sumDivBy(999, 15));
	}

	public static int sumDivBy(int upperBound, int divBy) {
		return divBy * (upperBound / divBy) * (upperBound / divBy + 1) / 2;
	}
}