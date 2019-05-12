package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		
	for(int i = 0; i<eggs.size(); i++) {
		//System.out.println(i);
		if( eggs.get(i).equals("cracked") ) {
		//	System.out.println(i);
		  return i;
		}
	}
		
		return -1;
	}

	public static int countPearls(List<Boolean> oyesters) {
		int num = 0;
	
		for(int i = 0; i<oyesters.size(); i++) {
			//System.out.println(i);
			if( oyesters.get(i) == true ) {
				
			 num++;
		//	 System.out.println(num);
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

	public static Object findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		int length = 0; 
		int  lword = 0;
		String slword = "";
		System.out.println(lword);
		for(int i = 0; i<words.size()-1; i++) {
			
			if(lword<words.get(i).length() ) {
			//	length = word
				//System.out.println(length = words.get(i).charAt(i));
				
				lword =  words.get(i).length();
				slword = words.get(i);
				

			}
		}
		System.out.println(slword);
		return slword;
	}

	public static Object containsSOS(List<String> message1) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		for(int i=1; i<message1.size(); i++) {
			
			
			if(message1.get(i).contains("... --- ...")) {
				System.out.println("t");
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		boolean close = true;
		while(close)
		for(int i=0; i< results.size()-1; i++) {
if(results.get(i)>results.get(i+1)) {
	double el1 = results.get(i);
	double el2 = results.get(i+1);

	results.set(i, el2);
	results.set(i+1,el1);
	System.out.println("desd");
	
	
}
else if(results.get(i)<results.get(i+1)) {
	close = true;
}

		}
		System.out.println(results);
		return results;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		// TODO Auto-generated method stub
		boolean close = true;
		while(close)
		for(int i=0; i< unsortedSequences.size()-1; i++) {
if(unsortedSequences.get(i).length()>unsortedSequences.get(i+1).length()) {
	String el1 = unsortedSequences.get(i);
	String el2 = unsortedSequences.get(i+1);

	unsortedSequences.set(i, el2);
	unsortedSequences.set(i+1,el1);
	System.out.println("desd");
		
		
	}
}
		return  unsortedSequences;
	}
}
