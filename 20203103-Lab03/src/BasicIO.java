import java.util.*;

class BasicIO {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter your name: ");
		
		String name = stdin.nextLine();
		System.out.println("your name is " + name);
		
		System.out.print("Enter your age: ");
		int years = stdin.nextInt();
		
		System.out.println("your day is " + (365 * years));
		
		System.out.print("Enter your height: ");
		int height = stdin.nextInt();
		
		System.out.printf("%1$tY년 %1$tB %1$te일 현재 %2$s(%3$d)의 키는 %4$d cm 입니다."
				,new Date(),name,years,height);
		stdin.close();
	} 
}