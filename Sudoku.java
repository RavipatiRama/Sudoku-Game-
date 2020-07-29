public class Sudoku
{
    private int[][] board;
    
    public Sudoku(int[][] board)
    {
        this.board = board;
    }
    
    public void solve()
    {
        if(fill(0))
        {
            display();
        }
        else
        {
            System.out.println("No solution");
        }
    }
    
    private boolean fill(int location)
    {
        int x = location / 9;
        int y = location % 9;
        int value;
        
        if(location > 80)
            return true;
        else if(board[x][y] != 0)
            return fill(location+1);
        else
        {
            for(value = 1; value <= 9; value++)
            {
                board[x][y] = value;
                
                if(check(x, y) && fill(location+1))
                    return true;
            }
            
            board[x][y] = 0;
            return false;
        }
    }
    
    private boolean check(int x, int y)
    {
        int a, b, i, j;
        
        for(j = 0; j < 9; j++)
            if(j != y && board[x][j] == board[x][y])
                return false;
                
        for(i = 0; i < 9; i++)
            if(i != x && board[i][y] == board[x][y])
                return false;
                
        a = (x / 3) * 3;
        b = (y / 3) * 3;
        for(i = 0; i < 3; i++)
            for(j = 0; j < 3; j++)
                if((a + i != x) && (b + j != y) && board[a+i][b+j] == board[x][y])
                    return false;
                    
        return true;
    }
    
    private void display()
    {
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
    }
}