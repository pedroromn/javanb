import java.security.SecureRandom;

public class DeckOfCards{

    private Card[] deck; // array of Card objects
    private int currentCard; // index of next Card to be dealt (0-51)
    private static final int NUMBER_OF_CARDS = 52; // constant # of Cards
    // random number generator
    private static final SecureRandom randomNumbers =
        new SecureRandom();

    // constructor fill deck of Cards
    public DeckOfCards(){
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five",
                          "Six", "Seven", "Eight", "Nine", "Ten",
                          "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        deck = new Card[NUMBER_OF_CARDS]; // create array of Card objects
        currentCard = 0;

        // populate deck with Card objects
        for(int count = 0; count < deck.length; count++){
            deck[count] = new Card(faces[count % 13],
                                   suits[count / 13]);
        }
    }

    public void shuffle(){
        currentCard = 0;

        for(int first = 0; first < deck.length; first++){
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public Card dealCard(){

        if (currentCard < deck.length) {
            return deck[currentCard++];
                }else{
            return null;
        }
    }
}
