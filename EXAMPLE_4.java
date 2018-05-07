/**
 * Class Untitled
 */
public class EXAMPLE_4 {
	public static void main(String[] args) {
		CAR honda = new CAR("ホンダ",40);
		CAR matsuda = new CAR("マツダ",50);
    	// 10分間走行させる
    	for(int i=0;i<10;i++){
    	    honda.run();
    	    matsuda.run();
    	}
    	System.out.println(honda.getName() + "の走行距離は" + honda.getMileage() + "です！");
    	System.out.println(matsuda.getName() + "の走行距離は" + matsuda.getMileage() + "です！");
	}
}