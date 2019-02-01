/**
 * This class is a dice utility for tabletop board games.
 * It takes in dice roll data and return a randomized result within a calculated range.
 */
public class Dice {
  public static void main(String[] args) {

  }

  /**
   * This method takes in two whole numbers.
   * These numbers represent how many dice you would like to roll and how many sides each dice has.
   * The return value is a randomized total of that dice roll.
   * 
   * @param numOfDice number of dice to be rolled
   * @param sidesOnDice number of sides on each dice
   * @return random number between minimum and maximum roll result
   */
  public static int roll(int numOfDice, int sidesOnDice) {
    int max = numOfDice * sidesOnDice;
    int min = numOfDice;
    int range = max - min + 1;

    return (int) (Math.random() * range) + min;
  }
}