/*
217.Contains Duplicate
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
*/
class Solution {
    public boolean containsDuplicate(int[] nums) {
      Map<Integer,Integer> maps = new HashMap<>();
    		
    		for (int i = 0; i<nums.length;i++)
    		{
    			maps.put(nums[i], maps.getOrDefault(nums[i],0)+1);
    			if (maps.containsKey(nums[i]) && (maps.get(nums[i])>1))
    			{
    				return true;
    			}
    		}
    		
    		return false;
       
    }
}
