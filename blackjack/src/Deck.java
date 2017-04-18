import java.util.ArrayList;
import java.util.List;

public class Deck {
  final static String[] colors = {"Clubs", "Diamonds", "Hearts", "Spades"};
  final static String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

  List<Card> cardList = new ArrayList<>();

  public Deck(int numberOfCardsInTheDeck) {
    for (int i = 0; i < numberOfCardsInTheDeck; ++i) {
      int randomColor = (int) Math.random() * 4;
      int randomValue = (int) Math.random() * 13;
      cardList.add(new Card(colors[randomColor], values[randomValue]));
    }
  }

  @Override
  public String toString() {
    String asString = new String();
    asString += cardList.size() + " cards -  ";
    asString += "num" + " Clubs, ";
    asString += "num" + " Diamonds, ";
    asString += "num" + " Hearts, ";
    asString += "num" + " Spades";
    return asString;
  }
}
