package cn.zedongw.i18n;

import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.*;

public class I18NDemoTest {
    I18NDemo i18NDemo = new I18NDemo();

    @Test
    public void getI18N() {
        i18NDemo.getI18N();
    }

    @Test
    public void getI18N2() throws ParseException {
        i18NDemo.getI18N2();
    }
}