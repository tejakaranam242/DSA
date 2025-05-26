class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        
class Solution:
    def sortedInsert(self, head, data):
        newnode = Node(data)
        cur = head
        if not head : 
            newnode.next = newode
            return newNode
        if head.data>=data:
            newnode.next=head
            while cur.next is not head:
                cur = cur.next
            cur.next = newnode
            head = newnode
            return head
        while cur.next is not head and cur.next.data<=data:
            cur = cur.next
        newnode.next=cur.next
        cur.next = newnode
        return head
