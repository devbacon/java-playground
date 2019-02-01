public class Dice {
  public static void main(String[] args) {

  }

  /*
    Take in number of dice to be rolled and sides on each dice
      (5, 6) => Totals up 5 rolls of a 6 sides dice
  */
  public static int roll(int numOfDice, int sidesOnDice) {
    int max = numOfDice * sidesOnDice;
    int min = numOfDice;
    int range = max - min + 1;

    return (int) (Math.random() * range) + min;
  }
}