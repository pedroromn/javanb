package jvm.work.bourne;

public class TurtleGraphics{
    
    public static void main(String[] args) {

        /*
          1 Pen up
          2 Pen down

          3 Turn right
          4 Turn left
          5,10 Move forward 10 spaces
          6 Display the 20-by-20 array
          
          9 End of data(sentinel)
         */

        // Example commands
        int[][] commands = {{2},
                            {5,12},
                            {3},
                            {5,12},
                            {3},
                            {5,12},
                            {1},
                            {6},
                            {9}};
        
        int[][] floor = new int[20][20];
        displayFloor(floor);
        System.out.printf("%n");
        
        for(int row = 0; row < commands.length; row++){
            if(commands[row][0] == 1){
                System.out.printf("Pen up %n");
            }
            
            if(commands[row][0] == 2){
                System.out.printf("Pen down %n");
            }
            
            if(commands[row][0] == 3){
                System.out.printf("Turn right %n");
            }
            
            if(commands[row][0] == 4){
                System.out.printf("Turn left %n");
            }
            
            if(commands[row][0] == 5){
                System.out.printf("Move -> %d %n", commands[row][1]);
                // muevase la cantidad de posiciones como indique
                // commands[row][1]
            }
            
            if(commands[row][0] == 6){
                displayFloor(floor);
            }
            
            if(commands[row][0] == 9){
                System.out.printf("End");
                break;
            }
            
        }
    }

    public static void displayFloor(int[][] floor){
        System.out.printf("%n");
        for(int row = 0; row < floor.length; row++){
            System.out.printf("\t\t");
            for(int column = 0; column < floor[row].length; column++){
                System.out.printf("%d ", floor[row][column]);
            }
            System.out.printf("%n");
        }
    }

    

    
} // end class TurtleGraphics
