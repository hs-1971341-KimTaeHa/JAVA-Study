
public class TV{
	private String tv;
	private int year;
	private int inc;
	TV(String tv, int year, int inc){
		this.tv = tv;
		this.year = year;
		this.inc = inc;
	}
	public void show() {
		System.out.println(tv + "에서 만든 " + year + "년 " + inc +"인치");
	}
}
