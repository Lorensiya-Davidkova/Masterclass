import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class KnightMove {
        private static final int[][] MOVES = {
                {-2, 1}, {-1, 2}, {1, 2}, {2, 1},
                {2, -1}, {1, -2}, {-1, -2}, {-2, -1}
        };

        private static class Position {
            int row;
            int col;
            int steps;

            public Position(int row, int col, int steps) {
                this.row = row;
                this.col = col;
                this.steps = steps;
            }
        }

        public static int minStepsToReachTarget(int x,int y) {
            boolean[][] visited = new boolean[3][3];
            Queue<Position> queue = new LinkedList<>();

            // Set starting position and mark it as visited
            Position start = new Position(x, y, 0);
            queue.add(start);
            visited[start.row][start.col] = true;

            while (!queue.isEmpty()) {
                Position current = queue.poll();

                // Ако е достигнал до X, това означава, че е краят на програмата и връщаме стъпките, изминати досега
                if (current.row == 2 && current.col == 2) {
                    return current.steps;
                }

                // Generate possible next positions
                for (int[] move : MOVES) {
                    int nextRow = current.row + move[0];
                    int nextCol = current.col + move[1];

                    // Check if the next position is valid and not visited
                    if (isValidPosition(nextRow, nextCol) && !visited[nextRow][nextCol]) {
                        visited[nextRow][nextCol] = true;
                        queue.add(new Position(nextRow, nextCol, current.steps + 1));
                    }
                }
            }

            return -1; // Target position not reachable
        }

        private static boolean isValidPosition(int row, int col) {
            return row >= 0 && row < 3 && col >= 0 && col < 3;
        }

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println(Arrays.deepToString(MOVES));
            /*int x=Integer.parseInt(scanner.nextLine());
            int y=Integer.parseInt(scanner.nextLine());
            int minSteps = minStepsToReachTarget(x,y);
            System.out.println("Minimum steps to reach the target: " + minSteps);*/
            System.out.println(MOVES[0][0]+"    "+MOVES[3][1]);//-2   1
        }
    }


