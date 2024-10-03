package RockPaperScissor;

public class Game {

    public static Hand randomizer() {
        int x = (int) Math.floor(Math.random() * 3);

        switch (x) {

            case 0:
                return Hand.ROCK;

            case 1:
                return Hand.PAPER;              // isto é o randomizer

            default:
                return Hand.SCISSOR;
        }


        public void Comparation (Hand player1, Hand player2){
            if ((player1 == Hand.ROCK && player2 == Hand.SCISSOR) ||
            (player1 == Hand.PAPER && player2 == Hand.ROCK) ||
                    (player1 == Hand.SCISSOR && player2 == Hand.PAPER));
            System.out.println("Player1 wins!");
        }
        if (player1 == player2) {
            System.out.println(" Draw ");
        }

        else{
            System.out.println("Player2 wins!");
        }

    }

}
