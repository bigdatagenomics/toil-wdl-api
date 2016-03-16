package org.bdgenomics.utils;

public class HashUtils {

    public static int hashOrNull(Object value) {
        return value == null ? 1 : value.hashCode();
    }

    public static int hash(Object... values) {
        int code = 17;
        for(Object value : values) {
            code += hashOrNull(value); code *= 37;
        }
        return code;
    }
}
