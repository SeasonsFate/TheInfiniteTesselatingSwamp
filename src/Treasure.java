public class Treasure{


    private int treasureXPos;
    private int treasureYPos;

    public Treasure(){}

    public Treasure(int n){
        treasureXPos = (int) (Math.random()*n);
        treasureYPos = (int) (Math.random()*n);
    }



    public int getTreasureXPos() {
        return this.treasureXPos;
    }

    public int getTreasureYPos(){
        return this.treasureYPos;
    }


}
