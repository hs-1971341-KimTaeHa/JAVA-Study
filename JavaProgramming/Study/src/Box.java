
public class Box {
	private int height, width;
	Box(int x, int y){
		height = x;
		width = y;
	}
	
	boolean equals(Box s) {
		if((height == s.height)&&(width == s.width) )
			return true;
		else return false;
	}
	
	static boolean compare(Box a, Box b) {
		if(a.height*a.width > b.height*b.width) {
			return true;
		}
		else return false;
	}
	
	protected Box clone() {
		return this;
	}
	
	static Box[] make(int n) {
		Box[] b = new Box[n];
		for(int i=0; i<n; i++) {
			b[i] = new Box(i,i);
		}
		return b;
	}
	
	public String toString() {
		return "[" + height + "x" + width + "]";
	}
}
