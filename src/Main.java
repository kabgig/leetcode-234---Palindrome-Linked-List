public class Main {
    public static void main(String[] args) {
        int[] nums = {8,0,7,1,7,7,9,7,5,2,9,1,7,3,7,0,6,5,1,7,7,9,3,8,1,5,7,7,8,4,0,9,3,7,3,4,5,7,4,8,8,5,8,9,8,5,8,8,4,7,5,4,3,7,3,9,0,4,8,7,7,5,1,8,3,9,7,7,1,5,6,0,7,3,7,1,9,2,5,7,9,7,7,1,7,0,8};
        ListNode next = null;
        ListNode lNcurrent = new ListNode(nums[nums.length - 1],null);
        for (int i = nums.length - 2; i >=0 ; i--) {
            next = lNcurrent;
            lNcurrent = new ListNode(nums[i],next);
        }

        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(lNcurrent));
    }
}
