public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3,2,1};
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
