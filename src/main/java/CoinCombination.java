import java.util.ArrayList;
import java.util.HashMap;


public class CoinCombination {
  public static ArrayList<Object> runCoinCombination(String input) {
    ArrayList<Object> changeGiven = new ArrayList<Object>();
    Integer quartersGiven = 0;
    Integer inputGiven = Integer.parseInt (input);
  //  changeGiven.add(30);
  //  changeGiven.add(20);
  while(inputGiven > 0){
    if (inputGiven >= 25){
      quartersGiven++;
      inputGiven=inputGiven-25;
    }
  }
    changeGiven.add(quartersGiven);
    return changeGiven;
  }
}
