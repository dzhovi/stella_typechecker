package org.stella.assignment1.well_typed;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.stella.Main;
import org.stella.typecheck.Declarations;

import java.io.FileInputStream;
import java.io.InputStream;

public class UniversalTests {

    @BeforeEach
    void clearContext() {
        Declarations.declVars.clear();
        Declarations.declFuns.clear();
        Declarations.nodes.clear();
        Declarations.subtypeEnabled = false;
        Declarations.autoEnabled = false;
        Declarations.universalEnabled = false;
    }

    @ParameterizedTest(name = "{index} Typechecking well-typed program {0}")
    @ValueSource(strings = {
            "testiks/assignment9/1",
            "testiks/assignment9/2",
            "testiks/assignment9/3",
            "testiks/assignment9/4",
            "testiks/assignment9/5",
            "testiks/assignment9/6",


    })
    void testWellTyped(String filepath) throws Exception {
        String[] args = new String[0];
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(filepath);
        System.setIn(fips);
        Assertions.assertDoesNotThrow(() -> Main.main(args));
        System.setIn(original);
    }
}
