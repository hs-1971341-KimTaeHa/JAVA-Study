import java.util.Scanner;

public class Chap02_4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		int n1,n2,n3, num;
		n1 = s.nextInt();
		n2 = s.nextInt();
		n3 = s.nextInt();
		if(n1 > n2) {
			if(n1 < n3)num=n1;
			else num= n3;
		}
		else {
			if( n2 < n3)num = n2;
			else num = n3;
		}
		
		System.out.println("중간 값은 "+num);
	}

}
