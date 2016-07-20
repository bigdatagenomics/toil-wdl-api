package org.bdgenomics.utils;

public class HashUtils {

    public static int hashAdd(int hash1, int hash2) {
        return 37 * (hash1 + hash2);
    }

    public static int hashOrNull(Object value) {
        return value == null ? 1 : value.hashCode();
    }

    public static int hash(Object... values) {
        int code = 17;
        for(Object value : values) {
            code = hashAdd(code, hashOrNull(value));
        }
        return code;
    }
}
