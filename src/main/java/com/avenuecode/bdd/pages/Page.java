package com.avenuecode.bdd.pages;

import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

/**
 * Created by ffranca on 3/20/15.
 */
public class Page extends WebDriverPage{

    public Page(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void found(String text){
        found(getPageSource(), text);
    }

    private void found(String pageSource, String text) {
        if(!pageSource.contains(escapeHTML(text))){
            fail("Text: '" + text + "' not found in page '" + pageSource + "'");
        }
    }

    public void found(List <String> texts){
        for(String text: texts)
            found(text);
    }

    public void notFound(String text){
        notFound(getPageSource(), text);
    }

    public void notFound(String pageSource, String text){
        assertThat(pageSource.contains(escapeHTML(text)), is(false));
    }

    private String escapeHTML(String text){
        return text.replace("<", "&lt;").replace(">", "&gt;");
    }
}
