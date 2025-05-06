package coreJavaTraining;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class validPalindrome {
    public boolean isPalindrome(String s) {
        String b = s.replaceAll("[^A-Za-z0-9]", "");
        String r = new StringBuilder(b).reverse().toString();
        System.out.println(r);
        if (b.equalsIgnoreCase(r)) {
            return true;
        } else {
            return false;
        }
    }
}