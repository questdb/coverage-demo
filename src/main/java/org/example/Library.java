package org.example;

import java.io.File;

public class Library {
    public int incIfTrue(int n, boolean condition) {
        if (condition) {
            return n + 1;
        } else {
            return n;
        }
    }

    public static native int nativeIncIfTrue(int n, boolean condition);

    static {
        try {
            System.load(new File(Library.class.getResource("libcoverage_demo.dylib").toURI()).getPath());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
