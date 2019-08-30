public class Player extends Cell {

    private int westCount = 0;
    private boolean westCountBool = false;


    private int xpos;
    private int ypos;
    private int n;

    Treasure treasure = new Treasure(n);

    public Player(){}

    public Player(int x, int y, int n){

        this.xpos = super.setX(x);
        this.ypos = super.setY(y);
        this.n = n;

        while((this.xpos == treasure.getTreasureXPos() && this.ypos == treasure.getTreasureYPos()) == true){

            this.xpos = (int)(Math.random()*this.n);
            this.ypos = (int)(Math.random()*this.n);

        }

    }


    public double distToTreasure(){

        double diffX = treasure.getTreasureXPos() - this.xpos;
        double diffY = treasure.getTreasureYPos() - this.ypos;

        double csq = Math.pow(diffX,2) + Math.pow(diffY,2);
        double c = Math.sqrt(csq);

        return c;

    }


    public void moveNorth(){
        this.ypos++;
        if(this.ypos > n){
            this.ypos = 0;
        }
        System.out.println("you are now " + distToTreasure() + "m from the treasure");
    }

    public void moveSouth(){
        this.ypos--;
        if(this.ypos < 0){
            this.ypos = this.n;
        }
        System.out.println("you are now " + distToTreasure() + "m from the treasure");
    }

    public void moveEast(){
        this.xpos++;
        if(this.xpos > n){
            this.xpos = 0;
        }
        System.out.println("you are now " + distToTreasure() + "m from the treasure");
    }

    public void moveWest(){

        this.xpos--;
        if(this.xpos < 0){
            this.xpos = this.n;
        }
        System.out.println("you are now " + distToTreasure() + "m from the treasure");



        this.westCount++;
        if(this.westCount > 10 && this.westCountBool == false){
            System.out.println("Aechievment unlocked: Go West, life is peaceful there");
            this.westCountBool = true;
        }
    }




}
