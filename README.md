# Leetcode

**Câu 1 - Towsum:**.\
input: int[] nums.\
b1: gán 1 biết sum = 0;.\
b2: duyệt từng phần tử với các phần tử phía sau;.\
b2.1: gán sum = phần tử thứ i + phần tử thứ j với vị trí j = i + 1.\
b2.2: kiểm tra sum == target.\
 - True: return mảng với 2 vị trí này.\
 - False: continue.\
b3: mặc định return mảng không có giá trị.\

***Câu 9 - Palindrome:***
**input: num;**
*b1: khởi t biến (long) reverse, mask = num, diffNumber = num; int i = 0(check có bnhieu chữ số), surplus = 0;*
*b2: kiểm tra có bnhieu chữ số dư của phép chia num % 10 với điều kiện num > 0, lặp num/10;*
*b2.1: gán surplus = num/10*
*b2.2: check surplus > 0 => i++;*
*b2.3: giảm num/10;*
*b3: revert num với mask > 0, lặp mask/10 với điều kiện mask > 0;*
*b3.1: *
  - reverse = reverse + (số dư mask % 10) * 10 ^ i;
  - giảm chữ số i--;
  - giảm mask/10
*b4: kiểm tra revert == diffNumber*
  - return True: nếu trùng
  - return False: nếu không trùng
