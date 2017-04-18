import java.util.List;

public class OddAvg {
  public static void main(String[] args) {
    // Create a function called `oddAverage` that takes a list of numbers as parameter
    // and returns the average value of the odd numbers in the list
    // Create basic unit tests for it with at least 3 different test cases
  }

  public static double oddAverage(List listOfNumbers) {
    int wholeValue = 0;
    int oddCounter = 0;
    double averageValue;
    for (int i = 0; i < listOfNumbers.size(); ++i) {
      int actualNumber = (int) listOfNumbers.get(i);
      if (actualNumber % 2 != 0) {
        wholeValue += actualNumber;
        ++oddCounter;
      }
    }
    try {
      averageValue = wholeValue / oddCounter;
      return averageValue;
    } catch (ArithmeticException ex) {
      return .0;
    }
  }
}
