import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.testng.AssertJUnit.assertEquals;

public class OddAvgTest {

  @Test
  public void testOddAverage_withoutOddNumbersInTheGivenList() throws Exception {
    List<Integer> listOfNumbers = new ArrayList<>();
    assertEquals(OddAvg.oddAverage(listOfNumbers), .0);
  }

  @Test
  public void testOddAverage_withNormalList() throws Exception {
    List<Integer> listOfNumbers = new ArrayList<>();
    for (int i = 0; i < 10; ++i) {
      listOfNumbers.add(i);
    }
    assertEquals(OddAvg.oddAverage(listOfNumbers), 5.0);
  }

  @Test
  public void testOddAverage_withDoubleResult() throws Exception {
    List<Integer> listOfNumbers = new ArrayList<>();
    for (int i = 0; i < 10; ++i) {
      if (i == 3) {
        continue;
      } else {
        listOfNumbers.add(i);
      }
    }
    assertEquals(OddAvg.oddAverage(listOfNumbers), 5.5);
  }
}