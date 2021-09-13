package Strategy;

public class Hero {
  Point point;
  Activity activity;

  public Hero(Point point, Activity activity) {
    this.point = point;
    this.activity = activity;
  }

  public void setActivity(Activity activity) throws Exception {
    if(activity == null){
      throw new Exception("activity null");
    }
    this.activity = activity;
  }

  public void move(Point point) {
    this.point = activity.move(this.point, point);
  }
}
