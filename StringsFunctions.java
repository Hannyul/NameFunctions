import java.util.HashMap;
import java.util.Map;

public class StringsFunctions {

	public static void main(String[] args) {
		String fullName = "Hanaa Alharbi";
		
		//1. count letters
		System.out.println("Your name: " + fullName + "\nLetters: "+ countLetters(fullName));
		
		//2. reverse
		System.out.println(reverse(fullName));
		
		//3. count vowels 
		HashMap<String, Integer> countVowels = countVowels(fullName.toUpperCase());
		
		//4. print
		printMap(countVowels);
	}
	
	public static int countLetters(String fullName) {
		return fullName.replaceAll("\s+", "").length();
	}
	
	public static Object reverse(String fullName) {
		return new StringBuilder(fullName).reverse();
	}
	
	public static HashMap<String, Integer> countVowels(String fullName) {
		HashMap<String, Integer> countVowels = new HashMap<String, Integer>();
		countVowels.put("A", 0);
		countVowels.put("E", 0);
		countVowels.put("I", 0);
		countVowels.put("O", 0);
		countVowels.put("U", 0);

		for (int i = 0; i < fullName.length(); i++) {
			
			for (String vowel : countVowels.keySet()) {
				
				if ((""+fullName.charAt(i)).contains(vowel)) {
					countVowels.replace(vowel, 1+countVowels.get(vowel));
					break;
				}
			}
		}
		return countVowels;
	}
	
	public static void printMap(HashMap<String, Integer> countVowels) {
		countVowels.entrySet().forEach( row -> {
		    System.out.println( row.getKey() + " : " + row.getValue() );
		});
	}
}
