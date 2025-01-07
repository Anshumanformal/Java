public class Binary_Search {
    
     public int solution(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right-left) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1; // When the target is not found
    }

    public static void main(String[] args) {
        Binary_Search solution = new Binary_Search();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int result = solution.solution(nums, target);
        System.out.println("Index of target " + target + ": " + result);
        
    }
}