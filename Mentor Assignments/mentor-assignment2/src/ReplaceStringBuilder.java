import java.util.Scanner;

public class ReplaceStringBuilder {

	/**
	 * @param strbd
	 * @return
	 */
	public static StringBuilder replace(StringBuilder strbd) {
		for (int i = 0; i < strbd.length(); i++) {
			if (i < strbd.length() - 4)
				strbd.replace(i, i + 1, "X");
		}

		return strbd;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		StringBuilder strbd = new StringBuilder();
		strbd.append(sc.next());
		System.out.println("The new string is:" + replace(strbd));
		sc.close();

	}

}
