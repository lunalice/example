/**
 * Class Untitled
 */
public class COURSE {
    private int minute_course;
    
    // 時間をセット
    public COURSE(int minute){
        this.minute_course = minute;
    }
    
    // 車を走らせるメソッド
    public void doStart(CAR car){
        for(int i=0;i<minute_course;i++){
            car.run();
        }
    }
}