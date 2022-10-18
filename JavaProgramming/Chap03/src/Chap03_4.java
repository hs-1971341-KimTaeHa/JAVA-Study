import java.util.Scanner;
public class Chap03_4 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String ch = s.nextLine();
		char c = ch.charAt(0);
		for(int k=0;k<c-'a';k++) {
			for(char i='a';i<=c-k;i++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
