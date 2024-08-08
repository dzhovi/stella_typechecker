// File generated by the BNF Converter (bnfc 2.9.4.1).

package org.syntax.stella.Absyn;

public class AParamDecl  extends ParamDecl {
  public final String stellaident_;
  public  Type type_;
  public int line_num, col_num, offset;
  public AParamDecl(String p1, Type p2) { stellaident_ = p1; type_ = p2; }

  public <R,A> R accept(Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof AParamDecl) {
      AParamDecl x = (AParamDecl)o;
      return this.stellaident_.equals(x.stellaident_) && this.type_.equals(x.type_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.stellaident_.hashCode())+this.type_.hashCode();
  }


}
