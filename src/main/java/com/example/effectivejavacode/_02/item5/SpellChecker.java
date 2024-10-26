package com.example.effectivejavacode._02.item5;

import java.util.List;
import java.util.function.Supplier;

public class SpellChecker {
    private final Lexicon dictionary;
    public SpellChecker (Supplier<? extends Lexicon> dictionary) {
        this.dictionary = dictionary.get();
    }
    public boolean isValid(String word){
        return true;
    }
    public List<String> suggestions(String type){
        return List.of();
    }

    public static void main(String[] args) {
        SpellChecker spellChecker = new SpellChecker(() -> new KoreanDictionary());
    }
    static class Inner {}
}
