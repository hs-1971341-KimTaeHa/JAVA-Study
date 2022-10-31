
public class BoxEX {
	public static void main(String[] args) {
			Box a = new Box(2,4);
			Box b = new Box(5,5);
			System.out.println("박스 a " + a);
			if(a.equals(b)) System.out.println("가로세로가 모두 같습니다.");
			else System.out.println("가로나 세로가 다릅니다.");
			if(Box.compare(a, b)) System.out.println("a의 면적이 큽니다.");
			else System.out.println("a의 면적이 크지 않습니다.");
			Box c = a.clone(); // c는 a의 복사본 리턴
			System.out.println("박스 c " + c);
			Box d [] = Box.make(5); // 5개의 Box 배열 리턴
			System.out.print("박스들 ");
			for(Box k : d) {
				System.out.print(k);
			}
		}
}
