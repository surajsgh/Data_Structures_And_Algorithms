public class ProductArrayResult {
    //  Time Complexity : O(n)
    //  Auxiliary Space : O(1)
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for(int i=0, temp=1; i<n; i++) {
            result[i] = temp;
            temp *= nums[i];
        }
        for(int i=n-1, temp=1; i>=0; i--) {
            result[i] *= temp;
            temp *= nums[i];
        }
        return result;
    }
}
