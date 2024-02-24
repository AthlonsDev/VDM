
import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
final public class DEFAULT {
  public static final Number MAX = 6L;
  public static final Number MIN = 1L;
  public static final Number currentRow = 1L;
  public static final Number currentCol = 1L;
  public static final Object previousMove = quotes.LEFTQuote.getInstance();
  public static final Object currentMove = quotes.LEFTQuote.getInstance();
  private static RobotMonitor RobotMonitor = new RobotMonitor(4L, 3L);

  private DEFAULT() {}

  /* robot_mon.vdmsl 20:5 */
  public static void MoveRight() {

    throw new UnsupportedOperationException();
  }
  /* robot_mon.vdmsl 25:5 */
  public static void MoveLeft() {

    throw new UnsupportedOperationException();
  }
  /* robot_mon.vdmsl 30:5 */
  public static void MoveDown() {

    throw new UnsupportedOperationException();
  }
  /* robot_mon.vdmsl 35:5 */
  public static void MoveUp() {

    throw new UnsupportedOperationException();
  }
  /* robot_mon.vdmsl 40:5 */
  public static void GetRow() {

    throw new UnsupportedOperationException();
  }
  /* robot_mon.vdmsl 45:5 */
  public static void GetCol() {

    throw new UnsupportedOperationException();
  }
  /* robot_mon.vdmsl 50:5 */
  public static void GetMove() {

    throw new UnsupportedOperationException();
  }

  public String toString() {

    return "DEFAULT{"
        + "MAX = "
        + Utils.toString(MAX)
        + ", MIN = "
        + Utils.toString(MIN)
        + ", currentRow = "
        + Utils.toString(currentRow)
        + ", currentCol = "
        + Utils.toString(currentCol)
        + ", previousMove = "
        + Utils.toString(previousMove)
        + ", currentMove = "
        + Utils.toString(currentMove)
        + ", RobotMonitor := "
        + Utils.toString(RobotMonitor)
        + "}";
  }

  public static class RobotMonitor implements VDMRecord {
    public Number col;
    public Number row;

    public RobotMonitor(final Number _col, final Number _row) {

      col = _col;
      row = _row;
    }

    public boolean equals(final Object obj) {

      if (!(obj instanceof RobotMonitor)) {
        return false;
      }

      RobotMonitor other = ((RobotMonitor) obj);

      return (Utils.equals(col, other.col)) && (Utils.equals(row, other.row));
    }

    public int hashCode() {

      return Utils.hashCode(col, row);
    }

    public RobotMonitor copy() {

      return new RobotMonitor(col, row);
    }

    public String toString() {

      return "mk_DEFAULT`RobotMonitor" + Utils.formatFields(col, row);
    }
  }
}
