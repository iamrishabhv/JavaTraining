package coreJavaTraining;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaHashMap {
	
	public void getCaller() {
		Map<String, String> caller = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int entries = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i<entries; i++) {
			String name = sc.nextLine().trim();
			String phone = sc.nextLine().trim();
			caller.put(name, phone);
		}
		String query = null;
		while(sc.hasNext()) {
			query = sc.nextLine();
			if(query.isEmpty()) continue;
			if(caller.containsKey(query)) {
				System.out.println();
				System.out.println(query + "=" + caller.get(query));
				}
			else {
				System.out.println("Not found");
				}
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaHashMap JH = new JavaHashMap();
		JH.getCaller();

	}

}
