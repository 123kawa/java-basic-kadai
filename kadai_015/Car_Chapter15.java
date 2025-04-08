package kadai_015;

public class Car_Chapter15 {
	
	private int gear = 1;
	private int speed = 10;
	
	public void gearChange(int afterGear) {
		if(afterGear > 0 && afterGear < 6) {
			speed = afterGear * 10;
		} else {
			speed = 10;
		}
		System.out.println( "ギア" + gear + "から" + afterGear + "に切り替えました");
	}
	
	public void run() {
		System.out.println( "速度は時速" + speed + "kmです" );
	}
}
