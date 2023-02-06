package org.example.service;

import org.example.common.PrintUtil;

public class AppRunner {
    private final static PrintUtil printUtil = new PrintUtil();

    public static void main(String[] args) {
        printUtil.print();
    }
}
