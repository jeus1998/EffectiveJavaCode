package com.example.effectivejavacode._02.item5._01_staticutilty;
import java.util.*;
public class SpellChecker {
    private static final Lexicon dictionary = new KoreanDictionary();
    private SpellChecker () {}
    public static boolean isValid(String word){
        return true;
    }
    public static List<String> suggestions(String type){
        return List.of();
    }
}
