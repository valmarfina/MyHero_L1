package Strategy;

public class Riding implements Activity {

  @Override
  public Point move(Point before, Point after) {
    System.out.println("...riding...");
    System.out.println("from " + before + " to " + after);
    return after;
  }
}
