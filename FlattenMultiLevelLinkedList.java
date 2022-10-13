/**
Flatten a Multilevel Linked List
Given the head of the first level of the list, flatten the list so that all the nodes appear in a single-level list.

Traverse the linked list:
Print the nodes and store the child pointer to a queue.
If node.next==null, pick the next level pointer from queue and traverse it until we get null.

*/

 public Node FlattenMultiLevelLinkedList(Node head) {
        Queue<Node> q = new ArrayDeque<>();
        Node cur = head;
        while(cur!=null) {
            if(cur.next==null) {
                cur.next = q.poll();
            }
            if(cur.child!=null) {
                q.offer(cur.child);
            }
            cur = cur.next;
        }
        return head;
}
