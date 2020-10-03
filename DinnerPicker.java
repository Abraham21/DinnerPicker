import java.util.HashMap;
import java.util.Map;

public class DinnerPicker {

  private static final int NUMBER_ROUNDS = 10;
  private static final int WIN = 4;
  private static final int VALUE_FOR_A_TIE = 5;

  public static void main(String[] args) {

    Option bk = new Option("Burger King");
    Option sh = new Option("Shwarma");
    Option hb = new Option("Hawaiian BQQ");

    Option[] options = {bk, sh, hb};

    Option winner = getWinner(options);
    System.out.println("WINNER WINNER CHICKEN DINNER: " + winner.getName());
  }

  public static Option getWinner(Options[] options) {
    for (int round = 0; round < NUMBER_ROUNDS; round++) {
      int randOption = (int) Math.random() * options.length;
      options[randOption].incrementCount();
      if (options[randOption].getCount() == WIN) {
        return options[randOption];
      }
    }
    Option maxOption = options[0];
    for (int option = 1; option < options.length; option++) {
      int optionCount = option.getCount();
      if (optionCount > maxOption.getCount()) {
        maxOption = options[option];
      } else if (optionCount == VALUE_FOR_A_TIE && maxOption.getCount() == VALUE_FOR_A_TIE) {
        return getCoinTossWinner(options[option], maxOption);
      }
    }

  }

  public static Option getCoinTossWinner(Option option1, Option option2) {
    int coinToss = (int) Math.random() * 2;
    if (coinToss == 0) {
      return option1;
    }

    return option2;
  }
}