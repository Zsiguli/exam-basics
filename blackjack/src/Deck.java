import java.util.ArrayList;
import java.util.List;

public class Deck {
  final static String[] colors = {"Clubs", "Diamonds", "Hearts", "Spades"};
  final static String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

  List<Card> actualDeck = new ArrayList<>();

  public Deck(int numberOfCardsInTheDeck) {
    int colorController = (int) (Math.random() * 4);
    for (int i = 0; i < numberOfCardsInTheDeck; ++i) {
      int randomValue = (int) (Math.random() * 13);
      actualDeck.add(new Card(colors[colorController++ % 4], values[randomValue]));
    }
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
