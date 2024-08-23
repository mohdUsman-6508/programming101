import java.util.ArrayList;
import java.util.List;
 class MazePathfinder {

    // Function to find all paths in the maze
    public static void findPaths(int[][] maze, int x, int y, List<String> path, boolean[][] visited, List<List<String>> allPaths) {
        int N = maze.length;

        // Base case: If destination is reached
        if (x == N - 1 && y == N - 1) {
            path.add("(" + x + ", " + y + ")");
            allPaths.add(new ArrayList<>(path));
            path.remove(path.size() - 1);
            return;
        }

        // If the current cell is out of bounds, blocked, or already visited, return
        if (x < 0 || y < 0 || x >= N || y >= N || maze[x][y] == 0 || visited[x][y]) {
            return;
        }

        // Mark the cell as visited and add it to the path
        visited[x][y] = true;
        path.add("(" + x + ", " + y + ")");

        // Explore all possible directions (right, down, left, up)
        findPaths(maze, x + 1, y, path, visited, allPaths); // Move right
        findPaths(maze, x, y + 1, path, visited, allPaths); // Move down
        findPaths(maze, x - 1, y, path, visited, allPaths); // Move left
        findPaths(maze, x, y - 1, path, visited, allPaths); // Move up

        // Backtrack: unmark the cell as visited and remove it from the path
        visited[x][y] = false;
        path.remove(path.size() - 1);
    }

    // Helper function to initiate the pathfinding
    public static List<List<String>> findPathsInMaze(int[][] maze) {
        List<List<String>> allPaths = new ArrayList<>();
        if (maze == null || maze.length == 0 || maze[0].length == 0) {
            return allPaths;
        }

        int N = maze.length;
        boolean[][] visited = new boolean[N][N];
        List<String> path = new ArrayList<>();

        findPaths(maze, 0, 0, path, visited, allPaths);

        return allPaths;
    }

    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 1, 1},
                {0, 1, 1, 0},
                {1, 1, 1, 1}
        };

        List<List<String>> allPaths = findPathsInMaze(maze);

        // Print all paths
        for (List<String> path : allPaths) {
            System.out.println(path);
        }
    }
}
