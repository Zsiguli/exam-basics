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

}