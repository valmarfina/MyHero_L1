package Strategy;

public class HeroRunner {
  public static void main(String[] args) throws Exception {
    Hero myHero = new Hero(new Point(0,0), new Flying());

    myHero.move(new Point(1,4));

    myHero.setActivity(new Riding());
    myHero.move(new Point(3,0));

    myHero.setActivity(new Walking());
    myHero.move(new Point(-5,5));
  }
}
