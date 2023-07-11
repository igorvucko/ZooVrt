/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoloskivrtapp.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Random;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import us.codecraft.xsoup.Xsoup;


/**
 *
 * @author Igor
 */
public class Alati {
    
    private static final int IBAN_LENGTH = 21;
    private static final String COUNTRY_CODE = "HR";
    private static final String ACCOUNT_NUMBER_PATTERN = "%019d";
    
    
    public static String generirajIBAN() {
        
        Random random = new Random();
        long accountNumber = random.nextLong() % 1_000_000_000_000_000_000L;

        String formattedAccountNumber = String.format(ACCOUNT_NUMBER_PATTERN, Math.abs(accountNumber));

        String iban = COUNTRY_CODE + formattedAccountNumber;

        return iban;
        
    }
    
     public static String dovuciOib() {

        try {
            URL url = new URL("http://oib.itcentrala.com/oib-generator/");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            url.openStream()));
            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                sb.append(inputLine);
            }
            in.close();
            Document d = Jsoup.parse(sb.toString());
            return Xsoup.compile("/html/body/div[1]/div[1]/text()").evaluate(d).get();
        } catch (Exception e) {
        }

        return "";
    }

    public static boolean kontrolaOIB(String oib) {
        if (oib==null || oib.length() != 11) {
            return false;
        }

        char[] chars = oib.toCharArray();

        int a = 10;
        for (int i = 0; i < 10; i++) {
            char c = chars[i];
            if (c < '0' || c > '9') {
                return false;
            }
            a = a + (c - '0');
            a = a % 10;
            if (a == 0) {
                a = 10;
            }
            a *= 2;
            a = a % 11;
        }
        int kontrolni = 11 - a;
        kontrolni = kontrolni % 10;

        if (kontrolni != (chars[10] - '0')) {
            return false;
        }
        return true;
    }
    
}

