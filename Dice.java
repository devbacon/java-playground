import java.lang.Math;

public class Dice {
  public static void main(String[] args) {
    System.out.println(roll(20));
  }

  public static int roll(int sides) {
    return (int) Math.random() * sides + 1;
  }

  public static double testRand() {
    return Math.random();
  }
}