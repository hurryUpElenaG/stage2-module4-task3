package com.mjc.stage2.parser;


import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordParser extends  AbstractTextParser{

    // Write your code here!
    private static final String LEXEME_REGEX = "\\S";

    public static List<String> getMatches(String regex, String string) {
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        List<String> results = new ArrayList<>();
        while (matcher.find()) {
            results.add( matcher.group(0));
        }
        return results;
    }

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        getMatches(LEXEME_REGEX, string)
                .forEach(part -> {
                    abstractTextComponent.add(new SymbolLeaf(null, part.charAt(0)));
                });
    }


}
