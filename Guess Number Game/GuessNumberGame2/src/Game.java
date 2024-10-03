public class Game {
    private int number;

    public Game(int number){
        this.number=number;
    }

    public int getNumber(){
        return number;
    }


    public void CompareNumbers(Player player){  // Metodo comparção
        if(number == player.getNumber()){
            System.out.println("Player guessed correctly.Game Ends!"+number+" "+player.getNumber());

        }
        else{

            System.out.println("Wrong number. Guess again!"+number+" "+player.getNumber());
            player.setNumber(Generator.getRandomNumber());
            CompareNumbers(player);

        }
    }
}