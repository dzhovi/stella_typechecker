package org.stella.assignment1.well_typed;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.stella.Main;
import org.stella.typecheck.Declarations;

import java.io.FileInputStream;
import java.io.InputStream;

public class Tests {

    @BeforeEach
    void clearContext() {
        Declarations.declVars.clear();
        Declarations.declFuns.clear();
        Declarations.nodes.clear();
        Declarations.subtypeEnabled = false;
        Declarations.autoEnabled = false;
    }

    @ParameterizedTest(name = "{index} Typechecking well-typed program {0}")
    @ValueSource(strings = {
            "testiks" +
                    "/assignment1/core/well-typed/abstract-function.stella",
            "testiks" +
                    "/assignment1/core/well-typed/added-test-1.stella",
            "testiks" +
                    "/assignment1/core/well-typed/added-test-2.stella",
            "testiks" +
                    "/assignment1/core/well-typed/apply-increase.stella",
            "testiks" +
                    "/assignment1/core/well-typed/bool-to-nat.stella",
            "testiks" +
                    "/assignment1/core/well-typed/cubes.stella",
            "testiks" +
                    "/assignment1/core/well-typed/double-application.stella",
            "testiks" +
                    "/assignment1/core/well-typed/factorial.stella",
            "testiks" +
                    "/assignment1/core/well-typed/good-if.stella",
            "testiks" +
                    "/assignment1/core/well-typed/good-if-2.stella",
            "testiks" +
                    "/assignment1/core/well-typed/good-succ-1.stella",
            "testiks" +
                    "/assignment1/core/well-typed/good-succ-2.stella",
            "testiks" +
                    "/assignment1/core/well-typed/higher-order-1.stella",
            "testiks" +
                    "/assignment1/core/well-typed/higher-order-2.stella",
            "testiks" +
                    "/assignment1/core/well-typed/if-funcs.stella",
            "testiks" +
                    "/assignment1/core/well-typed/increment-triple.stella",
            "testiks" +
                    "/assignment1/core/well-typed/increment_twice.stella",
            "testiks" +
                    "/assignment1/core/well-typed/inner-if.stella",
            "testiks" +
                    "/assignment1/core/well-typed/logical-operators.stella",
            "testiks" +
                    "/assignment1/core/well-typed/many-if.stella",
            "testiks" +
                    "/assignment1/core/well-typed/my-good-if.stella",
            "testiks" +
                    "/assignment1/core/well-typed/my-good-succ.stella",
            "testiks" +
                    "/assignment1/core/well-typed/my-well-typed-1.stella",
            "testiks" +
                    "/assignment1/core/well-typed/my-well-typed-2.stella",
            "testiks" +
                    "/assignment1/core/well-typed/nat-to-bool.stella",
            "testiks" +
                    "/assignment1/core/well-typed/negate.stella",
            "testiks" +
                    "/assignment1/core/well-typed/nested.stella",
            "testiks" +
                    "/assignment1/core/well-typed/shadowed-variable-2.stella",
            "testiks" +
                    "/assignment1/core/well-typed/simple-if.stella",
            "testiks" +
                    "/assignment1/core/well-typed/simple-succ.stella",
            "testiks" +
                    "/assignment1/core/well-typed/simple-types.stella",
            "testiks" +
                    "/assignment1/core/well-typed/squares.stella",
            "testiks" +
                    "/assignment1/core/well-typed/succ-with-func.stella",
            "testiks" +
                    "/assignment2/well_typed/ignore.stella",
            "testiks" +
                    "/assignment2/well_typed/let-1.stella",
            "testiks" +
                    "/assignment2/well_typed/let-2.stella",
            "testiks" +
                    "/assignment2/well_typed/let-3.stella",
            "testiks" +
                    "/assignment2/well_typed/let-4.stella",
            "testiks" +
                    "/assignment2/well_typed/pairs-1.stella",
            "testiks" +
                    "/assignment2/well_typed/pairs-2.stella",
            "testiks" +
                    "/assignment2/well_typed/pairs-3.stella",
            "testiks" +
                    "/assignment2/well_typed/pairs-4.stella",
            "testiks" +
                    "/assignment2/well_typed/pairs-5.stella",
            "testiks" +
                    "/assignment2/well_typed/pairs-6.stella",
            "testiks" +
                    "/assignment2/well_typed/records-1.stella",
            "testiks" +
                    "/assignment2/well_typed/records-2.stella",
            "testiks" +
                    "/assignment2/well_typed/records-3.stella",
            "testiks" +
                    "/assignment2/well_typed/records-4.stella",
            "testiks" +
                    "/assignment2/well_typed/records-5.stella",
            "testiks" +
                    "/assignment2/well_typed/records-6.stella",
            "testiks" +
                    "/assignment2/well_typed/records-7.stella",
            "testiks" +
                    "/assignment2/well_typed/records-8.stella",
            "testiks" +
                    "/assignment2/well_typed/test-1.stella",
            "testiks" +
                    "/assignment2/well_typed/test-2.stella",

            "testiks" +
                    "/assignment3/well_typed/empty-list.stella",
            "testiks" +
                    "/assignment3/well_typed/good-anonymous-function.stella",
            "testiks" +
                    "/assignment3/well_typed/good-pair.stella",
            "testiks" +
                    "/assignment3/well_typed/lists-1.stella",
            "testiks" +
                    "/assignment3/well_typed/lists-2.stella",
            "testiks" +
                    "/assignment3/well_typed/lists-3.stella",

            "testiks" +
                    "/assignment3/well_typed/sum-types-1.stella",
            "testiks" +
                    "/assignment3/well_typed/sum-types-2.stella",
            "testiks" +
                    "/assignment3/well_typed/sum-types-3.stella",

            "testiks/assignment4/well-typed/fix.stella",
            "testiks/assignment4/well-typed/fix-2.stella",
            "testiks/assignment4/well-typed/pairs-1.stella",
            "testiks/assignment4/well-typed/pairs-2.stella",
            "testiks/assignment4/well-typed/pairs-3.stella",
            "testiks/assignment4/well-typed/sum-types-1.stella",
            "testiks/assignment4/well-typed/sum-types-2.stella",
            "testiks/assignment4/well-typed/tuples-1.stella",
            "testiks/assignment4/well-typed/variants-1.stella",
            "testiks/assignment4/well-typed/variants-2.stella",
            "testiks/assignment4/well-typed/variants-3.stella",
            "testiks/assignment5/well-typed/refs-1.stella",
            "testiks/assignment5/well-typed/refs-2.stella",
            "testiks/assignment5/well-typed/refs-3.stella",
            "testiks/assignment5/well-typed/refs-4.stella",
            "testiks/assignment6/well_typed/functions-1.stella",
            "testiks/assignment6/well_typed/functions-2.stella",
            "testiks/assignment6/well_typed/functions-3.stella",
            "testiks/assignment6/well_typed/functions-4.stella",
            "testiks/assignment6/well_typed/lists-1.stella",
            "testiks/assignment6/well_typed/lists-2.stella",
            "testiks/assignment6/well_typed/lists-3.stella",
            "testiks/assignment6/well_typed/lists-4.stella",
            "testiks/assignment6/well_typed/lists-5.stella",
            "testiks/assignment6/well_typed/pairs-1.stella",
            "testiks/assignment6/well_typed/pairs-2.stella",
            "testiks/assignment6/well_typed/pairs-3.stella",
            "testiks/assignment6/well_typed/pairs-4.stella",
            "testiks/assignment6/well_typed/pairs-5.stella",
            "testiks/assignment6/well_typed/references-1.stella",
            "testiks/assignment6/well_typed/references-2.stella",
            "testiks/assignment6/well_typed/references-3.stella",
            "testiks/assignment6/well_typed/references-4.stella",
            "testiks/assignment6/well_typed/references-5.stella",
            "testiks/assignment6/well_typed/references-6.stella",
            "testiks/assignment8/well-typed/exceptions-1.stella",
            "testiks/assignment8/well-typed/exceptions-2.stella",
            "testiks/assignment8/well-typed/exceptions-3.stella",
            "testiks/assignment8/well-typed/exceptions-4.stella"


    })
    void testWellTyped(String filepath) throws Exception {
        String[] args = new String[0];
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(filepath);
        System.setIn(fips);
        Assertions.assertDoesNotThrow(() -> Main.main(args));
        System.setIn(original);
    }

    @ParameterizedTest(name = "{index} Typechecking missing_main program {0}")
    @ValueSource(strings = {
            "testiks" +
                    "/assignment1/core/ill-typed/missing_main/missing-main-1.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/missing_main/missing-main-2.stella"
    })
    void testMissingMain(String filepath) throws Exception {
        String err = "MISSING_MAIN";
        String[] args = new String[0];
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(filepath);
        System.setIn(fips);
        Exception e = Assertions.assertThrows(RuntimeException.class, () -> Main.main(args));
        Assertions.assertTrue(e.getMessage().contains(err));
        System.setIn(original);
    }

    @ParameterizedTest(name = "{index} Typechecking missing_main program {0}")
    @ValueSource(strings = {
            "testiks" +
                    "/assignment1/core/ill-typed/not-a-function/applying-non-function-1.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/not-a-function/applying-non-function-2.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/not-a-function/applying-non-function-3.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/not-a-function/if-funcs.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/not-a-function/my-factorial.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/not-a-function/not-a-function-1.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/not-a-function/shadowed-variable-1.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/not-a-function/shadowed-variable-2.stella",
            "testiks" +
                    "/assignment2/ill_typed/not-a-function/bad-pairs-12.stella",
            "testiks" +
                    "/assignment2/ill_typed/not-a-function/bad-pairs-17.stella",
            "testiks" +
                    "/assignment2/ill_typed/not-a-function/bad-records-7.stella",
            "testiks" +
                    "/assignment2/ill_typed/not-a-function/bad-records-8.stella",
            "testiks" +
                    "/assignment2/ill_typed/not-a-function/bad-records-21.stella",
            "testiks" +
                    "/assignment2/ill_typed/not-a-function/bad-let-4.stella",
            "testiks" +
                    "/assignment2/ill_typed/not-a-function/bad-let-5.stella",
            "testiks/assignment4/ill-typed/error_not_a_function/not-a-function.stella",
            "testiks/assignment4/ill-typed/error_not_a_function/fix.stella",


    })
    void testNotAFunction(String filepath) throws Exception {
        String err = "NOT_A_FUNCTION";
        String[] args = new String[0];
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(filepath);
        System.setIn(fips);
        Exception e = Assertions.assertThrows(RuntimeException.class, () -> Main.main(args));
        Assertions.assertTrue(e.getMessage().contains(err));
        System.setIn(original);
    }


    @ParameterizedTest(name = "{index} Typechecking undefined_variable program {0}")
    @ValueSource(strings = {
            "testiks" +
                    "/assignment1/core/ill-typed/undefined-variable/bad-if-and-undefined-variable-1.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/undefined-variable/undef-var-1.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/undefined-variable/undefined-variable-1.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/undefined-variable/undefined-variable-2.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/undefined-variable/undefined-variable-3.stella",
            "testiks" +
                    "/assignment2/ill_typed/undefined-variable/bad-records-11.stella",
            "testiks/assignment4/ill-typed/error_undefined_variable/undefined-variable-1.stella"
    })
    void testUndefinedVariable(String filepath) throws Exception {
        String err = "UNDEFINED_VARIABLE";
        String[] args = new String[0];
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(filepath);
        System.setIn(fips);
        Exception e = Assertions.assertThrows(RuntimeException.class, () -> Main.main(args));
        Assertions.assertTrue(e.getMessage().contains(err));
        System.setIn(original);
    }

    @ParameterizedTest(name = "{index} Typechecking unexpected_lambda program {0}")
    @ValueSource(strings = {
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-lambda/bad-function-call.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-lambda/bad-if-4.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-lambda/bad-squares-1.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-lambda/bad-succ-2.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-lambda/if-funcs.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-lambda/my-ill-typed-2.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-lambda/unexpected-lambda-1.stella",
            "testiks/assignment3/ill_typed/error_unexpected_lambda/bad-sum-types-9.stella"
    })
    void testUnexpectedLambda(String filepath) throws Exception {
        String err = "UNEXPECTED_LAMBDA";
        String[] args = new String[0];
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(filepath);
        System.setIn(fips);
        Exception e = Assertions.assertThrows(RuntimeException.class, () -> Main.main(args));
        Assertions.assertTrue(e.getMessage().contains(err));
        System.setIn(original);
    }

    @ParameterizedTest(name = "{index} Typechecking unexpected-type-for-expression program {0}")
    @ValueSource(strings = {
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-expression/added-test-2.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-expression/application-param-type.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-expression/argument-type-mismatch-1.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-expression/bad-abstraction.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-expression/bad-factorial.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-expression/bad-higher-order-1.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-expression/bad-if-1.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-expression/bad-if-2.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-expression/bad-if-3.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-expression/bad-iszero.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-expression/bad-nat-2.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-expression/bad-nat-rec-1.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-expression/bad-nat-rec-2.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-expression/bad-return-type.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-expression/bad-squares-2.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-expression/bad-succ-1.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-expression/bad-succ-3.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-expression/function-mismatch.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-expression/if-funcs.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-expression/my-ill-test-2.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-expression/my-ill-typed-1.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-expression/my-mismatch.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-expression/nat__rec-parameters.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-expression/unexpected-type-for-expression-1.stella",

            "testiks/assignment3/ill_typed/error_unexpected_type_for_expression/bad-lists-1.stella",
            "testiks/assignment3/ill_typed/error_unexpected_type_for_expression/bad-lists-2.stella",
            "testiks/assignment3/ill_typed/error_unexpected_type_for_expression/bad-sum-types-1.stella",
            "testiks/assignment3/ill_typed/error_unexpected_type_for_expression/bad-sum-types-2.stella",
            "testiks/assignment3/ill_typed/error_unexpected_type_for_expression/bad-sum-types-3.stella",
            "testiks/assignment3/ill_typed/error_unexpected_type_for_expression/bad-sum-types-5.stella",
            "testiks/assignment3/ill_typed/error_unexpected_type_for_expression/bad-variants-1.stella",
            "testiks" +
                    "/assignment3/ill_typed/error_not_a_list/not-a-list-tail.stella",
            "testiks/assignment3/ill_typed/error_unexpected_type_for_expression/bad-sum-types-8.stella",

            "testiks/assignment4/ill-typed/error_unexpected_type_for_expression/ambiguous-variant-type-5.stella",
            "testiks/assignment4/ill-typed/error_unexpected_type_for_expression/bad-variants-2.stella",
            "testiks/assignment4/ill-typed/error_unexpected_type_for_expression/divergent-param-and-return-types.stella",
            "testiks/assignment4/ill-typed/error_unexpected_type_for_expression/fix-2.stella",
            "testiks/assignment4/ill-typed/error_unexpected_type_for_expression/unexpected-type-of-expression-1.stella",
            "testiks/assignment4/ill-typed/error_unexpected_type_for_expression/unexpected-type-of-expression-2.stella",
            "testiks" +
                    "/assignment3/ill_typed/error_not_a_list/not-a-list-head.stella"

    })
    void textUnexpectedTypeForExpression(String filepath) throws Exception {
        String err = "UNEXPECTED_TYPE_FOR_EXPRESSION";
        String[] args = new String[0];
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(filepath);
        System.setIn(fips);
        Exception e = Assertions.assertThrows(RuntimeException.class, () -> Main.main(args));
        Assertions.assertTrue(e.getMessage().contains(err));
        System.setIn(original);
    }

    @ParameterizedTest(name = "{index} Typechecking unexpected-type-for-parameter program {0}")
    @ValueSource(strings = {
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-parameter/added-test-1.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-parameter/if-funcs.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-parameter/unexpected-type-for-parameter-1.stella",
            "testiks" +
                    "/assignment2/ill_typed/unexpected-type-for-parameter/bad-let-7.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-parameter/invalid-nat.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-parameter/invalid-not_.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-parameter/argument-type-mismatch-2.stella",

            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-parameter/argument-type-mismatch-3.stella",
            "testiks" +
                    "/assignment1/core/ill-typed/unexpected-type-for-parameter/bad-nat-1.stella"
    })
    void textUnexpectedTypeForParameter(String filepath) throws Exception {
        String err = "UNEXPECTED_TYPE_FOR_PARAMETER";
        String[] args = new String[0];
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(filepath);
        System.setIn(fips);
        Exception e = Assertions.assertThrows(RuntimeException.class, () -> Main.main(args));
        Assertions.assertTrue(e.getMessage().contains(err));
        System.setIn(original);
    }


    @ParameterizedTest(name = "{index} Typechecking not-a-record program {0}")
    @ValueSource(strings = {
            "testiks" +
                    "/assignment2/ill_typed/error-not-a-record/bad-records-5.stella",
            "testiks" +
                    "/assignment2/ill_typed/error-not-a-record/bad-records-9.stella",
            "testiks" +
                    "/assignment2/ill_typed/error-not-a-record/bad-records-15.stella",
    })
    void textNotARecord(String filepath) throws Exception {
        String err = "ERROR_NOT_A_RECORD";
        String[] args = new String[0];
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(filepath);
        System.setIn(fips);
        Exception e = Assertions.assertThrows(RuntimeException.class, () -> Main.main(args));
        Assertions.assertTrue(e.getMessage().contains(err));
        System.setIn(original);
    }

    @ParameterizedTest(name = "{index} Typechecking error-tuple-index-out-of-bounds program {0}")
    @ValueSource(strings = {
            "testiks" +
                    "/assignment2/ill_typed/error-tuple-index-out-of-bounds/bad-pairs-2.stella",
    })
    void textOutOfBounds(String filepath) throws Exception {
        String err = "ERROR_TUPLE_INDEX_OUT_OF_BOUNDS";
        String[] args = new String[0];
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(filepath);
        System.setIn(fips);
        Exception e = Assertions.assertThrows(RuntimeException.class, () -> Main.main(args));
        Assertions.assertTrue(e.getMessage().contains(err));
        System.setIn(original);
    }

    @ParameterizedTest(name = "{index} Typechecking error-tuple-index-out-of-bounds program {0}")
    @ValueSource(strings = {
            "testiks" +
                    "/assignment2/ill_typed/error-unexpected-record/bad-records-10.stella",
    })
    void textUnexpectedRecord(String filepath) throws Exception {
        String err = "ERROR_UNEXPECTED_RECORD";
        String[] args = new String[0];
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(filepath);
        System.setIn(fips);
        Exception e = Assertions.assertThrows(RuntimeException.class, () -> Main.main(args));
        Assertions.assertTrue(e.getMessage().contains(err));
        System.setIn(original);
    }

    @ParameterizedTest(name = "{index} Typechecking error-tuple-index-out-of-bounds program {0}")
    @ValueSource(strings = {
            "testiks" +
                    "/assignment2/ill_typed/error-unexpected-tuple/bad-pairs-6.stella",
            "testiks" +
                    "/assignment2/ill_typed/error-unexpected-tuple/bad-pairs-7.stella",
            "testiks" +
                    "/assignment2/ill_typed/error-unexpected-tuple/bad-pairs-11.stella",
            "testiks" +
                    "/assignment2/ill_typed/error-unexpected-tuple/bad-pairs-13.stella"
    })
    void textUnexpectedTuple(String filepath) throws Exception {
        String err = "ERROR_UNEXPECTED_TUPLE";
        String[] args = new String[0];
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(filepath);
        System.setIn(fips);
        Exception e = Assertions.assertThrows(RuntimeException.class, () -> Main.main(args));
        Assertions.assertTrue(e.getMessage().contains(err));
        System.setIn(original);
    }

    @ParameterizedTest(name = "{index} Typechecking error-tuple-index-out-of-bounds program {0}")
    @ValueSource(strings = {
            "testiks" +
                    "/assignment2/ill_typed/not-a-tuple/bad-pairs-5.stella",
            "testiks" +
                    "/assignment2/ill_typed/not-a-tuple/bad-pairs-9.stella",
            "testiks" +
                    "/assignment2/ill_typed/not-a-tuple/bad-pairs-15.stella",
    })
    void textNotATuple(String filepath) throws Exception {
        String err = "NOT_A_TUPLE";
        String[] args = new String[0];
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(filepath);
        System.setIn(fips);
        Exception e = Assertions.assertThrows(RuntimeException.class, () -> Main.main(args));
        Assertions.assertTrue(e.getMessage().contains(err));
        System.setIn(original);
    }

    @ParameterizedTest(name = "{index} Typechecking error-tuple-index-out-of-bounds program {0}")
    @ValueSource(strings = {
            "testiks" +
                    "/assignment2/ill_typed/unexpected-field-access/bad-records-2.stella",
            "testiks" +
                    "/assignment2/ill_typed/unexpected-field-access/bad-records-16.stella",
            "testiks" +
                    "/assignment2/ill_typed/unexpected-field-access/bad-records-17.stella",
            "testiks" +
                    "/assignment2/ill_typed/unexpected-field-access/bad-records-18.stella",
            "testiks" +
                    "/assignment2/ill_typed/unexpected-field-access/bad-records-19.stella",
    })
    void textUnFieldAccess(String filepath) throws Exception {
        String err = "UNEXPECTED_FIELD_ACCESS";
        String[] args = new String[0];
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(filepath);
        System.setIn(fips);
        Exception e = Assertions.assertThrows(RuntimeException.class, () -> Main.main(args));
        Assertions.assertTrue(e.getMessage().contains(err));
        System.setIn(original);
    }


    @ParameterizedTest(name = "{index} Typechecking error-tuple-index-out-of-bounds program {0}")
    @ValueSource(strings = {
            "testiks" +
                    "/assignment2/ill_typed/unexpected-type-for-expression/bad-let-1.stella",
            "testiks" +
                    "/assignment2/ill_typed/unexpected-type-for-expression/bad-let-2.stella",
            "testiks" +
                    "/assignment2/ill_typed/unexpected-type-for-expression/bad-let-3.stella",
            "testiks" +
                    "/assignment2/ill_typed/unexpected-type-for-expression/bad-let-6.stella",
            "testiks" +
                    "/assignment2/ill_typed/unexpected-type-for-expression/bad-pairs-1.stella",
            "testiks" +
                    "/assignment2/ill_typed/unexpected-type-for-expression/bad-pairs-3.stella",
            "testiks" +
                    "/assignment2/ill_typed/unexpected-type-for-expression/bad-pairs-4.stella",
            "testiks" +
                    "/assignment2/ill_typed/unexpected-type-for-expression/bad-pairs-8.stella",
            "testiks" +
                    "/assignment2/ill_typed/unexpected-type-for-expression/bad-pairs-10.stella",
            "testiks" +
                    "/assignment2/ill_typed/unexpected-type-for-expression/bad-pairs-14.stella",
            "testiks" +
                    "/assignment2/ill_typed/unexpected-type-for-expression/bad-pairs-16.stella",
            "testiks" +
                    "/assignment2/ill_typed/unexpected-type-for-expression/bad-records-1.stella",
            "testiks" +
                    "/assignment2/ill_typed/unexpected-type-for-expression/bad-records-3.stella",
            "testiks" +
                    "/assignment2/ill_typed/unexpected-type-for-expression/bad-records-4.stella",
            "testiks" +
                    "/assignment2/ill_typed/unexpected-type-for-expression/bad-records-6.stella",
            "testiks" +
                    "/assignment2/ill_typed/unexpected-type-for-expression/bad-records-12.stella",
            "testiks" +
                    "/assignment2/ill_typed/unexpected-type-for-expression/bad-records-13.stella",
            "testiks" +
                    "/assignment2/ill_typed/unexpected-type-for-expression/bad-records-20.stella",
            "testiks" +
                    "/assignment2/ill_typed/unexpected-type-for-expression/bad-records-14.stella",


    })
    void textAss2UnExpr(String filepath) throws Exception {
        String err = "UNEXPECTED_TYPE_FOR_EXPRESSION";
        String[] args = new String[0];
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(filepath);
        System.setIn(fips);
        Exception e = Assertions.assertThrows(RuntimeException.class, () -> Main.main(args));
        Assertions.assertTrue(e.getMessage().contains(err));
        System.setIn(original);
    }


    @ParameterizedTest(name = "{index} Typechecking error_ambiguous_list_type program {0}")
    @ValueSource(strings = {
            "testiks" +
                    "/assignment3/ill_typed/error_ambiguous_list_type/ambiguous-list-type-isempty.stella",
    })
    void textAmbListType(String filepath) throws Exception {
        String err = "ERROR_AMBIGUOUS_LIST_TYPE";
        String[] args = new String[0];
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(filepath);
        System.setIn(fips);
        Exception e = Assertions.assertThrows(RuntimeException.class, () -> Main.main(args));
        Assertions.assertTrue(e.getMessage().contains(err));
        System.setIn(original);
    }

    @ParameterizedTest(name = "{index} Typechecking error_ambiguous_sum_type program {0}")
    @ValueSource(strings = {
            "testiks" +
                    "/assignment3/ill_typed/error_ambiguous_sum_type/bad-anonymous-function.stella",
            "testiks" +
                    "/assignment3/ill_typed/error_ambiguous_sum_type/bad-pair.stella",
            "testiks" +
                    "/assignment3/ill_typed/error_unexpected_injection/bad-sum-types-10.stella",
            "testiks" +
                    "/assignment3/ill_typed/error_unexpected_injection/bad-sum-types-11.stella",
    })
    void textAmbSumType(String filepath) throws Exception {
        String err = "ERROR_AMBIGUOUS_SUM_TYPE";
        String[] args = new String[0];
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(filepath);
        System.setIn(fips);
        Exception e = Assertions.assertThrows(RuntimeException.class, () -> Main.main(args));
        Assertions.assertTrue(e.getMessage().contains(err));
        System.setIn(original);
    }

    @ParameterizedTest(name = "{index} Typechecking error_illegal_empty_matching program {0}")
    @ValueSource(strings = {
            "testiks" +
                    "/assignment3/ill_typed/error_illegal_empty_matching/bad-sum-types-6.stella",
            "testiks" +
                    "/assignment3/ill_typed/error_illegal_empty_matching/bad-sum-types-7.stella"
    })
    void textEmptyMatch(String filepath) throws Exception {
        String err = "ERROR_ILLEGAL_EMPTY_MATCHING";
        String[] args = new String[0];
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(filepath);
        System.setIn(fips);
        Exception e = Assertions.assertThrows(RuntimeException.class, () -> Main.main(args));
        Assertions.assertTrue(e.getMessage().contains(err));
        System.setIn(original);
    }

    @ParameterizedTest(name = "{index} Typechecking error_nonexhaustive_match_patterns program {0}")
    @ValueSource(strings = {
            "testiks" +
                    "/assignment3/ill_typed/error_nonexhaustive_match_patterns/bad-sum-types-4.stella",
            "testiks/assignment4/ill-typed/error_nonexhaustive_match_patterns/bad-variants-3.stella",
            "testiks/assignment4/ill-typed/error_nonexhaustive_match_patterns/bool.stella",
            "testiks/assignment4/ill-typed/error_nonexhaustive_match_patterns/non-exaustive-match-patterns-1.stella",
            "testiks/assignment4/ill-typed/error_nonexhaustive_match_patterns/unexpected-variant-label-1.stella"

    })
    void textNonExMatch(String filepath) throws Exception {
        String err = "ERROR_NONEXHAUSTIVE_MATCH_PATTERNS";
        String[] args = new String[0];
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(filepath);
        System.setIn(fips);
        Exception e = Assertions.assertThrows(RuntimeException.class, () -> Main.main(args));
        Assertions.assertTrue(e.getMessage().contains(err));
        System.setIn(original);
    }

    @ParameterizedTest(name = "{index} Typechecking error_not_a_list program {0}")
    @ValueSource(strings = {
            "testiks" +
                    "/assignment3/ill_typed/error_not_a_list/not-a-list-isempty.stella",
    })
    void textNotAList(String filepath) throws Exception {
        String err = "ERROR_NOT_A_LIST";
        String[] args = new String[0];
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(filepath);
        System.setIn(fips);
        Exception e = Assertions.assertThrows(RuntimeException.class, () -> Main.main(args));
        Assertions.assertTrue(e.getMessage().contains(err));
        System.setIn(original);
    }


    @ParameterizedTest(name = "{index} Typechecking error_unexpected_list program {0}")
    @ValueSource(strings = {
            "testiks" +
                    "/assignment3/ill_typed/error_unexpected_list/unexepected-list-unit.stella",
            "testiks" +
                    "/assignment3/ill_typed/error_unexpected_list/unexpected-empty-list.stella",
            "testiks" +
                    "/assignment3/ill_typed/error_unexpected_list/unexpected-list-let-bindings.stella",
            "testiks" +
                    "/assignment3/ill_typed/error_unexpected_list/unexpected-list-natrec.stella",
            "testiks" +
                    "/assignment3/ill_typed/error_unexpected_list/unexpected-list-pair.stella",
            "testiks" +
                    "/assignment3/ill_typed/error_unexpected_list/unexpected-list-if-condition.stella"
    })
    void textUnexList(String filepath) throws Exception {
        String err = "ERROR_UNEXPECTED_LIST";
        String[] args = new String[0];
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(filepath);
        System.setIn(fips);
        Exception e = Assertions.assertThrows(RuntimeException.class, () -> Main.main(args));
        Assertions.assertTrue(e.getMessage().contains(err));
        System.setIn(original);
    }

    @ParameterizedTest(name = "{index} Typechecking error_unexpected_pattern_for_type program {0}")
    @ValueSource(strings = {
            "testiks" +
                    "/assignment3/ill_typed/error_unexpected_pattern_for_type/bad-sum-types-12.stella",
            "testiks" +
                    "/assignment3/ill_typed/error_unexpected_pattern_for_type/bad-sum-types-13.stella",
            "testiks/assignment4/ill-typed/error_unexpected_pattern_for_type/bad-variants-1.stella",
            "testiks/assignment4/ill-typed/error_unexpected_pattern_for_type/lists-1.stella",
            "testiks/assignment4/ill-typed/error_unexpected_pattern_for_type/tuples-1.stella",
            "testiks/assignment4/ill-typed/error_unexpected_pattern_for_type/unexpected-pattern-match-1.stella",
            "testiks/assignment4/ill-typed/error_unexpected_pattern_for_type/unexpected-pattern-match-2.stella",
            "testiks/assignment4/ill-typed/error_unexpected_pattern_for_type/unit.stella"
    })
    void textUnexPatForTp(String filepath) throws Exception {
        String err = "ERROR_UNEXPECTED_PATTERN_FOR_TYPE";
        String[] args = new String[0];
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(filepath);
        System.setIn(fips);
        Exception e = Assertions.assertThrows(RuntimeException.class, () -> Main.main(args));
        Assertions.assertTrue(e.getMessage().contains(err));
        System.setIn(original);
    }

    @ParameterizedTest(name = "{index} Typechecking error_ambiguous_variant_type program {0}")
    @ValueSource(strings = {
            "testiks/assignment4/ill-typed/error_ambiguous_variant_type/ambiguous-variant-type-1.stella",
            "testiks/assignment4/ill-typed/error_ambiguous_variant_type/ambiguous-variant-type-2.stella",
            "testiks/assignment4/ill-typed/error_ambiguous_variant_type/ambiguous-variant-type-3.stella",
            "testiks/assignment4/ill-typed/error_ambiguous_variant_type/unexpected-variant-1.stella",
            "testiks/assignment4/ill-typed/error_ambiguous_variant_type/unexpected-variant-2.stella",
            "testiks/assignment4/ill-typed/error_ambiguous_variant_type/unexpected-variant-3.stella",


    })
    void textUbmigVarTp(String filepath) throws Exception {
        String err = "ERROR_AMBIGUOUS_VARIANT_TYPE";
        String[] args = new String[0];
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(filepath);
        System.setIn(fips);
        Exception e = Assertions.assertThrows(RuntimeException.class, () -> Main.main(args));
        Assertions.assertTrue(e.getMessage().contains(err));
        System.setIn(original);
    }

    @ParameterizedTest(name = "{index} Typechecking error_missing_fields program {0}")
    @ValueSource(strings = {
            "testiks/assignment6/ill_typed/error_missing_fields/functions-1.stella",
            "testiks/assignment6/ill_typed/error_missing_fields/functions-2.stella",
            "testiks/assignment6/ill_typed/error_missing_fields/functions-4.stella",
            "testiks/assignment6/ill_typed/error_missing_fields/bad-subtyping-1.stella",
            "testiks/assignment6/ill_typed/error_missing_fields/bad-subtyping-2.stella",
            "testiks/assignment6/ill_typed/error_missing_fields/bad-subtyping-3.stella",
            "testiks/assignment6/ill_typed/error_missing_fields/bad-subtyping-6.stella",
            "testiks/assignment6/ill_typed/error_missing_fields/bad-subtyping-9.stella",
            "testiks/assignment6/ill_typed/error_missing_fields/pairs-4.stella",
            "testiks/assignment6/ill_typed/error_missing_fields/references-1.stella",
            "testiks/assignment6/ill_typed/error_missing_fields/references-2.stella",
            "testiks/assignment6/ill_typed/error_missing_fields/references-7.stella",

    })
    void testSubtype1(String filepath) throws Exception {
        String err = "ERROR_MISSING_RECORD_FIELDS";
        String[] args = new String[0];
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(filepath);
        System.setIn(fips);
        Exception e = Assertions.assertThrows(RuntimeException.class, () -> Main.main(args));
        Assertions.assertTrue(e.getMessage().contains(err));
        System.setIn(original);
    }

    @ParameterizedTest(name = "{index} Typechecking error_unexpected_subtype program {0}")
    @ValueSource(strings = {
            "testiks/assignment6/ill_typed/error_unexpected_subtype/functions-3.stella",
            "testiks/assignment6/ill_typed/error_unexpected_subtype/bad-subtyping-4.stella",
            "testiks/assignment6/ill_typed/error_unexpected_subtype/bad-subtyping-7.stella",
            "testiks/assignment6/ill_typed/error_unexpected_subtype/bad-subtyping-8.stella",
            "testiks/assignment6/ill_typed/error_unexpected_subtype/lists-1.stella",
            "testiks/assignment6/ill_typed/error_unexpected_subtype/lists-2.stella",
            "testiks/assignment6/ill_typed/error_unexpected_subtype/lists-3.stella",
            "testiks/assignment6/ill_typed/error_unexpected_subtype/lists-4.stella",
            "testiks/assignment6/ill_typed/error_unexpected_subtype/lists-5.stella",
            "testiks/assignment6/ill_typed/error_unexpected_subtype/pairs-1.stella",
            "testiks/assignment6/ill_typed/error_unexpected_subtype/pairs-2.stella",
            "testiks/assignment6/ill_typed/error_unexpected_subtype/pairs-3.stella",
            "testiks/assignment6/ill_typed/error_unexpected_subtype/pairs-5.stella",
            "testiks/assignment6/ill_typed/error_unexpected_subtype/references-3.stella",
            "testiks/assignment6/ill_typed/error_unexpected_subtype/references-4.stella",
            "testiks/assignment6/ill_typed/error_unexpected_subtype/references-6.stella",


    })
    void testUnexpectedSubtype2(String filepath) throws Exception {
        String err = "ERROR_UNEXPECTED_SUBTYPE";
        String[] args = new String[0];
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(filepath);
        System.setIn(fips);
        Exception e = Assertions.assertThrows(RuntimeException.class, () -> Main.main(args));
        Assertions.assertTrue(e.getMessage().contains(err));
        System.setIn(original);
    }

    @ParameterizedTest(name = "{index} Typechecking error_missing_fields program {0}")
    @ValueSource(strings = {
            "testiks/assignment4/ill-typed/error_unexpected_type_for_expression/ambiguous-variant-type-4.stella",
            "testiks/assignment4/ill-typed/error_unexpected_type_for_expression/unexpected-type-of-expression-with-alternative-errors.stella",
    })
    void testSubt2ype1(String filepath) throws Exception {
        String err = "ERROR_UNEXPECTED_VARIANT_LABEL";
        String[] args = new String[0];
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(filepath);
        System.setIn(fips);
        Exception e = Assertions.assertThrows(RuntimeException.class, () -> Main.main(args));
        Assertions.assertTrue(e.getMessage().contains(err));
        System.setIn(original);
    }


}
