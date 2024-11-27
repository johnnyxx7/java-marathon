package javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        String hello = bundle.getString("hello");
        String goodMorning = bundle.getString("good.morning");
        System.out.println(hello);
        System.out.println(goodMorning);
        ResourceBundle bundle2 = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle2.getString("hello"));
        System.out.println(bundle2.getString("good.morning"));
    }
}
