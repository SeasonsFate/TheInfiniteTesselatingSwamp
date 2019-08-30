public class Cell {

    public Cell(){}

    public Cell(int x, int y){
        this.x = x;
        this.y = y;
    }

    private int x;
    private int y;


    public int getX() {
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int setX(int x){
        this.x = x;
        return this.x;
    }

    public int setY(int y){
        this.y = y;
        return this.y;
    }
}

// Meant to make this abstract but ran out of time, had plans to make an n x n grid of cells and realised pretty late that didn't actually need this so for now this remains a non abstract class



