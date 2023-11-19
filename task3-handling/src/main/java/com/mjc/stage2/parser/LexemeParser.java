package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.TextComponent;
import com.mjc.stage2.entity.TextComponentType;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexemeParser extends AbstractTextParser{
    private static final String WORD_REGEX = "\\w[\\w!=?():]+";

    // Write your code here!
    public LexemeParser(){}
    public LexemeParser(AbstractTextParser nextParser){
        super.setNextParser(nextParser);
    }

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
        getMatches(WORD_REGEX, string)
                .stream()
                .forEach(part -> {
                    AbstractTextComponent inner = new TextComponent(TextComponentType.SYMBOL);
                    this.nextParser.parse(inner, part);
                    abstractTextComponent.add(inner);
                });
    }
}
