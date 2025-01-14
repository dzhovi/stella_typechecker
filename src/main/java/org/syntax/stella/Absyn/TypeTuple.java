// File generated by the BNF Converter (bnfc 2.9.4.1).

package org.syntax.stella.Absyn;

public class TypeTuple  extends Type {
  public final ListType listtype_;
  public int line_num, col_num, offset;
  public TypeTuple(ListType p1) { listtype_ = p1; }

  public <R,A> R accept(Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof TypeTuple) {
      TypeTuple x = (TypeTuple)o;
      if (this.listtype_.size() != x.listtype_.size()) {
        throw new RuntimeException("ERROR_UNEXPECTED_TUPLE_LENGTH");
      }

      return this.listtype_.equals(x.listtype_);
    }
    return false;
  }

  public int hashCode() {
    return this.listtype_.hashCode();
  }


}
