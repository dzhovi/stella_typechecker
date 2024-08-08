package org.stella.typecheck;

import org.syntax.stella.Absyn.*;

import java.util.ArrayList;
import java.util.List;

public class Declarations {
    public static List<DeclFun> declFuns = new ArrayList<>();
    public static List<ParamDecl> declVars = new ArrayList<>();
    public static List<Object> nodes = new ArrayList<>();

    public static List<Type> exTypes =  new ArrayList<>();

    public static List<Expr> patternExprs = new ArrayList<>();
    public static List<Type> patternContext = new ArrayList<>();

    public static boolean subtypeEnabled = false;
    public static boolean huiEnabled = false;

    public static boolean autoEnabled = false;
    public static boolean universalEnabled = false;



    public static boolean isAuto(Type tp) {
        return (tp instanceof TypeVar && ((TypeVar) tp).stellaident_.equals("auto"));
    }

}
