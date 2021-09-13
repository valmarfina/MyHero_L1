package Strategy;

public class Hero {
  Point point;
  Activity activity;

  public Hero(Point point, Activity activity) {
    this.point = point;
    this.activity = activity;
  }

  public void setActivity(Activity activity) {
    if(activity == null){
      System.err.println("activity error");
      System.exit(1);
    }
    this.activity = activity;
  }

  public void move(Point point) {
    this.point = activity.move(this.point, point);
  }
}
