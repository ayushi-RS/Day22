class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null || k==0 ) return head;
        
        ListNode temp = head;
        int l = 0;
        // find length of the linked list
        while(temp !=null){
            l++;
            temp = temp.next;
        } 
        k = k%l; 
        if(k==0) return head;
        
        temp = head;
        int h = l-k;
        while(h > 1 ){
            temp = temp.next;
            h--;
        }
        ListNode newHead = temp.next;
        temp.next = null; 
        temp  = newHead;
        while(temp.next !=null){
            temp = temp.next;
        }
        temp.next = head;
         
        return newHead;
    }
}