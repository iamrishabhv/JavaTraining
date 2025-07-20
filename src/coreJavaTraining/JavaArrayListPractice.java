package coreJavaTraining;

import java.io.*;
import java.util.*;

public class JavaArrayListPractice {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	List<Integer> L = new ArrayList<>();
    	for(int i = 0; i<N; i++) {
    		L.add(sc.nextInt());
    	}
    	int Q = sc.nextInt();
    	for(int i = 0; i<Q; i++) {
    		String query = sc.next();
    		int x = sc.nextInt();
    		if(query.equals("Insert")) {
    			int y = sc.nextInt();
    			L.add(x,y);
    		}
    		else {
    			L.remove(x);
    		}
    	}
    	sc.close();
    	for(Integer num : L) {
    		System.out.print(num + " ");
    	}
    	
    }
}

