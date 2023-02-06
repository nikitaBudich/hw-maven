package org.example.common;

import org.junit.jupiter.api.Test;

public class ExampleIT {
    private static final PrintUtil printUtil = new PrintUtil();

    @Test
    public void test() {
        printUtil.print();
    }
}