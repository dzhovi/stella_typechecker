// File generated by the BNF Converter (bnfc 2.9.4.1).

package org.syntax.stella.Absyn;

public class Record  extends Expr {
  public final ListBinding listbinding_;
  public int line_num, col_num, offset;
  public Record(ListBinding p1) { listbinding_ = p1; }

  public <R,A> R accept(Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof Record) {
      Record x = (Record)o;
      return this.listbinding_.equals(x.listbinding_);
    }
    return false;
  }

  public int hashCode() {
    return this.listbinding_.hashCode();
  }


}