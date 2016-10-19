package jvm.work.bourne;

public class TurtleGraphics{
    
    private static final int NUMBER_ROWS = 20;
    private static final int NUMBER_COLUMNS = 20;
    
    public static void main(String[] args) {

        /*
          1 Pen up
          2 Pen down

          3 Turn right
          4 Turn left
        
          5,N Move forward N spaces
          6 Display the 20-by-20 array
          
          9 End of data(sentinel)
        
          The turtle is always into the box.  
        
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
        
        int[][] floor = new int[NUMBER_ROWS][NUMBER_COLUMNS];
        int[] coords = new int[2];
        boolean[] state = new boolean[4];
        
        
        int pen = 1; // up => 1 - down => 2
        
        // current state
        boolean currentOnRows = false;
        boolean currentOnColumns = true;
        boolean currentPositive = true;
        boolean currentNegative = false;
        
        state[0] = true; // right
        state[1] = false; // left
        state[2] = false; // up
        state[3] = false; // down
        
        // previous state
        boolean previousOnRows = currentOnRows;
        boolean previousOnColumns = currentOnColumns;
        boolean previousPositive = currentPositive;
        boolean previousNegative = currentNegative;

        
        
        for(int row = 0; row < commands.length; row++){
            
            if(commands[row][0] == 1){
                pen = 1; // Pen up
            }
            
            if(commands[row][0] == 2){
                pen = 2; // Pen down
            }
            
            if(commands[row][0] == 3){
                
                // right -> down
                if(previousOnRows == false && previousOnColumns == true &&
                        previousPositive == true && previousNegative == false){
                    state[0] = false;
                    state[3] = true;
                    currentOnRows = true;
                    currentOnColumns = false;
                    currentPositive = false;
                    currentNegative = true;
                }
                
                // down -> left
                if(previousOnRows == true && previousOnColumns == false &&
                        previousPositive == false && previousNegative == true){
                    state[3] = false;
                    state[1] = true;
                    currentOnRows = false;
                    currentOnColumns = true;
                    currentPositive = false;
                    currentNegative = true;
                }
                
                // left -> up
                if(previousOnRows == false && previousOnColumns == true &&
                        previousPositive == false && previousNegative == true){
                    state[1] = false;
                    state[2] = true;
                    currentOnRows = true;
                    currentOnColumns = false;
                    currentPositive = true;
                    currentNegative = false;
                }
                
                // up -> right
                if(previousOnRows == true && previousOnColumns == false &&
                        previousPositive == true && previousNegative == false){
                    state[2] = false;
                    state[0] = true;
                    currentOnRows = false;
                    currentOnColumns = true;
                    currentPositive = true;
                    currentNegative = false;
                }

            }
            
            if(commands[row][0] == 4){
                
                // right -> up
                if(previousOnRows == false && previousOnColumns == true &&
                        previousPositive == true && previousNegative == false){
                    state[2] = true;
                    state[0] = false;
                    currentOnRows = true;
                    currentOnColumns = false;
                    currentPositive = true;
                    currentNegative = false;
                }
                
                // up -> left
                if(previousOnRows == true && previousOnColumns == false &&
                        previousPositive == true && previousNegative == false){
                    state[1] = true;
                    state[2] = false;
                    currentOnRows = false;
                    currentOnColumns = true;
                    currentPositive = false;
                    currentNegative = true;
                }
                
                // left -> down
                if(previousOnRows == false && previousOnColumns == true &&
                        previousPositive == false && previousNegative == true){
                    state[3] = true;
                    state[1] = false;
                    currentOnRows = true;
                    currentOnColumns = false;
                    currentPositive = false;
                    currentNegative = true;
                }
                
                // down -> right
                if(previousOnRows == true && previousOnColumns == false &&
                        previousPositive == false && previousNegative == true){
                    state[0] = true;
                    state[3] = false;
                    currentOnRows = false;
                    currentOnColumns = true;
                    currentPositive = false;
                    currentNegative = true;
                }
            }
            
            
            if(commands[row][0] == 5){
                // muevase la cantidad de posiciones como indique
                // commands[row][1]
                moveTurtle(floor, coords, pen, state, commands[row][1]);
            }
            
            if(commands[row][0] == 6){
                displayFloor(floor);
            }
            
            if(commands[row][0] == 9){
                System.out.printf("End of Turtle Graphics%n");
                break;
            }
            
            previousOnRows = currentOnRows;
            previousOnColumns = currentOnColumns;
            previousPositive = currentPositive;
            previousNegative = currentNegative;
           
        }
        
        
        
    } // end main

    public static void displayFloor(int[][] floor){
        System.out.printf("%n");
        for (int[] floor1 : floor) {
            //System.out.printf("\t\t");
            for (int column = 0; column < floor1.length; column++) {
                System.out.printf("%d ", floor1[column]);
            }
            System.out.printf("%n");
        }
    }
    
    public static void moveTurtle(int[][] floor, int[] coords, int pen, 
            boolean[] state, int steps){
        // TO DO
    }

    

    
} // end class TurtleGraphics
