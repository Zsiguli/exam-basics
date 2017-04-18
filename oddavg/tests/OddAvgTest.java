import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.testng.AssertJUnit.assertEquals;

public class OddAvgTest {

  @Test
  public void testOddAverage_withEmptyList() throws Exception {
    List<Integer> listOfNumbers = new ArrayList<>();
    assertEquals(OddAvg.oddAverage(listOfNumbers), "There is no odd number in the list");
  }

  @Test
  public void testOddAverage_withNormalList() throws Exception {
    List<Integer> listOfNumbers = new ArrayList<>();
    for (int i = 0; i < 10; ++i) {
      listOfNumbers.add(i);
    }
    assertEquals(OddAvg.oddAverage(listOfNumbers), 5);
  }
}