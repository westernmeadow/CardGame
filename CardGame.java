//
//  Name:       Kwan, Wesley
//  Homework:   1
//  Due:        2/10/20
//  Course:     cs-2400-02
//
//  Description:
//              A game in which players guess which cards
//              (numbered 1 to 13) are in a bag.
//
import java.util.*;

public class CardGame {
    public static void main(String[] args) {
        System.out.println("W. Kwan's Card Game\n");
        
        BagInterface<Integer> bagOfCards = new ArrayBag<>(6);
        Scanner scnr = new Scanner(System.in);
        Integer[] cards = {1, 2, 3, 4, 5, 6, 7,
                           8, 9, 10, 11, 12, 13};
        Collections.shuffle(Arrays.asList(cards));
        
        System.out.println("Six cards selected.");
        for (int index = 0; index < 6; index++) {
            bagOfCards.add(cards[index]);
            if (args.length > 0 && args[0].equals("debug"))
                System.out.print(cards[index]);
        }
        System.out.println();
        
        int choice;
        int player1Score = 0;
        int player2Score = 0;
        while (!bagOfCards.isEmpty()) {
            System.out.print("Player 1? ");
            choice = scnr.nextInt();
            if (bagOfCards.remove(choice)) {
                player1Score++;
                System.out.println("Got card");
            }
            else
                System.out.println("Not in bag");
            System.out.print("Player 2? ");
            choice = scnr.nextInt();
            if (bagOfCards.remove(choice)) {
                player2Score++;
                System.out.println("Got card");
            }
            else
                System.out.println("Not in bag");
        }
        
        if (player1Score == player2Score)
            System.out.println("\nGame is a tie");
        else if (player1Score > player2Score)
            System.out.println("\nPlayer 1 won with " +
                                player1Score + " cards");
        else
            System.out.println("\nPlayer 2 won with " +
                                player2Score + " cards");
    }
}
