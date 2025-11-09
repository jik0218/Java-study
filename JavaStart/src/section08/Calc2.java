package section08;

public class Calc2 {
	void sum(int[] nums) {
	int result = 0;
	for(int i = 0; i < nums.length; i++) {
		result += nums[i];
	}
    
	System.out.println("숫자들의 합은 " + result + " 입니다.");
  }
}