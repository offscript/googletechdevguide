public boolean canBalanceRecursive(int[] nums, int midpoint, String last_direction) {
    if (sum(0, midpoint, nums) > sum(midpoint, nums.length, nums)) {
      if (last_direction.equals("LEFT")) {
        return false;
      } else {
        return canBalanceRecursive(nums, midpoint - 1, "RIGHT"); 
      }
    } else if (sum(0, midpoint, nums) < sum(midpoint, nums.length, nums)) {
      if (last_direction.equals("RIGHT")) {
        return false;
      } else {
        return canBalanceRecursive(nums, midpoint + 1, "LEFT");
      }
    } else {
      return true;
    }
  }
  
public int sum(int start, int end, int[] nums) {
    int sum = 0;
    for (int i = start; i < end; i++) {
      sum = sum + nums[i];
    }
    return sum;
  }

public boolean canBalance(int[] nums) {
  int midpoint = nums.length / 2;
  String baseString = "";
  return canBalanceRecursive(nums, midpoint, baseString);
}