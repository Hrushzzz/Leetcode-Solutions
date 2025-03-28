// Problem Link ::: https://leetcode.com/problems/copy-list-with-random-pointer/

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Node temp = head;
        //Creating Nodes
        while (temp != null) {    
            Node nn = new Node(temp.val);
            nn.next = temp.next;
            temp.next = nn;
            temp = nn.next;
        }
        //Copying Random links
        temp = head;
        while (temp != null) {
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }
        //Copying next links and returning cloneHead
        Node t1 = head;
        Node t2 = head.next;
        Node cloneHead = t2;
        while (t1 != null) {
            t1.next = t2.next;
            t1 = t1.next;
            if (t1 != null) {
                t2.next = t1.next;   
            }
            t2 = t2.next;
        }     
        return cloneHead;
    }
}

// TC : O(N) , SC : O(1)
