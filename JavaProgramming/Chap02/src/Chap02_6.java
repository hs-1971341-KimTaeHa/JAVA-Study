import java.util.Scanner;
public class Chap02_6 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오 >>");
		int num = s.nextInt();

		if(((num%10 != 0) && ((num%10) % 3 == 0)) && ((num/10) % 3 == 0)) {
			System.out.println("박수짝짝");
		}
		else if(((num%10) % 3 == 0) || ((num/10) % 3 == 0)) {
			System.out.println("박수짝");
		}
	}
}
