class Solution {
    public Node sortedInsert(Node head, int data) {
        // code here
        Node newnode = new Node(data);
        Node cur = head;
        if(head.data>=data){
            newnode.next = head;
            while(cur.next!=head){
                cur = cur.next;
            }
            cur.next = newnode;
            head = newnode;
            return head;
        }
        while(cur.next!= head&& cur.next.data<=data){
            cur = cur.next;
        }
        newnode.next=cur.next;
        cur.next=newnode;
        return head;
    }
}
