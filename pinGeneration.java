package myfirst.java;
import java.util.*;
class pinGeneration
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] input = new int[3];
		for(int i=0;i<3;i++) {
			input[i]=scanner.nextInt();
		}
		System.out.print(createPIN(input));
		scanner.close();
	}
    public static int createPIN(int[] input){
        int max = -999, len = 0, Result = 0;
        while(input[0] > 0 || input[1] > 0 || input[2] > 0){
            int min = Math.min(input[0] % 10, Math.min(input[1] % 10, input[2] % 10));
            int currentMax = Math.max(input[0] % 10, Math.max(input[1] % 10, input[2] % 10));
            if(currentMax > max){
                max = currentMax;
            }
            input[0] /= 10;
            input[1] /= 10;
            input[2] /= 10;
            Result += (Math.pow(10, len) * min);
            len++;
        }
        Result += max * 1000;
        return Result;
    }
}
