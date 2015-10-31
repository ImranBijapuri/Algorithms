/*
Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Remove_Linked_List_Elements {
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val){
            head = head.next;
        }
        
        ListNode current = head;
        while(current != null && current.next != null){
            if(current.next.val != val) current = current.next;
            else if(current.next == null) current = current.next;
            else{
                current.next = current.next.next;
            }
        }
        return head;
    }
}
