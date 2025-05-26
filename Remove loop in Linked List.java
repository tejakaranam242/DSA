class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        // code here
        Node cur=head;
        Set<Node> res = new HashSet<Node>();
        while(cur!=null){
            if(res.contains(cur.next)){
                cur.next=null;
            }
            res.add(cur);
            cur = cur.next;
        }
    }
}
