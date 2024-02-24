package quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
final public class UPQuote implements Quote {
  private static int hc = 0;
  private static UPQuote instance = null;

  public UPQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static UPQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new UPQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof UPQuote;
  }

  public String toString() {

    return "<UP>";
  }

  @Override
  public UPQuote copy() {

    return getInstance();
  }
}
