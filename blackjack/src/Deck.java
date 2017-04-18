import java.util.ArrayList;
import java.util.List;

public class Deck {
  final static String[] colors = {"Clubs", "Diamonds", "Hearts", "Spades"};
  final static String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

  List<Card> cardList = new ArrayList<>();

  public Deck(int numberOfCardsInTheDeck) {
    int colorController = (int) Math.random() * 4;
    for (int i = 0; i < numberOfCardsInTheDeck; ++i) {
      int randomValue = (int) Math.random() * 13;
      cardList.add(new Card(colors[colorController++ % 4], values[randomValue]));
    }
  }

  @Override
  public String toString() {
    String asString = new String();
    int amountOfClubs = 0;
    int amountOfDiamonds = 0;
    int amountOfHearts = 0;
    int amountOfSpades = 0;

    for (Card card : cardList) {
      switch (card.getColor()) {
        case "Clubs" : ++amountOfClubs;
        break;
        case "Diamonds" : ++amountOfDiamonds;
        break;
        case "Hearts" : ++amountOfHearts;
        break;
        case "Spades" : ++amountOfSpades;
        break;
      }
    }

    asString += cardList.size() + " cards -  ";
    asString += amountOfClubs + " Clubs, ";
    asString += amountOfDiamonds + " Diamonds, ";
    asString += amountOfHearts + " Hearts, ";
    asString += amountOfSpades + " Spades";
    return asString;
  }

  public Card draw() {
    Card drawn = cardList.get(0);
    cardList.remove(0);
    return drawn;
  }
}
