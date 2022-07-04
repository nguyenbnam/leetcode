public class Leetcode {
    /**
     * twoSum
     * b1: gán 1 biết sum = 0;
     * b2: duyệt từng phần tử với các phần tử phía sau;
     * b2.1: gán sum = phần tử thứ i + phần tử thứ j với vị trí j = i + 1
     * b2.2: kiểm tra sum == target
     *  - True: return mảng với 2 vị trí này
     *  - False: continue
     * b3: mặc định return mảng không có giá trị
     * */
    public static int[] twoSum(int[] nums, int target) {
        int sum = 0;
        for (int i = 0; i < nums.length -1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    /**
    * isPalindrome
    */
    public static boolean isPalindrome(int num) {
        int reverse = 0;
        int mask = num, diffNumber = num;
        int i = 0, surplus = 0;
        while (num > 0) {
            surplus = num / 10;
            if (surplus != 0) {
                i++;
            }
            num /= 10;
        }
        // reverse
        while (mask > 0) {
            reverse += (mask % 10) * Math.pow(10, i);
            i--;
            mask /= 10;
        }

        if (reverse == diffNumber) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        /**
         * Leetcode with twoSum (question 1)
         * This case for with two number inside
         */
        int [] a = {1, 2, 3, 5, 5, 8};
        int target = 9;
        /**
        * for (int i : twoSum(a, target)) {
        *    System.out.println(i);
        * }
        */

        /**
         * Leetcode with isPalindrome (question 9)
         */
        int palindrome = 2147483647;
//        if (isPalindrome(palindrome))
//            System.out.println("This is TRUE");
//        else
//            System.out.println("This is FALSE");
        int num = 2147483647;
        long reverse = 0;
        int mask = num, diffNumber = num;
        int i = 0, surplus = 0;
        while (num > 0) {
            surplus = num / 10;
            if (surplus != 0) {
                i++;
            }
//            System.out.println(num);
            num /= 10;
        }
        // reverse
        while (mask > 0) {
//            System.out.println(mask);
            reverse += (mask % 10) * Math.pow(10, i);
            i--;
            System.out.println(reverse);
            mask /= 10;
        }
        System.out.println(reverse);
    }
}
