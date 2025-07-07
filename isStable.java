package myfirst.java;
import java.util.*;
public class isStable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] frequency = new int[10];
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		while(number>0) {
			int Remainder = number%10;
			frequency[Remainder]++;
			number/=10;
		}
		Arrays.sort(frequency);
		boolean isStable = true;
		for(int i=0;i<(frequency.length)-1;i++) {
			if((frequency[i]!=frequency[i+1])&&frequency[i]!=0) {
				isStable = false;
			}
		}
		if(isStable) {
			System.out.print(isStable);
		}
		else {
			System.out.print(isStable);
		}
		scanner.close();
		}
}
