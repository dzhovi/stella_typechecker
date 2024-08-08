// File generated by the BNF Converter (bnfc 2.9.4.1).

package org.syntax.stella.Absyn;

public abstract class PatternData implements java.io.Serializable {
  public abstract <R,A> R accept(Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(NoPatternData p, A arg);
    public R visit(SomePatternData p, A arg);

  }

}
