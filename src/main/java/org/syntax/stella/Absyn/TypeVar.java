// File generated by the BNF Converter (bnfc 2.9.4.1).

package org.syntax.stella.Absyn;

public class TypeVar  extends Type {
  public final String stellaident_;
  public int line_num, col_num, offset;
  public TypeVar(String p1) { stellaident_ = p1; }

  public <R,A> R accept(Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof TypeTop) return true;
    if (o instanceof TypeVar) {
      TypeVar x = (TypeVar)o;
      return this.stellaident_.equals(x.stellaident_);
    }
    return false;
  }

  public int hashCode() {
    return this.stellaident_.hashCode();
  }


}
