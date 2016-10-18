// Card shuffling and dealing

public class DeckOfCardsTest{

    public static void main(String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();

        // print all 52 Cards in the order in which they are dealt
        for(int i = 1; i <= 52; i++){
            System.out.printf("%-19s", myDeckOfCards.dealCard());

            if(i % 4 == 0){
                System.out.printf("%n");
            }
        }
    }
}
