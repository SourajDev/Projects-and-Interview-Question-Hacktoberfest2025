class Solution {
    static boolean backtrack(int [] nums, int target,int sum,int i){
        if(sum==target)
            return true;
        if(i>nums.length-1 || sum>target)
            return false;
        for(int j=i;j<nums.length;j++)
        if(backtrack(nums,target,nums[j]+sum,j+1))
        return true;
        return false;
    }
    static boolean equalPartition(int nums[]) {
        int sum=0;
        for(int t:nums){
            sum=sum+t;
        }
        if(sum%2==1){
            return false;
        }
        
        return backtrack(nums,sum/2,0,0);
    }
    
}
