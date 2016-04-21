import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class coinCombinationTest{

// the app takes the input and return the output
//   @Test
// public void runCoinCombination_getInputReturnOutput_ArrayList() {
//   CoinCombination testCoinCombination = new CoinCombination();
//   ArrayList<Object> expected = new ArrayList<Object>();
//   expected.add(2);
//   assertEquals(expected, testCoinCombination.runCoinCombination("50"));
//   }

  //the app gets the input and returns the euivalent in CoinCombination
  @Test
public void runCoinCombination_getInputReturnEquivalentQuarters_ArrayList() {
  CoinCombination testCoinCombination = new CoinCombination();
  ArrayList<Object> expected = new ArrayList<Object>();
  expected.add(2);
  assertEquals(expected, testCoinCombination.runCoinCombination("50"));
  }

  // @Test
  // public void runCoinCombination_getInputReturnEquivalentDimes_ArrayList() {
  //   CoinCombination testCoinCombination = new CoinCombination();
  //   ArrayList<Object> expected = new ArrayList<Object>();
  //   expected.add(2);
  //   expected.add(3);
  //   assertEquals(expected, testCoinCombination.runCoinCombination("80"));
  // }
}
