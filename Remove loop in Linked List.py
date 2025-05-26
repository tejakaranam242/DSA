class Solution:
    #Function to remove a loop in the linked list.
    def removeLoop(self, head):
        # code here
        res=set()
        cur=head
        while cur is not None:
            if cur.next in res:
                cur.next = None
                return
            res.add(cur)
            cur=cur.next
