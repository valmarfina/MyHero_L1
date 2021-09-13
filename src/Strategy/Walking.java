package Strategy;

public class Walking implements Activity {

  @Override
  public Point move(Point before, Point after) {
    System.out.println("...Walking...");
    System.out.println("from " + before + " to " + after);
    return after;
  }
}
