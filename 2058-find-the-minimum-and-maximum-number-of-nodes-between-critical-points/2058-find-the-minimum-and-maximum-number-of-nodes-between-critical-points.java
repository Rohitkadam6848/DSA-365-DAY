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
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode curr=head;

        while(curr!=null){
            arr.add(curr.val);
            curr=curr.next;
        }

        //find cirtical points
        ArrayList<Integer> points=new ArrayList<>();
        for(int i=1;i<arr.size()-1;i++){
            if(arr.get(i)>arr.get(i-1) && arr.get(i)>arr.get(i+1)){
                points.add(i);
            }else if(arr.get(i)<arr.get(i-1) && arr.get(i)<arr.get(i+1)){
                points.add(i);
            }
        }

        int n=points.size();

        if(n<2){
            return new int[]{-1,-1};
        }

        int minDist=Integer.MAX_VALUE;
        int maxDist=points.get(n-1)-points.get(0);

        for(int i=1;i<n;i++){
            minDist=Math.min(minDist,points.get(i)-points.get(i-1));
        }

        return new int[]{minDist,maxDist};


    }
}