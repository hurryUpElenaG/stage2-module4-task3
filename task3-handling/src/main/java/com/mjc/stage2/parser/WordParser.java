package com.mjc.stage2.parser;


import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.tokenizer.impl.TokenizerImpl;

public class WordParser extends  AbstractTextParser{

    // Write your code here!
    private static final String LEXEME_REGEX = "\\S";

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        TokenizerImpl.getMatches(LEXEME_REGEX, string)
                .forEach(part -> {
                    abstractTextComponent.add(new SymbolLeaf(null, part.charAt(0)));
                });
    }



}
