import java.io.*;
import java.util.*;


class Main {
	public static void main (String[] args) {
		Scanner ob = new Scanner(System.in);
		int size = ob.nextInt();
		int arr[] = new int[size];
		for(int i = 0; i < size; i++){
		    arr[i] = ob.nextInt();
		}
		int target = ob.nextInt();
		for(int i: new TwoSum().twoSum(arr, target)){
		    System.out.print(i+" ");
		}
	}
}
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int cur = target - nums[i];
            if(map.containsKey(cur)){
                return new int[]{map.get(cur), i};
            }
            map.put(nums[i], i);
        }
        return new int[2];
    }
}
