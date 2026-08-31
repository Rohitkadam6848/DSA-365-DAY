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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode curr=head.next;
        ListNode prev=head;

        int firstIdx=-1;
        int lastIdx=-1;
        int minDist=Integer.MAX_VALUE;
        int idx=1;

        while(curr.next!=null){
            ListNode next=curr.next;

            boolean isMax=curr.val>prev.val && curr.val>next.val;
            boolean isMin=curr.val<prev.val && curr.val<next.val;

            if(isMax || isMin){
                if(lastIdx==-1){
                    firstIdx=idx;
                }else{
                    minDist=Math.min(minDist,idx-lastIdx);
                }
                lastIdx=idx;
            }

            prev=curr;
            curr=next;
            idx++;
        }

        if(firstIdx==-1 || firstIdx==lastIdx){
            return new int[]{-1,-1};
        }

        int maxDist=lastIdx-firstIdx;

        return new int[]{minDist,maxDist};
    }
}