import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHandling {

	public static void main(String[] args) {
		try {
			FileWriter fileWriter = new FileWriter("products.txt");
			List<String> products = new ArrayList<String>();
			products.add("Iphone");
			products.add("Ipad");
			products.add("MacBook");
			products.add("AppleWatch");
			products.add("AirPods");
			for (String str : products) {
				fileWriter.write(str + System.lineSeparator());
			}
			fileWriter.close();
			System.out.println("List is added to the file.");
		} catch (IOException e) {
			System.out.println("Exception is occurred.");
			e.printStackTrace();
		}

	}

}
