package principal;

public class ReverseWords {

	public static void main(String[] args) {
		
		System.out.println(solution("Word"));
		System.out.println(betterSolution("Word"));
		
	}
	
	public static String solution (String str) {
		
		String[] words = str.split("");
		String[] rWords = new String[words.length];
		StringBuilder builder = new StringBuilder();
		Integer j = 0;
		
		for(int i = words.length; i > 0; i--) {
			rWords[j] = words[i-1];
			j++;
		}
		
		for (String string : rWords) {
			builder.append(string);
		}
		
		String reverse = builder.toString();
		
		return reverse;
	}
	
	public static String betterSolution (String str) {
		return new StringBuffer(str).reverse().toString();
	}

}
