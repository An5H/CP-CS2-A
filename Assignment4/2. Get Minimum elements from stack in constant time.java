import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) {
		MinStack st = new MinStack();
		st.push(1);
		st.push(2);
		st.push(3);
		System.out.println(st.size());
		System.out.println("Get minimum = "+st.getMin());
		System.out.println(st.pop());
		st.push(-20);
		st.push(5);
		System.out.println(st.size());
		System.out.println("Get minimum = "+st.getMin());
	}
}
class MinStack {
    private Node head;
    int size = 0;
    class Node{
        int val;
        int min;
        Node next;
        Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
    
    public void push(int x) {
        if(head == null) 
            head = new Node(x, x, null);
        else 
            head = new Node(x, Math.min(x, head.min), head);
        this.size++;
    }

    public int pop() {
        int val = head.val;
        head = head.next;
        this.size--;
        return val;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }
    public int size() {
        return this.size;
    }
}
