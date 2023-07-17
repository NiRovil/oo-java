package principal;

public class Sentence {
	public static void main(String[] args) {
		
		String[] w = {"hello", "world", "this", "is", "great"};
		String[] q = {};
		String[] e = {"He"};
		
		System.out.println(solution(w));
		System.out.println(solution(q));
		System.out.println(solution(e));
	}
	
	public static String solution(String... words) {
		
		StringBuffer string = new StringBuffer();
		
		for (String st : words) {
			string.append(st);
			string.append(" ");
		}
		
		return string.toString().trim();

	}
}
