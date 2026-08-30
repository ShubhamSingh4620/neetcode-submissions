class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] arr=new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            arr[i][0]=nums[i];
            arr[i][1]=i;
        }
        Arrays.sort(arr,(a,b) -> Integer.compare(a[0],b[0]));
        for(int i=0;i<arr.length-1;i++){
            int rem=target-arr[i][0];
            int left=i+1;
            int right=arr.length-1;
            while(left<=right){
                int mid=left+(right-left)/2;
                if(arr[mid][0]==rem){
                    int index1=arr[i][1];
                    int index2=arr[mid][1];
                    if(index1<index2){
                        return new int[]{index1, index2};
                    }
                    else{
                        return new int[] {index2, index1};
                    }
                }
                else if(arr[mid][0]<rem){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        return new int[] {};
    }
}
