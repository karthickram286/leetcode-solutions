class Solution {
    public int numIslands(char[][] grid) {
        
        // 0 - water
        // 1 - unvisited land
        // 2 - visited land
        
        int r = grid.length, c = grid[0].length, numOfIslands = 0;
        
        // Iterating over all nodes
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                
                // If the current node is not visited and if it's land
                // we are marking all the neighbouring lands and incrementing
                // the total count
                if (grid[i][j] == '1') {
                    markNeighbouringIslands(grid, i, j, r, c);
                    numOfIslands++;
                }
            }
        }
        
        return numOfIslands;
    }
    
    private void markNeighbouringIslands(char[][] grid, int x, int y, int r, int c) {
        
        // Boundary conditions
        if (x < 0 || x >= r || y < 0 || y >= c || grid[x][y] != '1')
            return;
            
        // Marking the visited lands as 2
        grid[x][y] = '2';

        // Recursive calls to mark all neighbouring lands
        markNeighbouringIslands(grid, x, y-1, r, c); // Left
        markNeighbouringIslands(grid, x, y+1, r, c); // Right
        markNeighbouringIslands(grid, x-1, y, r, c); // Top
        markNeighbouringIslands(grid, x+1, y, r, c); // Down
    }
}