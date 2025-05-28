class Solution {
    public Node sortedInsert(Node head, int x) {
        // add your code here
        Node newnode = new Node(x);
        if(head.data>x){
            newnode.next=head;
            head.prev=newnode;
            head = newnode;
            return head;
        }
        Node cur=head;
        while(cur.next!=null&&cur.next.data<=x){
            cur=cur.next;
        }
        newnode.next = cur.next;
        if (cur.next != null) {
            cur.next.prev = newnode;
        }
        cur.next = newnode;
        newnode.prev = cur;
        return head;
    }
}
