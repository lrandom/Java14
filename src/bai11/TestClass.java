/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.annotation.Resource;

/**
 *
 * @author Lrandom
 */
public class TestClass {
    public static void main(String[] args) {
        /*Locale locale = new Locale("vi", "VN");
        ResourceBundle res = ResourceBundle.getBundle("main",locale);
        System.out.println(res.getString("hi"));
        
       
        Enumeration<String> resk = res.getKeys();
        while( resk.hasMoreElements()){
            String key =  resk.nextElement();
            System.out.println(res.getString(key));
        }
        
        Locale locale1 = Locale.getDefault();
        System.out.println(locale1.getDisplayCountry());
        System.out.println(locale1.getCountry());*/
        
        Locale local = new Locale("vi","VN");
        Locale localUS = new Locale("en","US");
        Locale localFR = new Locale("fr","fr");
        Locale localUK = new Locale("en","UK");
        NumberFormat numberFormat = NumberFormat.getNumberInstance(local);
        NumberFormat numberFormatUS = NumberFormat.getNumberInstance(localUS);
        NumberFormat numberFormatFR = NumberFormat.getNumberInstance(localFR);
        NumberFormat numberFormatUK = NumberFormat.getNumberInstance(localUK);
        
        System.out.println(numberFormat.format(10552.20));
        System.out.println(numberFormatFR.format(10552.20));
        System.out.println(numberFormatUS.format(10552.20));
        System.out.println(numberFormatUK.format(10552.20));
        
        NumberFormat numberFormatCurrency = NumberFormat.getCurrencyInstance(local);
        NumberFormat numberFormatCurrencyUK = NumberFormat.getCurrencyInstance(localFR);
        NumberFormat numberFormatCurrencyUS = NumberFormat.getCurrencyInstance(localUS);
        
        System.out.println(numberFormatCurrency.format(1000000));
        System.out.println(numberFormatCurrencyUK.format(1000000));
        System.out.println(numberFormatCurrencyUS.format(1000000));
        
        NumberFormat numberFormatPercent = NumberFormat.getPercentInstance(local);
        NumberFormat numberFormatPercentUS = NumberFormat.getPercentInstance(localFR);
        System.out.println(numberFormatPercent.format(100));
        System.out.println(numberFormatPercentUS.format(100));
        
        
        Date dateString = new Date();
        //Locale localVI = new Locale("vi","VN");
        //Locale localUS = new Locale("en","US");
        //VietNam
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT,local);
        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.MEDIUM,local);
        DateFormat dateFormat3 = DateFormat.getDateInstance(DateFormat.LONG,local);
        
        //Mỹ
        DateFormat dateFormatUS = DateFormat.getDateInstance(DateFormat.SHORT,localUS);
        DateFormat dateFormatUS2 = DateFormat.getDateInstance(DateFormat.MEDIUM,localUS);
        DateFormat dateFormatUS3 = DateFormat.getDateInstance(DateFormat.LONG,localUS);
        
        System.out.println(dateFormat.format(dateString));
        System.out.println(dateFormat2.format(dateString));
        System.out.println(dateFormat3.format(dateString));
        
        System.out.println(dateFormatUS.format(dateString));
        System.out.println(dateFormatUS2.format(dateString));
        System.out.println(dateFormatUS3.format(dateString));
        
        
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        String text = "1/09/2019";
        try {
             Date date = simpleDateFormat.parse(text);
             System.out.println(date.getTime());
             System.out.println(date.getDay());
             System.out.println(date.getDate());
             System.out.println(date.toLocaleString());
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        
    }
}
