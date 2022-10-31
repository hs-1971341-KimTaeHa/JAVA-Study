
public class Rectangle {
	int x, y, width, height;
	
	Rectangle(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public void show() {
		System.out.println("(" + x + "," + y + ")에서 크기가 " + width + "x" + height + "인 사각형");
	}
	
	public int square() {
		return width*height;
	}
	
	boolean contains(Rectangle r) {
		if((r.x + width <= this.x + width && r.x >= this.x) && (r.y + height <= this.y + height && r.y >= this.y)) {
			return true;
		}
		else {
			return false;
		}
	}
}
