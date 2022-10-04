package org.jinngm.jvm.anatomy;

import java.util.ArrayList;
import java.util.List;

public class AL {
    static List<Object> l;
    public static void main(String... args) {
        l = new ArrayList<>();
        for (int c = 0; c < 100_000_000; c++) {
            l.add(new Object());
        }
    }
}
