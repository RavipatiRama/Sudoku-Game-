public class SudokuDriver
{
    public static void main(String[] args)
    {
        /* SAMPLE BOARD
        int[][] board = {{0, 0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 0}};
        */
        
        int[][] board = {{0, 0, 9, 7, 4, 8, 0, 0, 0},
                         {7, 0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 2, 0, 1, 0, 9, 0, 0, 0},
                         {0, 0, 7, 0, 0, 0, 2, 4, 0},
                         {0, 6, 4, 0, 1, 0, 5, 9, 0},
                         {0, 9, 8, 0, 0, 0, 3, 0, 0},
                         {0, 0, 0, 8, 0, 3, 0, 2, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0, 6},
                         {0, 0, 0, 2, 7, 5, 9, 0, 0}};
        
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board.length; j++)
            {
                //if(board[i][j] == 0)
                 //   System.out.print("  ");
                //else
                    System.out.print(board[i][j] + " ");
            }
            
            System.out.println();
        }
        System.out.println();  
        Sudoku s = new Sudoku(board);
        s.solve();
    }
}
