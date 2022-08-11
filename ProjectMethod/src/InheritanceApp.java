class Cal {
	public int sum(int v1, int v2) {
		return v1+v2;
	}
}

class Cal3 extends Cal {
	public int minus(int v1, int v2) {
		return v1-v2;
	}
}


public class InheritanceApp {

	public static void main(String[] args) {
		Cal3 c3 = new Cal3();
		System.out.println(c3.sum(3, 3));
		System.out.println(c3.minus(3, 3));
	}

}
