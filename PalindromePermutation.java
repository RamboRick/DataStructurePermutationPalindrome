package hw2;

import java.util.HashSet;
public class PalindromePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	  public boolean palindromCheck(String inputString){
		HashSet<Character> crr = new HashSet<>();
		for (char s : inputString.toCharArray()){
			if ( crr.contains(s) ){
				crr.remove(s);
			}else {
				crr.add(s);
			}
		}
		return crr.size() <=1;
	}
	  
	 
	  
}
