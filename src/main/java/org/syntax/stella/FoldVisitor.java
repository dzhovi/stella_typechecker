// File generated by the BNF Converter (bnfc 2.9.4.1).

package org.syntax.stella;

/** Fold Visitor */
public abstract class FoldVisitor<R,A> implements AllVisitor<R,A> {
    public abstract R leaf(A arg);
    public abstract R combine(R x, R y, A arg);

/* Program */
    public R visit(org.syntax.stella.Absyn.AProgram p, A arg) {
      R r = leaf(arg);
      r = combine(p.languagedecl_.accept(this, arg), r, arg);
      for (org.syntax.stella.Absyn.Extension x : p.listextension_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      for (org.syntax.stella.Absyn.Decl x : p.listdecl_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      return r;
    }

/* LanguageDecl */
    public R visit(org.syntax.stella.Absyn.LanguageCore p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* Extension */
    public R visit(org.syntax.stella.Absyn.AnExtension p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* Decl */
    public R visit(org.syntax.stella.Absyn.DeclFun p, A arg) {
      R r = leaf(arg);
      for (org.syntax.stella.Absyn.Annotation x : p.listannotation_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      for (org.syntax.stella.Absyn.ParamDecl x : p.listparamdecl_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      r = combine(p.returntype_.accept(this, arg), r, arg);
      r = combine(p.throwtype_.accept(this, arg), r, arg);
      for (org.syntax.stella.Absyn.Decl x : p.listdecl_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.DeclFunGeneric p, A arg) {
      R r = leaf(arg);
      for (org.syntax.stella.Absyn.Annotation x : p.listannotation_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      for (org.syntax.stella.Absyn.ParamDecl x : p.listparamdecl_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      r = combine(p.returntype_.accept(this, arg), r, arg);
      r = combine(p.throwtype_.accept(this, arg), r, arg);
      for (org.syntax.stella.Absyn.Decl x : p.listdecl_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.DeclTypeAlias p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.DeclExceptionType p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.DeclExceptionVariant p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }

/* LocalDecl */
    public R visit(org.syntax.stella.Absyn.ALocalDecl p, A arg) {
      R r = leaf(arg);
      r = combine(p.decl_.accept(this, arg), r, arg);
      return r;
    }

/* Annotation */
    public R visit(org.syntax.stella.Absyn.InlineAnnotation p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* ParamDecl */
    public R visit(org.syntax.stella.Absyn.AParamDecl p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }

/* ReturnType */
    public R visit(org.syntax.stella.Absyn.NoReturnType p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.SomeReturnType p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }

/* ThrowType */
    public R visit(org.syntax.stella.Absyn.NoThrowType p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.SomeThrowType p, A arg) {
      R r = leaf(arg);
      for (org.syntax.stella.Absyn.Type x : p.listtype_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      return r;
    }

/* Type */
    public R visit(org.syntax.stella.Absyn.TypeFun p, A arg) {
      R r = leaf(arg);
      for (org.syntax.stella.Absyn.Type x : p.listtype_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.TypeForAll p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.TypeRec p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.TypeSum p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_1.accept(this, arg), r, arg);
      r = combine(p.type_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.TypeTuple p, A arg) {
      R r = leaf(arg);
      for (org.syntax.stella.Absyn.Type x : p.listtype_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      return r;
    }
    public R visit(org.syntax.stella.Absyn.TypeRecord p, A arg) {
      R r = leaf(arg);
      for (org.syntax.stella.Absyn.RecordFieldType x : p.listrecordfieldtype_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      return r;
    }
    public R visit(org.syntax.stella.Absyn.TypeVariant p, A arg) {
      R r = leaf(arg);
      for (org.syntax.stella.Absyn.VariantFieldType x : p.listvariantfieldtype_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      return r;
    }
    public R visit(org.syntax.stella.Absyn.TypeList p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.TypeBool p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.TypeNat p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.TypeUnit p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.TypeTop p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.TypeBottom p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.TypeRef p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.TypeVar p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* MatchCase */
    public R visit(org.syntax.stella.Absyn.AMatchCase p, A arg) {
      R r = leaf(arg);
      r = combine(p.pattern_.accept(this, arg), r, arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }

/* OptionalTyping */
    public R visit(org.syntax.stella.Absyn.NoTyping p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.SomeTyping p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }

/* PatternData */
    public R visit(org.syntax.stella.Absyn.NoPatternData p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.SomePatternData p, A arg) {
      R r = leaf(arg);
      r = combine(p.pattern_.accept(this, arg), r, arg);
      return r;
    }

/* ExprData */
    public R visit(org.syntax.stella.Absyn.NoExprData p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.SomeExprData p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }

/* Pattern */
    public R visit(org.syntax.stella.Absyn.PatternVariant p, A arg) {
      R r = leaf(arg);
      r = combine(p.patterndata_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.PatternInl p, A arg) {
      R r = leaf(arg);
      r = combine(p.pattern_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.PatternInr p, A arg) {
      R r = leaf(arg);
      r = combine(p.pattern_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.PatternTuple p, A arg) {
      R r = leaf(arg);
      for (org.syntax.stella.Absyn.Pattern x : p.listpattern_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      return r;
    }
    public R visit(org.syntax.stella.Absyn.PatternRecord p, A arg) {
      R r = leaf(arg);
      for (org.syntax.stella.Absyn.LabelledPattern x : p.listlabelledpattern_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      return r;
    }
    public R visit(org.syntax.stella.Absyn.PatternList p, A arg) {
      R r = leaf(arg);
      for (org.syntax.stella.Absyn.Pattern x : p.listpattern_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      return r;
    }
    public R visit(org.syntax.stella.Absyn.PatternCons p, A arg) {
      R r = leaf(arg);
      r = combine(p.pattern_1.accept(this, arg), r, arg);
      r = combine(p.pattern_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.PatternFalse p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.PatternTrue p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.PatternUnit p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.PatternInt p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.PatternSucc p, A arg) {
      R r = leaf(arg);
      r = combine(p.pattern_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.PatternVar p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* LabelledPattern */
    public R visit(org.syntax.stella.Absyn.ALabelledPattern p, A arg) {
      R r = leaf(arg);
      r = combine(p.pattern_.accept(this, arg), r, arg);
      return r;
    }

/* Binding */
    public R visit(org.syntax.stella.Absyn.ABinding p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }

/* Expr */
    public R visit(org.syntax.stella.Absyn.Sequence p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.Let p, A arg) {
      R r = leaf(arg);
      for (org.syntax.stella.Absyn.PatternBinding x : p.listpatternbinding_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.LetRec p, A arg) {
      R r = leaf(arg);
      for (org.syntax.stella.Absyn.PatternBinding x : p.listpatternbinding_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.TypeAbstraction p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.Assign p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.If p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      r = combine(p.expr_3.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.LessThan p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.LessThanOrEqual p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.GreaterThan p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.GreaterThanOrEqual p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.Equal p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.NotEqual p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.TypeAsc p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.TypeCast p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.Abstraction p, A arg) {
      R r = leaf(arg);
      for (org.syntax.stella.Absyn.ParamDecl x : p.listparamdecl_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.Variant p, A arg) {
      R r = leaf(arg);
      r = combine(p.exprdata_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.Match p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      for (org.syntax.stella.Absyn.MatchCase x : p.listmatchcase_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      return r;
    }
    public R visit(org.syntax.stella.Absyn.List p, A arg) {
      R r = leaf(arg);
      for (org.syntax.stella.Absyn.Expr x : p.listexpr_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      return r;
    }
    public R visit(org.syntax.stella.Absyn.Add p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.Subtract p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.LogicOr p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.Multiply p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.Divide p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.LogicAnd p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.Ref p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.Deref p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.Application p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      for (org.syntax.stella.Absyn.Expr x : p.listexpr_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      return r;
    }
    public R visit(org.syntax.stella.Absyn.TypeApplication p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      for (org.syntax.stella.Absyn.Type x : p.listtype_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      return r;
    }
    public R visit(org.syntax.stella.Absyn.DotRecord p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.DotTuple p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.Tuple p, A arg) {
      R r = leaf(arg);
      for (org.syntax.stella.Absyn.Expr x : p.listexpr_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      return r;
    }
    public R visit(org.syntax.stella.Absyn.Record p, A arg) {
      R r = leaf(arg);
      for (org.syntax.stella.Absyn.Binding x : p.listbinding_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      return r;
    }
    public R visit(org.syntax.stella.Absyn.ConsList p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.Head p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.IsEmpty p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.Tail p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.Panic p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.Throw p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.TryCatch p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.pattern_.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.TryWith p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.Inl p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.Inr p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.Succ p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.LogicNot p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.Pred p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.IsZero p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.Fix p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.NatRec p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      r = combine(p.expr_3.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.Fold p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.Unfold p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.ConstTrue p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.ConstFalse p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.ConstUnit p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.ConstInt p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.ConstMemory p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(org.syntax.stella.Absyn.Var p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* PatternBinding */
    public R visit(org.syntax.stella.Absyn.APatternBinding p, A arg) {
      R r = leaf(arg);
      r = combine(p.pattern_.accept(this, arg), r, arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }

/* VariantFieldType */
    public R visit(org.syntax.stella.Absyn.AVariantFieldType p, A arg) {
      R r = leaf(arg);
      r = combine(p.optionaltyping_.accept(this, arg), r, arg);
      return r;
    }

/* RecordFieldType */
    public R visit(org.syntax.stella.Absyn.ARecordFieldType p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }

/* Typing */
    public R visit(org.syntax.stella.Absyn.ATyping p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }


}
