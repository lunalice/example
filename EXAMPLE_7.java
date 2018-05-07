import java.util.*;

/**
 * Class Untitled
 */
public class EXAMPLE_7 {
	public static void main(String[] args) {
		List<CAR> car_box = new ArrayList<CAR>(){
			{
				add(new CAR("ホンダ",40));
				add(new CAR("マツダ",50));
				add(new F1("F1",50));
			}
		};
		COURSE course_16 = new COURSE(16);// コースを生成
		for(CAR car:car_box){
    		course_16.doStart(car);
    		System.out.println(car.getName() + "の走行距離は" + car.getMileage() + "です！");
		}
	}
}