import org.junit.*;
import static org.junit.Assert.*;

public class coinCombinationTest{

// the app takes the input and return the output
  @Test
public void runCoinCombination_getInputReturnOutput_true() {
  CoinCombination testCoinCombination = new CoinCombination();
  Boolean expected = true ;
  assertEquals(expected, testCoinCombination.runCoinCombination("50"));
  }
}
