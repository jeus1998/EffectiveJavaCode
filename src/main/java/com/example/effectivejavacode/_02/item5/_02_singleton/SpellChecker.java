package com.example.effectivejavacode._02.item5._02_singleton;

import java.util.List;
public class SpellChecker {
    private final Lexicon dictionary = new KoreanDictionary();
    private SpellChecker () {}
    public static SpellChecker INSTANCE = new SpellChecker();
    public boolean isValid(String word){
        return true;
    }
    public List<String> suggestions(String type){
        return List.of();
    }
}
