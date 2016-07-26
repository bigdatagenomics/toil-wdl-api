package org.bdgenomics.utils;

import java.lang.reflect.Array;
import java.util.Collection;

public class HashUtils {

    public static int hashAdd(int hash1, int hash2) {
        return 37 * (hash1 + hash2);
    }

    public static int hashOrNull(Object value) {
        if(value == null) {
            return 1;
        } else if (value instanceof Collection) {
            return hashCollection((Collection) value);
        } else if (value.getClass().isArray()) {
            return hashArray(value);
        } else {
            return value.hashCode();
        }
    }

    public static int hashArray(Object array) {
        int code = 17;
        if(array != null) {
            int length = Array.getLength(array);
            for(int i = 0; i < length; i++) {
                Object value = Array.get(array, i);
                code = hashAdd(code, hashOrNull(value));
            }
        }
        return code;
    }

    public static int hashCollection(Collection values) {
        int code = 17;
        if(values != null) {
            for(Object value : values) {
                code = hashAdd(code, hashOrNull(value));
            }
        }
        return code;
    }

    public static int hash(Object... values) {
        int code = 17;
        for(Object value : values) {
            code = hashAdd(code, hashOrNull(value));
        }
        return code;
    }
}
