package coreJavaTraining;

import java.io.*;
import java.util.*;

public class JavaArrayListPractice {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the Number of Elements: ");
    	int N = sc.nextInt();
    	sc.nextLine();
    	List L = new ArrayList<>();
    	System.out.print("Enter the Array Elements: ");
    	for(int i = 0; i<N; i++) {
    		L.add(sc.nextLine());
    	}
    	System.out.print("Enter the Number of Queries: ");
    	int Q = sc.nextInt();
    	System.out.println("Insert");
    	int x = sc.nextInt();
    	int y = sc.nextInt();
    	if(x >= 0 && x <= L.size()) {
        	L.add(x, y);
    	}
    	System.out.println("Delete");
    	int z = sc.nextInt();
    	if(z >=0 && z<L.size()) {
        	L.remove(z);
    	}
    	System.out.println(L);
    	
    }
}

