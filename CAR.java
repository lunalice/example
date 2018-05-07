/**
 * Class Untitled
 */
public class CAR {
    protected String name; //名前
    protected int speed; //速度
    protected int mileage; //走行距離
    
    //コンストラクタ
    public CAR(String name,int speed){
        this.name = name;
        this.speed = speed;
        this.mileage = 0;
    }
    
    // 走る振る舞い
    public void run(){
        this.mileage = mileage + speed;
    }
    
    // 名前を返す
    public String getName(){
        return name;
    }
    
    // 走行距離を返す
    public int getMileage(){
        return mileage;
    }
    
}