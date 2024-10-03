package RockPaperScissor;

public class Player {

    private String name;
    private Hand playerHand;

    public Player(String name, Hand playerHand) {
        this.name = name;
        this.playerHand = playerHand;
    }

    public String getName() {
        return name;
    }

    public Hand getPlayerHand() {
        return playerHand;
    }

    public void setPlayerHand(Hand playerHand) {
        this.playerHand = playerHand;
    }
}