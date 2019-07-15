package cn.zedongw.i18n;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @Author ZeDongW
 * @ClassName I18NDemo
 * @Description 本国际化演示
 * @Version 1.0
 * @date ：Created in 2019/7/15 6:59
 * @modified By：
 */

public class I18NDemo {

    /**
     * @Author: ZeDongW
     * @Description: 静态文本国际化
     * @Date: 2019/7/15 7:10
     * @Param: []
     * @return: void
     */
    public void getI18N(){
        //设置语言环境
        Locale locale = Locale.US;

        //创建工具类对象
        ResourceBundle bundle = ResourceBundle.getBundle("msg", locale);

        //根据key获取文件中的value
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("userName"));
        System.out.println(bundle.getString("passWord"));
    }

    /**
     * @Author: ZeDongW
     * @Description: 动态文本国际化
     * @Date: 2019/7/15 7:11
     * @Param: []
     * @return: void
     */
    public void getI18N2() throws ParseException {
        //模拟语言环境
        Locale locale = Locale.CHINA;

        //国际化货币
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);

        //国际化数字
        NumberFormat numberInstance = NumberFormat.getNumberInstance(locale);

        //国际化百分比
        NumberFormat percentInstance = NumberFormat.getPercentInstance(locale);

       /* //数据准备
        double money = 100;

        //国际化
        String s = currencyInstance.format(money);

        System.out.println(s);

       String s = "￥100.00";

       int num = 10;

        Number parse = currencyInstance.parse(s);
        System.out.println(parse.intValue() * num);*/

       //日期格式化
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.FULL, locale);

//        System.out.println(df.format(new Date()));
        String s = "19-7-15 上午07时33分52秒 CST";

        System.out.println(df.parse(s));
    }
}
