package quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
final public class DOWNQuote implements Quote {
  private static int hc = 0;
  private static DOWNQuote instance = null;

  public DOWNQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static DOWNQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new DOWNQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof DOWNQuote;
  }

  public String toString() {

    return "<DOWN>";
  }

  @Override
  public DOWNQuote copy() {

    return getInstance();
  }
}
