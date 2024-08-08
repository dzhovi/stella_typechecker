// File generated by the BNF Converter (bnfc 2.9.4.1).

package org.syntax.stella.Absyn;

public class DeclExceptionType  extends Decl {
  public final Type type_;
  public int line_num, col_num, offset;
  public DeclExceptionType(Type p1) { type_ = p1; }

  public <R,A> R accept(Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof DeclExceptionType) {
      DeclExceptionType x = (DeclExceptionType)o;
      return this.type_.equals(x.type_);
    }
    return false;
  }

  public int hashCode() {
    return this.type_.hashCode();
  }


}