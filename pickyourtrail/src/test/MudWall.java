package test;

import java.util.Scanner;
/**
 * MudWall class hold the logic to bulid the mud wall of given condition.
 * 
 * @author Nagendra Babu puttigampala
 *
 */

public class MudWall {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nextPostion = scanner.nextInt();
		int[] arrayPos = new int[nextPostion];
		int posArraySize = 0;
		int mudWallHeight = 0;
		for (int loop = 0; loop < nextPostion; loop++) {
			arrayPos[loop] = scanner.nextInt();
			if(arrayPos[loop] > posArraySize) {
				posArraySize = arrayPos[loop];
			}
		}
		int[] finalArray = new int[posArraySize];
		int nextHeight = scanner.nextInt();
		for (int loop = 0; loop < nextHeight; loop++) {
			finalArray[arrayPos[loop]-1] = scanner.nextInt();
		}

		for (int loop = 0; loop < finalArray.length; loop++) {
			if(finalArray[loop] == 0) {
				if(loop-1>=0) {
					finalArray[loop] = finalArray[loop-1]+1;
				}
				if(loop+1<=finalArray.length && finalArray[loop+1]!=0) {
					finalArray[loop] = finalArray[loop-1]>finalArray[loop+1] ? finalArray[loop+1]+1 :  finalArray[loop];
				}
				if(finalArray[loop]>mudWallHeight)
					mudWallHeight = finalArray[loop];
			}
		}
		System.out.println(mudWallHeight);
		scanner.close();
	}
}
