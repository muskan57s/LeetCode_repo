/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int sum = carry;

            if(l1 != null){      //first list
                sum += l1.val;         //the value will be in sum
                l1 = l1.next;      // proceede to next
            }
            if(l2 != null){       //second list
                sum += l2.val;      //add first to the 2nd 
                l2 = l2.next;
            }

            carry = sum/ 10;       //it will store the carry
            int digit = sum % 10;    // it will store the remaining

            curr.next = new ListNode(digit);
            curr = curr.next;

        }
        return dummy.next;
    }    
}   