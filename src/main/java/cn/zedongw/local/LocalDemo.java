package cn.zedongw.local;

import java.util.Locale;

/**
 * @Author ZeDongW
 * @ClassName LocalDemo
 * @Description 本地化演示
 * @Version 1.0
 * @date ：Created in 2019/7/15 6:46
 * @modified By：
 */

public class LocalDemo {
    public void getLocal(){
        Locale locale = Locale.US;

        System.out.println(locale.getCountry());
        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getLanguage());
    }
}
