import java.util.Scanner;

public class EnhancedFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of array values");
		int n = sc.nextInt();
		System.out.println("Enter the array values");
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		int i = 0;
		System.out.println("The alternate elements of array in odd position are ");
		for (int a : array) {
			if (i % 2 == 0)
				System.out.println(a);
			i++;
		}
		int[] revarr = new int[n];
		System.out.println("Array in Reverse Order ");
		int j = n - 1;
		for (int a : array) {
			revarr[j] = a;
			j--;
		}
		for (int a : revarr) {
			System.out.println(a);
		}
	}

}
