package section08;

public class Calc3 {
	public int sum(int[] nums) {
		int result = 0;
		for(int i = 0; i < nums.length; i++) {
			result += nums[i];
		}
		
		return result;
	}

}
