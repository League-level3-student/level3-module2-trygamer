package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		
	for(int i = 0; i<eggs.size(); i++) {
		System.out.println(i);
		if( eggs.get(i).equals("cracked") ) {
			System.out.println(i);
		  return i;
		}
	}
		
		return -1;
	}

	public static int countPearls(List<Boolean> oyesters) {
		int num = 0;
	
		for(int i = 0; i<oyesters.size(); i++) {
			System.out.println(i);
			if( oyesters.get(i) == true ) {
				
			 num++;
			 System.out.println(num);
			}
			
		}
			
		return num;
	
	}
	
	
	
	public static double findTallest(List<Double> peeps) {
		double tal = 0;
		for(int i = 0; i<peeps.size(); i++) {
			
			if (tal< peeps.get(i)) {
				tal = peeps.get(i);
						
			}
			
		}
		
		
		return tal;
	}
}
