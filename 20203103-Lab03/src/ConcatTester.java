public class ConcatTester {
	public static void main(String[] args) {
		String animal1 = "quick brown fox ";
		String animal2 = "lazy dog ";
		String article = "the ";
		String action = "jumps over ";
		
		String ans = "";
		ans = ans.concat(article).concat(animal1).concat(action).concat(article).concat(animal2);
		System.out.println(ans);
	}
}