
import java.util.Scanner;

public class Chap04_4 {
	static Scanner scanner = new Scanner(System.in);
	private static String kor[] = {"사랑","아기","돈","미래","희망"};
	private static String eng[] = {"love","baby","money","future","hope"};
	public static String kor2Eng(String word) {
		for(int i=0; i<kor.length;i++) {
			if(word.equals(kor[i]))
				return eng[i];
		}
		return null;
	}
	public static void main(String[] args) {
		String word, en;
		while(true) {
			word = scanner.next();
			if(word.equals("그만"))
				break;
			en = kor2Eng(word);
			
			if(en != null)
				System.out.println(en);
			else {
				System.out.println(word + "는 저의 사전에 없습니다.");
			}
		}
	}

}
