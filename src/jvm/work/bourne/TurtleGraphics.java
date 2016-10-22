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
          
        Precondition:
          <<The turtle is always into the box>>  
        
         */

        // Example commands
        /*int[][] commands = {{2},
                            {5,12},
                            {3},
                            {5,12},
                            {3},
                            {5,12},
                            {3},
                            {5,12},
                            {1},
                            {6},
                            {9}};
        */
        
        int[][] commands = {{2},
                            {5,12},
                            {3},
                            {5,6},
                            {3},
                            {5,9},
                            {4},
                            {5,12},
                            {3},
                            {5,3},
                            {3},
                            {5,16},
                            {1},
                            {6},
                            {9}};
        
        int[][] floor = new int[NUMBER_ROWS][NUMBER_COLUMNS];
        int[] coords = new int[2]; // init coords (0,0)
        coords[0] = 2;
        coords[1] = 3;
        boolean[] direction = new boolean[4];
        
        
        int pen = 1; // up => 1 - down => 2
        
        // current direction -> right
        boolean currentWay = true;
        boolean currentSigne = true;
        
        // previous direction -> right
        boolean previousWay = currentWay;
        boolean previousSigne = currentSigne;

        direction[0] = true; // right
        direction[1] = false; // left
        direction[2] = false; // up
        direction[3] = false; // down
        
        for(int row = 0; row < commands.length; row++){
            
            if(commands[row][0] == 1){
                pen = 1; // Pen up
            }
            
            if(commands[row][0] == 2){
                pen = 2; // Pen down
            }
            
            if(commands[row][0] == 3){ // -90 GRADE
                
                // right -> down
                if(previousWay == true && previousSigne == true){
                    currentWay = false;
                    currentSigne = true;
                    direction[0] = false;
                    direction[3] = true;
                }
                
                // down -> left
                if(previousWay == false && previousSigne == true){
                    currentWay = true;
                    currentSigne = false;
                    direction[3] = false;
                    direction[1] = true;
                }
                
                // left -> up
                if(previousWay == true && previousSigne == false){
                    currentWay = false;
                    currentSigne = false;
                    direction[1] = false;
                    direction[2] = true;
                }
                
                // up -> right
                if(previousWay == false && previousSigne == false){
                    currentWay = true;
                    currentSigne = true;
                    direction[2] = false;
                    direction[0] = true;
                }

            }
            
            if(commands[row][0] == 4){ // 90 GRADE
                
                // right -> up
                if(previousWay == true && previousSigne == true){
                    currentWay = false;
                    currentSigne = false;
                    direction[0] = false;
                    direction[2] = true;
                }
                
                // up -> left
                if(previousWay == false && previousSigne == false){
                    currentWay = true;
                    currentSigne = false;
                    direction[2] = false;
                    direction[1] = true;
                }
                
                // left -> down
                if(previousWay == true && previousSigne == false){
                    currentWay = false;
                    currentSigne = true;
                    direction[1] = false;
                    direction[3] = true;
                }
                
                // down -> right
                if(previousWay == false && previousSigne == true){
                    currentWay = true;
                    currentSigne = true;
                    direction[0] = true;
                    direction[3] = false;
                }
            }
            
            
            if(commands[row][0] == 5){
                // muevase la cantidad de posiciones como indique
                // commands[row][1] -> number steps
                moveTurtle(floor, coords, pen, direction, commands[row][1]);
            }
            
            if(commands[row][0] == 6){
                displayFloor(floor);
            }
            
            if(commands[row][0] == 9){
                System.out.printf("End of Turtle Graphics%n");
                break;
            }
            
            previousWay = currentWay;
            previousSigne = currentSigne;
           
        }
        
        
        
    } // end main

    public static void displayFloor(int[][] floor){
        System.out.printf("%n");
        for (int[] floorRow : floor) {
            System.out.printf("\t\t");
            for (int column = 0; column < floorRow.length; column++) {
                
                if(floorRow[column] == 1){
                    System.out.printf("%c ", '*');
                }else{
                    System.out.printf("%d ", floorRow[column]);
                }
                
            }
            System.out.printf("%n");
        }
    }
    
    public static void moveTurtle(int[][] floor, int[] coords, int pen, 
            boolean[] direction, int steps){
        
        if(direction[0]){
            // move right
            if(coords[1] != NUMBER_COLUMNS - 1){
                for(int k = 1; k < steps; k++){
                    coords[1] += 1;
                    if(pen == 2){
                        floor[coords[0]][coords[1]] = 1;
                    }
                    
                    // finish move -> last column
                    if(coords[1] == NUMBER_COLUMNS - 1){
                        System.out.printf("Not move%n");
                        break;
                    }
                }
            }else{
                System.out.printf("Not move%n");
            }
        }
        
        if (direction[1]){
            // move left
            if(coords[1] != 0){
                for(int k = 1; k < steps; k++){
                    coords[1] -= 1;
                    if(pen == 2){
                        floor[coords[0]][coords[1]] = 1;
                    }
                    
                    // finish move -> column 0
                    if(coords[1] == 0){
                        System.out.printf("Not move%n");
                        break;
                    }
                }
            }else{
                System.out.printf("Not move%n");
            }
        }
        
        if(direction[2]){
            // move up
            if(coords[0] != 0){
                for(int k = 1; k < steps; k++){
                    coords[0] -= 1;
                    if(pen == 2){
                        floor[coords[0]][coords[1]] = 1;
                    }
                    
                    // finish move -> row 0
                    if(coords[0] == 0){
                        System.out.printf("Not move%n");
                        break; 
                    }
                }
            }else{
                System.out.printf("Not move%n");
            }
        }
        
        if(direction[3]){
            // move down
            if(coords[0] != NUMBER_ROWS - 1){
                for(int k = 1; k < steps; k++){
                    coords[0] += 1;
                    if(pen == 2){
                        floor[coords[0]][coords[1]] = 1;
                    }
                    
                    // finish move -> row 0
                    if(coords[0] == NUMBER_ROWS - 1){
                        System.out.printf("Not move%n");
                        break; 
                    }
                }
            }else{
                System.out.printf("Not move%n");
            }
        }
    }
    
} // end class TurtleGraphics
