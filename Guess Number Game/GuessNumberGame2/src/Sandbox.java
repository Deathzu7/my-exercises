public class Sandbox {

    public static void main(String[] args) {

        Game game = new Game(Generator.getRandomNumber());         //Criar objecto game com o parametro do random number
        Player Gustavo = new Player("Gustavo",Generator.getRandomNumber()); //Criar player com parametro nome e parametro randonumber
        game.CompareNumbers(Gustavo);


    }
}