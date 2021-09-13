package Strategy;

public class Flying implements Activity {

  @Override
  public Point move(Point before, Point after) {
    System.out.println("...Flying...");
    System.out.println("from " + before + " to " + after);
    return after;
  }
}
