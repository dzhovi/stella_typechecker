// File generated by the BNF Converter (bnfc 2.9.4.1).

package org.syntax.stella.Absyn;

public abstract class Type implements java.io.Serializable {
  public abstract <R,A> R accept(Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(TypeFun p, A arg);
    public R visit(TypeForAll p, A arg);
    public R visit(TypeRec p, A arg);
    public R visit(TypeSum p, A arg);
    public R visit(TypeTuple p, A arg);
    public R visit(TypeRecord p, A arg);
    public R visit(TypeVariant p, A arg);
    public R visit(TypeList p, A arg);
    public R visit(TypeBool p, A arg);
    public R visit(TypeNat p, A arg);
    public R visit(TypeUnit p, A arg);
    public R visit(TypeTop p, A arg);
    public R visit(TypeBottom p, A arg);
    public R visit(TypeRef p, A arg);
    public R visit(TypeVar p, A arg);
  }

}
