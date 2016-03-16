package org.bdgenomics.utils;

public class EqualityUtils {

    public static boolean eq(Object v1, Object v2) {
        if(v1 == null || v2 == null) {
            return v1 == v2;
        } else {
            return v1.equals(v2);
        }
    }

    public static boolean check(Object v) { return v != null; }

    public static <T> T as(Object v, Class<T> cls) {
        if(!cls.isAssignableFrom(v.getClass())) { return null; }
        return cls.cast(v);
    }

    public static Object[] of(Object... vs) { return vs; }

    public static Object[] to(Object... vs) { return vs; }

    public static boolean eq(Object[] v1s, Object[] v2s) {

        // A null array indicates that a pre-condition failed, so this function should return 'false'
        // (rather than throw an exception)
        if(v1s == null || v2s == null) { return false; }

        if(v1s.length != v2s.length) { throw new IllegalArgumentException("Equality arrays must have same length"); }
        for(int i = 0; i < v1s.length; i++) {
            if(!eq(v1s[i], v2s[i])) {
                return false;
            }
        }
        return true;
    }
}
