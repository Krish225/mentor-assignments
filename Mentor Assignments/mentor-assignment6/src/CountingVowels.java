import java.io.IOException;
import java.util.Scanner;

public class CountingVowels {

	public static int countVowels(char[] ch) {
		int count = 0;
		for (char c : ch) {
			try {
				if (c == 'x')
					throw new IOException();
			} catch (IOException e) {
				System.out.println("Exception is found");
			}
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}

		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		sc.close();
		str = str.toLowerCase();
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		System.out.println("Vowels " + countVowels(ch));

	}

}
