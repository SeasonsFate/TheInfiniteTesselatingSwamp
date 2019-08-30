import java.util.Scanner;

public class App {
    public static void main(String[] args){

        int noMoves = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of grid you wish to play on as a whole number: ");

        int n = Integer.parseInt(sc.nextLine());

        System.out.println("You wake to find yourself surrounded by swamp for as far as the eye can see\nThen you hear it a voice coming from all around");
        System.out.println("'You must find the treasure chest to escape this place, the device on your wrist will tell you how far away you are from the exit'\n");
        System.out.println("A Shiver runs down your back, something doesn't feel right about this place");
        System.out.println("Something in your mind is screaming at you to leave this place, so you begin walking ...");



        int startPosX = (int) (Math.random()*n);
        int startPosY = (int) (Math.random()*n);

        Player you = new Player(startPosX,startPosY,n);



        System.out.println("you are " + you.distToTreasure() + "m away from the treasure, good luck");
        System.out.println("Type 'North', 'South', 'East' or 'West'");


        while(you.distToTreasure() > 0){
            String move = sc.nextLine();
            move = move.toLowerCase();
            switch (move){
                case "north":
                    you.moveNorth();
                    break;
                case "east":
                    you.moveEast();
                    break;
                case "south":
                    you.moveSouth();
                    break;
                case "west":
                    you.moveWest();
                    break;
                default:
                    System.out.println("That was an invalid input, please type 'North', 'South', 'East' or 'West'");
            }

            noMoves++;

            if (noMoves > 100){
                System.out.println("Everything in this swamp looks the same, you are beginning to lose your mind");
            } else if(noMoves > 200){
                System.out.println("You are getting close to your limit, you think you have a talking fish called Gerome now");
            }else if(noMoves > 250){
                System.out.println("You have run out of food: you have failed to escape the swamp.");
                break;
            }

        }
        if (noMoves <= 200){
            System.out.println("Congratulations you successfully escaped the swamp");
        }else if(noMoves <= 250 && noMoves > 200){
            System.out.println("Congratulations you successfully escaped the swamp and got an imaginary talking fish out\n of it, you are the real winner here");
        }

        sc.close();

    }

}
