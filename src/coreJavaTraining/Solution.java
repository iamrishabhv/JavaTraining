package coreJavaTraining;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        // Write your code here.
        if (s.isEmpty()) {
        	System.out.println(0);
        }
        else {
        String[] arr = s.trim().split("[^A-Za-z]+");
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        }
        scan.close();
    }
}

