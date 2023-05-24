import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class StringInput {
	public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        
        HashMap<Character, Integer> charCounts = new HashMap<>();

      
        for (char c : string.toCharArray()) {
            
            if (charCounts.containsKey(c)) {
                charCounts.put(c, charCounts.get(c) + 1);
            } else {
                
                charCounts.put(c, 1);
            }
        }

       
        System.out.println("Duplicate characters:");
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }

	

}
}