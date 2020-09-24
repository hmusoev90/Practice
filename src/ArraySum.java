
public class ArraySum {
	public static void main(String[] args) {

		int[] numbers = { -3, 0, 2, 12, 3, -3, 18 };

		int count = 3, sum, max = 0;
		for (int row = 0; row < numbers.length; row++) {
			sum = 0;
			for (int col = row; col < count; col++) {
				sum += numbers[col];
			}
			if (sum > max) {
				max = sum;
			}
			count++;
			if (count > numbers.length) {
				break;
			}
		}

		System.out.println(max);
	}
}
