class Solution {
    public void sortColors(int[] nums) {
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++)
        //     System.out.print(nums[i]);
        int temp;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length-1-i;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
}
