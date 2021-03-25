import java.util.Scanner;

public class ConcatString {

	/**
	 * @param str
	 * @return
	 */
	public static StringBuilder concat(String[] str) {
		StringBuilder strbd = new StringBuilder();
		for (String s : str) {
			if(s==null)
				continue;
			else
				strbd.append(s);
		}
		if(strbd.length()==0) {
			System.out.println("They are no array values");
		}
		return strbd;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of array values");
		int n = Integer.parseInt(sc.nextLine());
		String[] str = new String[n];
		System.out.println("Enter the array values");
		for (int i = 0; i < n; i++) {
			str[i] = sc.nextLine();
		}
		sc.close();
		System.out.println("After Concatenation of Strings " + concat(str));

	}

}