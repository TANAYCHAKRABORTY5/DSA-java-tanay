

import java.util.*;

class Card {
    String symbol;
    int number;

    Card(String symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }
}

public class javaclass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Card>> cardsMap = new HashMap<>();


        System.out.print("Enter Number of Cards: ");
        int numCards = scanner.nextInt();
        scanner.nextLine(); // consume the newline


        for (int i = 1; i <= numCards; i++) {
            System.out.println("Enter card " + i + ":");
            String symbol = scanner.nextLine().trim().toLowerCase();
            int number = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            Card card = new Card(symbol, number);


            if (cardsMap.containsKey(symbol)) {
                cardsMap.get(symbol).add(card);
            } else {
                List<Card> cardList = new ArrayList<>();
                cardList.add(card);
                cardsMap.put(symbol, cardList);
            }
        }


        List<String> distinctSymbols = new ArrayList<>(cardsMap.keySet());
        Collections.sort(distinctSymbols);
        System.out.println("\nDistinct Symbols are: " + String.join(" ", distinctSymbols));


        for (String symbol : distinctSymbols) {
            System.out.println("\nCards in " + symbol.toUpperCase() + " Symbol");
            int totalNumberOfCards = 0;
            int sumOfNumbers = 0;
            for (Card card : cardsMap.get(symbol)) {
                System.out.println(card.symbol + " " + card.number);
                totalNumberOfCards++;
                sumOfNumbers += card.number;
            }
            System.out.println("Number of cards: " + totalNumberOfCards);
            System.out.println("Sum of Numbers: " + sumOfNumbers);
        }
        System.out.println("Anish Kumar Karn 21BCS5009");

        scanner.close();
    }

}
