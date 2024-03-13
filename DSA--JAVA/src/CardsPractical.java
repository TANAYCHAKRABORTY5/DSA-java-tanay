import java.util.*;

class Cardd {
    private String symbol;
    private String name;

    public Cardd(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }
}

public class CardsPractical {
    private Map<String, List<Cardd>> cardMap;

    public CardsPractical() {
        cardMap = new HashMap<>();
    }

    public void addCard(Cardd card) {
        String symbol = card.getSymbol();
        cardMap.computeIfAbsent(symbol, k -> new ArrayList<>()).add(card);
    }

    public List<Cardd> getCardsBySymbol(String symbol) {
        return cardMap.getOrDefault(symbol, Collections.emptyList());
    }

    public static void main(String[] args) {
        CardsPractical cardCollection = new CardsPractical();

        // Adding sample cards
        cardCollection.addCard(new Cardd("Hearts", "Ace of Hearts"));
        cardCollection.addCard(new Cardd("Spades", "King of Spades"));
        cardCollection.addCard(new Cardd("Hearts", "Two of Hearts"));
        cardCollection.addCard(new Cardd("Diamonds", "Queen of Diamonds"));

        // Retrieving cards by symbol
        String searchSymbol = "Spades";
        List<Cardd> cardsWithSymbol = cardCollection.getCardsBySymbol(searchSymbol);

        // Displaying the result
        System.out.println("Cards with symbol " + searchSymbol + ":");
        for (Cardd card : cardsWithSymbol) {
            System.out.println(card.getName());
        }
    }
}
