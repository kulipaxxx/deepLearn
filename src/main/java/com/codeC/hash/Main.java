package com.codeC.hash;

/**
 * @Description: $NAME
 * @Author cheng
 * @Date: $DATE $TIME
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int hashCode = "codeC".hashCode();

        System.out.println("codeC HashCode" + Integer.toBinaryString(hashCode));
    }
}
