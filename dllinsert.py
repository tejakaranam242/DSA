class Solution:
    #Function to insert a node in a sorted doubly linked list.
    def sortedInsert(self, head, x):
        newnode = Node(x)
        if head.data > x:
            newnode.next = head
            head.prev = newnode
            head = newnode
            return head
    
        cur = head
        while cur.next is not None and cur.next.data <= x:
            cur = cur.next
    
        newnode.next = cur.next
        if cur.next is not None:
            cur.next.prev = newnode
        cur.next = newnode
        newnode.prev = cur
        return head
