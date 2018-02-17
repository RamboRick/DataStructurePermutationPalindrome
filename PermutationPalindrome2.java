package hw2;

public class PermutationPalindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String init = "abba";
		System.out.println(palindromCheck(init));
	}
	public static boolean palindromCheck(String inputString){
		int [] crr = new int[256];
		int res = 0;
		for(int s : inputString.toCharArray()){
			if(crr[s] > 0){
				crr[s]--;
			}else {
				crr[s]++;
			}
		}
		
		for (int i =0;i<crr.length;i++){
			if (crr[i] != 0){
				 res++;
			}
		}
		return res<=1;
		
	}
}
