/**
 * Class Untitled
 */
public class EXAMPLE_6 {
	public static void main(String[] args) {
		CAR honda = new CAR("ホンダ",40);
		CAR matsuda = new CAR("マツダ",50);
		CAR f1 = new F1("F1",50);
    	// 10分間走行させる
    	for(int i=0;i<10;i++){
    	    honda.run();
    	    matsuda.run();
    	    f1.run();
    	}
    	System.out.println(honda.getName() + "の走行距離は" + honda.getMileage() + "です！");
    	System.out.println(matsuda.getName() + "の走行距離は" + matsuda.getMileage() + "です！");
    	System.out.println(f1.getName() + "の走行距離は" + f1.getMileage() + "です！");
	}
}