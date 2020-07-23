package bronze5;

import java.util.Scanner;

public class WhereIsJoJang {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		if(a%5==0) {
			System.out.println(a/5);
		}
		else if(a%5!=0)
			System.out.println((a/5)+1);

	}
}
