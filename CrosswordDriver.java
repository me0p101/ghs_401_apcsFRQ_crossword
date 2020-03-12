 

public class CrosswordDriver
   {
   public static void main()
      {
      Crossword myPuzzle = new Crossword();
      
      System.out.println( myPuzzle );
      
      
      
      
      boolean[][] board = new boolean[5][5];  
      for(int row = 0; row < board.length; row++ )
         {
         for( int col = 0; col < board[0].length; col++ )
            {
            board[row][col] = false;    
            } // end inner for
         } // end outer for
         
         board[0][0]=true;
         board[0][2]=true;
         board[0][3]=true;
         board[1][3]=true;
         board[3][0]=true;
         board[4][0]=true;
         board[4][1]=true;
         
         
         
         Crossword myPuzzle2 = new Crossword(board);
         System.out.println( myPuzzle2 );
      
      
      
      
      
      } // end method main
       
   } // end class CrosswordDriver