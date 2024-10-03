public class Player {

    private int number;
    private String name;

    public Player(String name, int getRandomNumber){           // Metodo construtor para criar player
        // pq player tem atributo
        this.name = name;
        this.number= getRandomNumber;

    }
    public int getNumber(){
        return number;


    }
    public String getName(){
        return name;
    }
    public void setNumber(int number){
        this.number=number;
    }


}