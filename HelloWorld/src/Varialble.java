
public class Varialble {

	public static void main(String[] args) {
		double a = 1;
		int b = 2;
		char c = '2'; // char는 아스키 코드 값
		System.out.println(a+b+c);
		
		int d = '2';
		System.out.println(d);
		
		var e = 1;
		System.out.println(e);
		
		String f = "1";	// String은 int와 + 할때 문자열로 바꿔서
		int g = 2;
		System.out.println(f+g);
		System.out.println(g+f);
		
		String name = "egoing";
		System.out.println("Hello " + name + "..." + name + " bye");
		System.out.println(("Hello "+name).replace("egoing", "taeha"));
		
		
		// Casting
		// 1 to String
		String casting = Integer.toString(1);
		System.out.println(casting.getClass()); // getClass() = typeof()
	}

}
