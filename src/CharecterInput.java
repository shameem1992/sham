
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class CharecterInput {
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
     System.out.print("Enter a string: ");
     String s = scanner.nextLine();

    
     HashMap<Character, Integer> charCounts = new HashMap<>();

    
     for (char c : s.toCharArray()) {
       
         if (charCounts.containsKey(c)) {
             charCounts.put(c, charCounts.get(c) + 1);
         } else {
             
             charCounts.put(c, 1);
         }
     }

   
     System.out.println("Character counts:");
     for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
         System.out.println(entry.getKey() + ": " + entry.getValue());
     }
 }
}






