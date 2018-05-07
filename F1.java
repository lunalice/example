/**
 * Class Untitled
 */
public class F1 extends CAR {
    
    // コンストラクタ
    public F1(String name,int speed){
        super(name,speed);
    }
    
    @Override
    public void run(){
        super.mileage = super.mileage + super.speed * 2;
    }
}