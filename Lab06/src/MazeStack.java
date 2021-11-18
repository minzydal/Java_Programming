import java.util.Stack;

public class MazeStack {
   private final int MAX_SIZE = 6;
   private char map[][] = {
         {'1','1','1','1','1','1'},
         {'e','0','1','0','0','1'},
         {'1','0','0','0','1','1'},
         {'1','0','1','0','1','1'},
         {'1','0','1','0','0','x'},
         {'1','1','1','1','1','1'}};
   public boolean isValidLoc(int r, int c) {
      if(r<0 || c<0 || r>=MAX_SIZE || c>=MAX_SIZE)
         return false;
      return map[r][c] == '0' || map[r][c] == 'x';
   }
   public void runMaze() {
      Stack<Location2D> st = new Stack<Location2D>();
      Location2D entry = new Location2D(1,0);
      st.push(entry);
      System.out.println();
      while(!st.isEmpty()) {
         Location2D here = st.peek();
         st.pop();
         System.out.print(here + " ");
         
         int r = here.getRow();
         int c = here.getCol();
         
         if(map[r][c] == 'x') {
            System.out.println("\nMaze is solved...");
            System.out.println();
            return;
         }
         map[r][c] = '.';
         if(isValidLoc(r-1,c))
            st.push(new Location2D(r-1,c));
         if(isValidLoc(r+1,c))
            st.push(new Location2D(r+1,c));
         if(isValidLoc(r,c-1))
            st.push(new Location2D(r,c-1));
         if(isValidLoc(r,c+1))
            st.push(new Location2D(r,c+1));
      }
      System.out.println("\nMaze is not solved...");
   }
   
}