import java.util.Scanner;

public class ReplaceString {

	/**
	 * @param str
	 * @return
	 */
	public static String replace(String str) {
		char[] c = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			c[i] = str.charAt(i);
			if (i < str.length() - 4)
				c[i] = 'X';
		}

		String str1 = new String(c);
		return str1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		System.out.println("The new string is:" + replace(str));
		sc.close();

	}

}
