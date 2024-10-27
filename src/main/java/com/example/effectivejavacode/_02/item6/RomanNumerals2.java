package com.example.effectivejavacode._02.item6;

import java.util.regex.Pattern;

public class RomanNumerals2 {
    public static boolean isRomanNumeral(String s){
        return RomanHolder.ROMAN.matcher(s).matches();
    }
    private static class RomanHolder{
        private static final Pattern ROMAN =
                    Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }
}
