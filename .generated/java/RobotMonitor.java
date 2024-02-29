import java.util.Scanner;

enum Move {
    UP, DOWN, LEFT, RIGHT
}

public class RobotMonitor {

    // variables
    int MAX = 6;
    int MIN = 1;
    int currentRow = 1;
    int currentCol = 1;
    Move previousMove = Move.LEFT;
    Move currentMove = Move.UP;

    // state variables
    public int col, row;

    public RobotMonitor(int _col, int _row) {
        col = _col;
        row = _row;
    }

    // Functions
    private void MoveRight() {
        if (previousMove != Move.RIGHT && currentCol < MAX && currentCol > MIN) {
            currentCol++;
            currentMove = Move.RIGHT;
        }
    }

    private void MoveLeft() {
        if (previousMove != Move.LEFT && currentCol > MIN && currentCol < MAX) {
            currentCol--;
            currentMove = Move.LEFT;
        }
    }

    private void MoveUp() {
        if (previousMove != Move.UP && currentRow >= MIN && currentRow <= MAX) {
            currentRow--;
            currentMove = Move.UP;
        } else {
            System.out.println("Invalid move");
        }
    }

    private void MoveDown() {
        if (previousMove != Move.DOWN && currentRow <= MAX && currentRow >= MIN) {
            currentRow++;
            currentMove = Move.DOWN;
        }
    }

    private int GetRow() {
        return currentRow;
    }

    private int GetCol() {
        return currentCol;
    }

    private Move GetMove() {
        previousMove = currentMove;
        return currentMove;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int _currentCol = 1;
        int _currentRow = 1;
        RobotMonitor robot = new RobotMonitor(1, 1);
        System.out.println("Initial position: " + robot.GetCol() + " " + robot.GetRow());
        System.out.println("Where do you want to move? (UP, DOWN, LEFT, RIGHT)");
        String move = sc.next();
        if (_currentCol != 6 || _currentRow != 6) {
            switch (move) {
                case "UP":
                    robot.MoveUp();
                    break;
                case "DOWN":
                    robot.MoveDown();
                    break;
                case "LEFT":
                    robot.MoveLeft();
                    break;
                case "RIGHT":
                    robot.MoveRight();
                    break;
                default:
                    System.out.println("Invalid move");
            }
        }
        System.out.println("New position: " + robot.GetCol() + " " + robot.GetRow());
    }

}
