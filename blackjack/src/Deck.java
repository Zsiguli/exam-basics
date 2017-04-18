import java.util.ArrayList;
import java.util.List;

public class Deck {
  final static String[] colors = {"Clubs", "Diamonds", "Hearts", "Spades"};
  final static String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
  final static List<Card> fullDeck = Deck.full();

  List<Card> actualDeck = new ArrayList<>();

  public Deck(int numberOfCardsInTheDeck) {
    List<Card> temp = full();
    int colorController = (int) (Math.random() * 4);
    int cardCounter = 0;
    while (cardCounter < numberOfCardsInTheDeck) {
      int randomValue = (int) (Math.random() * 13);
      for (Card card : temp) {
        if (card.getColor() == colors[colorController % 4] && card.getValue() == values[randomValue]) {
          temp.remove(card);
          actualDeck.add(card);
          ++colorController;
          ++cardCounter;
          break;
        }
      }
      if (cardCounter == 52) {
        return;
      }
    }
  }

  public static List<Card> full() {
    List<Card> fullDeck = new ArrayList<>();
    for (String color : colors) {
      for (String value : values) {
        fullDeck.add(new Card(color, value));
      }
    }
    return fullDeck;
  }

  @Override
  public String toString() {
    String asString = new String();
    int amountOfClubs = 0;
    int amountOfDiamonds = 0;
    int amountOfHearts = 0;
    int amountOfSpades = 0;

    for (Card card : actualDeck) {
      switch (card.getColor()) {
        case "Clubs":
          ++amountOfClubs;
          break;
        case "Diamonds":
          ++amountOfDiamonds;
          break;
        case "Hearts":
          ++amountOfHearts;
          break;
        case "Spades":
          ++amountOfSpades;
          break;
      }
    }

    asString += actualDeck.size() + " cards -  ";
    asString += amountOfClubs + " Clubs, ";
    asString += amountOfDiamonds + " Diamonds, ";
    asString += amountOfHearts + " Hearts, ";
    asString += amountOfSpades + " Spades";
    return asString;
  }

  public Card draw() {
    Card drawn = actualDeck.get(0);
    actualDeck.remove(0);
    return drawn;
  }

  public void shuffle() {
    List<Card> temp = new ArrayList<>();
    do {
      int randomCard = (int) (Math.random() * actualDeck.size());
      temp.add(actualDeck.get(randomCard));
      actualDeck.remove(randomCard);
    } while (actualDeck.size() > 0);
    actualDeck = temp;
  }
}
