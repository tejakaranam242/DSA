package myfirst.java;
import java.util.*;
public class difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int noofValues = scanner.nextInt();
		int[] values = new int[noofValues];
		for(int i=0;i<noofValues;i++) {
			values[i] = scanner.nextInt();
		}
		System.out.print("The Difference of Stable and Unstable numbers is "+difference(values));
		scanner.close();
	}
	static int difference(int[] values) {	
		int stableSum=0,unStableSum=0;
		for(int i=0;i<values.length;i++) {
			int[] frequency = new int[10];
			int number = values[i];
			while(number>0) {
				int Remainder = number%10;
				frequency[Remainder]++;
				number/=10;
			}
			Arrays.sort(frequency);
			boolean isStable = true;
			for(int j=0;j<(frequency.length)-1;j++) {
				if((frequency[j]!=frequency[j+1])&&frequency[j]!=0) {
					isStable = false;
				}
			}
			if(isStable) {
				stableSum+=values[i];
			}
			else {
				unStableSum+=values[i];
			}
		}
		return stableSum-unStableSum;
	}
}
