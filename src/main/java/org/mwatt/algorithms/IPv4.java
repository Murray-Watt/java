package org.mwatt.algorithms;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPv4 {
    public static void main(String[] args) {
        String hostOrAddressRegEx = "(\\d{1,2}|([01])\\d{2}|2[0-4]\\d|25[0-5])";
        String ipV4RegEx = (STR."\{hostOrAddressRegEx}\\.").repeat(3) + hostOrAddressRegEx;
        Pattern ipV4 = Pattern.compile(
                STR."^\{ipV4RegEx}$",
                Pattern.CASE_INSENSITIVE);

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String ip = scanner.next();
            Matcher matcher = ipV4.matcher(ip);
            boolean valid = matcher.find();
            System.out.println(valid);
        }
    }
}
