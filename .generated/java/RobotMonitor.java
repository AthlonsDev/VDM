import java.util.Scanner;

enum Move {
    UP, DOWN, LEFT, RIGHT,  NOMOVE
}

public class RobotMonitor {

    // constants
    static final int MAX = 6;
    static final int MIN = 1;
    // variables
    int currentRow = 1;
    int currentCol = 1;
    Move previousMove = Move.NOMOVE;
    Move currentMove = Move.NOMOVE;

    // state variables
    public static int col, row;

    public RobotMonitor(int _col, int _row) {
        col = _col;
        row = _row;
    }

    // Functions
    private void MoveRight() {
        if (previousMove != Move.RIGHT && currentCol <= MAX && currentCol >= MIN) {
            currentCol++;
            currentMove = Move.RIGHT;
        } else {
            throw new IllegalArgumentException("Invalid move");
        }
    }

    private void MoveLeft() { 
        if (previousMove != Move.LEFT && previousMove != Move.NOMOVE && col >= MIN && col <= MAX) {
            currentCol--;
            currentMove = Move.LEFT;
        } else {
            System.out.println("Invalid move");
        }
    }

    private void MoveUp() {
        if (previousMove != Move.UP  && previousMove != Move.NOMOVE && row >= MIN && row <= MAX) {
            currentRow--;
            currentMove = Move.UP;
        } else {
            System.out.println("Invalid move");
        }
    }

    private void MoveDown() {
        if (previousMove != Move.DOWN && row <= MAX && row >= MIN) {
            currentRow++;
            currentMove = Move.DOWN;
        } else {
            System.out.println("Invalid move");
        }
    }

    private int GetRow() {
        row = currentRow;
        return row;
    }

    private int GetCol() {
        col = currentCol;
        return col;
    }

    private Move GetMove() {
        previousMove = currentMove;
        return previousMove;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RobotMonitor robot = new RobotMonitor(1, 1);
        System.out.println("Initial position: " + robot.GetCol() + " " + robot.GetRow());
        while (row != 6 && col != 6) {
            System.out.println("Where do you want to move? (UP, DOWN, LEFT, RIGHT)");
            String move = sc.next();
            if (col != 6 || row != 6) {
                switch (move) {
                    case "UP":
                        robot.MoveUp();
                        robot.GetMove();
                        break;
                    case "DOWN":
                        robot.MoveDown();
                        robot.GetMove();
                        break;
                    case "LEFT":
                        robot.MoveLeft();
                        robot.GetMove();
                        break;
                    case "RIGHT":
                        robot.MoveRight();
                        robot.GetMove();
                        break;
                    default:
                        System.out.println("Invalid move");
                }
            }
            System.out.println("New position: " + robot.GetCol() + " " + robot.GetRow());
        }
        System.out.println("New position: " + robot.GetCol() + " " + robot.GetRow());
    }

}
