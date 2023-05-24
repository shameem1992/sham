import java.util.Scanner;

import java.util.Map;
import java.util.HashMap;
public class NewString {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = scanner.nextLine();
		HashMap<Character, Integer> omap =new HashMap<>();
		for (int i = 0; i < s.length(); i++) 
		{
			if(omap.containsKey(s.charAt(i))){
				int count =omap.get(s.charAt(i));
				omap.put(s.charAt(i), ++count);
			}
			else
			{
				omap.put(s.charAt(i),1);
			}

		}
		System.out.println("Charecter counts:");
		for (Map.Entry<Character, Integer> entry : omap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
