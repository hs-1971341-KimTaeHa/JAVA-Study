import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ClassApp {

	public static void main(String[] args) throws FileNotFoundException {
		
		// Class
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.6));
		System.out.println(Math.ceil(1.6));
		
		// 인스턴스
		PrintWriter p1 = new PrintWriter("result1.txt");
		p1.write("Hello 1");
		p1.close();
	}
}
