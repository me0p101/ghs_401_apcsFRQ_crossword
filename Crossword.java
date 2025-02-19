public class Crossword {
    private Square[][] puzzle;

    public Crossword() {
        puzzle = new Square[5][5];
        for (int row = 0; row < puzzle.length; row++) {
            for (int col = 0; col < puzzle[0].length; col++) {
                puzzle[row][col] = new Square(true, 0);
            } // end inner for
        } // end outer for
    } // end zero-arg constructor

    public Crossword(boolean[][] blackSquares) {
        puzzle = new Square[blackSquares.length][blackSquares[0].length];
        int label = 0;
        for (int r = 0; r < blackSquares.length; r++) {
            for (int c = 0; c < blackSquares[0].length; c++) {
                if (blackSquares[r][c]) {
                    puzzle[r][c] = new Square(true, 0);
                } else {
                    boolean shouldBeLabeled = toBeLabeled(r, c, blackSquares);
                    if (shouldBeLabeled) {
                        label++;;
                        puzzle[r][c] = new Square(false, label);
                    } else {
                        puzzle[r][c] = new Square(false, 0);
                    }
                    
                }
            }
        }
    } // end one-arg constructor 

    private boolean toBeLabeled(int r, int c, boolean[][] blackSquares) {
        return !blackSquares[r][c] && (
            (r > 0 && blackSquares[r - 1][c]) ||
            (c > 0 && blackSquares[r][c - 1]) ||
            (r < blackSquares.length - 1 && blackSquares[r + 1][c]) ||
            (c < blackSquares[0].length - 1 && blackSquares[r][c + 1])
        ); //replaced false
    } // end method toBeLabeled

    public String toString() {
        String output = new String();
        for (int row = 0; row < puzzle.length; row++) {
            for (int col = 0; col < puzzle[0].length; col++) {
                if (puzzle[row][col].getIsBlack()) {
                    output += (char) (9608) + "\t"; // 9608 adds a black square
                } else {
                    output += (puzzle[row][col].getNum() + "\t");
               } // end else 
            } // end inner for
            output += "\n";      
        } // end outer for
        return output;  
    } // end method toString()
} //end class Crossword
