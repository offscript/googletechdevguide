import java.util.*;

public class stringSplosion {
    public int maxSpan(int[] nums) {
    int maxSpan = 0;
    HashMap<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>(nums.length);
    for (int i = 0; i < nums.length; i++) {
      if (!map.containsKey(nums[i])) {
        ArrayList<Integer> valueList= new ArrayList<Integer>();
        valueList.add(i);
        map.put(nums[i], valueList);
      } else {
        ArrayList<Integer> valueList = new ArrayList<Integer>();
        valueList = map.get(nums[i]);
        valueList.add(i);
        map.put(nums[i], valueList);
      }
    }
    //System.out.println(map);
    for (ArrayList<Integer> valueList : map.values()) {
      Integer[] value_array = valueList.toArray(new Integer[valueList.size()]);
      int span = value_array[value_array.length - 1] - value_array[0] + 1;
      if (span > maxSpan) maxSpan = span;
      }
    return maxSpan;
    }
}
  