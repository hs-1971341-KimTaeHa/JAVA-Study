import java.util.Scanner;
public class Chap02_8 {

	public static boolean inRect(int x,int y) {
		if((x >= 100 && x <= 200) || (y >= 100 && y <= 200))return true;
		else return false;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("(x1,y1),(x2,y2) >>");
		int x1 = s.nextInt();
		int y1 = s.nextInt();
		int x2 = s.nextInt();
		int y2 = s.nextInt();
		if(inRect(x1,y1) || inRect(x2,y2)) {
			System.out.println("충돌");
		}
		else System.out.println("충돌 x");
	}

}
