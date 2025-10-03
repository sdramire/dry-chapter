package com.ejercicio2.infrastructure.rest.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ValidationUtils {
    public static boolean isNegative(double value) {
        return value < 0;
    }
    public static boolean isZero(double value) {
        return value == 0;
    }
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.isEmpty();
    }
}

