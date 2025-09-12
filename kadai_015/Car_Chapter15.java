package kadai_015;

public class Car_Chapter15 {
	//フィールド
	private int gear	= 1;
	private int speed	=10;
	
	//コンストラクタ
	public Car_Chapter15(int gear,int speed) {
		this.gear		= gear;
		this.speed		= speed;
	}

	//ギアの値により速度を変えるメソッド
	public  void changeGear(int afterGear) {
		int beforeGear = this.gear;
		gear		= afterGear;
	
		if( 2 == afterGear) {
			speed = 20;
		}else if ( 3 == afterGear) {
			speed = 30;
		}else if ( 4 == afterGear) {
			speed = 40;
		}else if ( 5 == afterGear) {
			speed = 50;
		}else {
			speed = 10;
		}
		System.out.println("ギア"+ beforeGear +"から"+ this.gear + "に切り替えました");
	}
	//速度を記載する
	public void run() {
		System.out.println("速度は時速"+ this.speed + "kmです");
	
	}
}
