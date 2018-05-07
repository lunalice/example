/**
 * Class Untitled
 */
public class EXAMPLE_1 {
	public static void main(String[] args) {
    	String car_name_1 = "ホンダ"; //車の名前
    	int speed_1 = 40; // 速度
    	int mileage_1 = 0; // 走行距離
    	// 10分間走行させる
    	for(int i=0;i<10;i++){
    	    mileage_1 += speed_1;
    	}
    	System.out.println(car_name_1 + "の走行距離は" + mileage_1 + "です！");
	}
}