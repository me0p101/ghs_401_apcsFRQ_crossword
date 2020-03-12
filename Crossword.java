 

public class Crossword
   {
   private Square[][] puzzle;
   
   public Crossword()
      {
      puzzle = new Square[5][5];  
      for(int row = 0; row < puzzle.length; row++ )
         {
         for( int col = 0; col < puzzle[0].length; col++ )
            {
            puzzle[row][col] = new Square( true, 0 );    
            } // end inner for
         } // end outer for
         
         
      } // end zero-arg constructor
   
   public Crossword( boolean[][] blackSquares )
      {
          
          
      // to be completed in Part (b)
      
      
      
      } // end one-arg constructor 
       
   private boolean toBeLabeled( int r, int c, boolean[][] blackSquares )
      {
          
        
      
      return false;    
      } // end method toBeLabeled
      
   public String toString()
      {
      String output = new String();
      
      for( int row = 0; row < puzzle.length; row++ )
         {
         for( int col = 0; col < puzzle[0].length; col++ )
            {
            if( puzzle[row][col].getIsBlack() == true )
               {
               output += (char)(9608) + "\t";   // 9608 adds a black square
               } 
            else
               {
                   output += puzzle[row][col].getNum() + "\t"; //prints number of square
               
               } // end else 
            } // end inner for
         output += "\n";      
         } // end outer for
      return output;  
      } // end method toString()
   } // end class Crossword
   