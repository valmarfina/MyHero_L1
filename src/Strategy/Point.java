package Strategy;

public class Point {
  private int x = 0;
  private int y = 0;

  //конструктор
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

//нужны ли геттеры и сеттеры? 0_o

  public void printPoint() {
    System.out.println("{" + this.x + ";" + this.y + "}");
  }

  @Override
  public String toString() {
    return x + ";" + y;
  }
}
