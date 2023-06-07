public class JosiahLinkedList<E> {
	private ListNode front;
	
	public void addFront(E item) {
		front = new ListNode(item, front);
	}
	
	// Add new ListNode at given index
	public void add(int index, E item) {
	    if (index < 0) {
	        System.out.println("Invalid index. Index cannot be negative.");
	        return;
	    }

	    ListNode newNode = new ListNode(item, null);

	    if (index == 0) {
	        newNode.next = front;
	        front = newNode;
	        return;
	    }

	    ListNode current = front;
	    int currentIndex = 0;

	    while (current != null && currentIndex < index - 1) {
	        current = current.next;
	        currentIndex++;
	    }

	    if (current == null) {
	        System.out.println("Invalid index. Index exceeds the LinkedList size.");
	        return;
	    }

	    newNode.next = current.next;
	    current.next = newNode;
	}

	
	public void removeFront() {
		if (front==null)
			return;
		
		ListNode toRem = front;
		front = front.next;
		toRem.next = null;
	}
	
	// Remove first occurrence of element
	public void remove(E item) {
        if (front == null) {
            System.out.println("LinkedList is empty.");
            return;
        }

        if (front.data == item) {
            front = front.next;
            return;
        }

        ListNode current = front;
        while (current.next != null) {
            if (current.next.data == item) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }

        return;
    }
	
	// Remove element at given index
	public void remove(int index) {
        if (index < 0) {
            System.out.println("Invalid index. Index cannot be negative.");
            return;
        }

        if (index == 0) {
            if (front == null) {
                System.out.println("Invalid index. LinkedList is empty.");
                return;
            }
            front = front.next;
            return;
        }

        ListNode current = front;
        int currentIndex = 0;

        while (current != null && currentIndex < index - 1) {
            current = current.next;
            currentIndex++;
        }

        if (current == null || current.next == null) {
            System.out.println("Invalid index. Index exceeds the LinkedList size.");
            return;
        }

        current.next = current.next.next;
    }
	
	// Find first index of element
	public int indexOf(E item) {
		ListNode cur = front;
		int i = 0;
		
		while (cur != null) {
			if (cur.data == item) 
				return i;
			
			i++;
			cur = cur.next;
		}
		
		return -1;
	}
	
	// Get ListNode value at index
	public E get (int index) {
		ListNode cur = front;
		int i = 0;
		
		while (cur != null) {
			if (i == index) 
				return cur.data;
			
			i++;
			cur = cur.next;
		}
		
		throw new IndexOutOfBoundsException("Index doesn't exist");
	}
	
	// Set ListNode value at index
	public E set (int index, E item) {
		ListNode cur = front;
		int i = 0;
		E data = null;
		
		while (cur != null) {
			// Replace ListNode data at index
			if (i == index) {
				data = cur.data;
				cur.data = item;
			}
			
			i++;
			cur = cur.next;
		}
		
		return data;
	}
	
	public String toString() {
		ListNode cur = front;
		String toReturn = "";
		
		while (cur != null) {
			toReturn += cur.data + "\n";
			cur = cur.next;
		}
		
		return toReturn;
	}
	
	// Checks if Linked list is empty
	public boolean isEmpty() {
		return front == null;
	}
	
	// Get size of linked list
	public int size() {
		int counter = 0;
		ListNode cur = front;
		
		while (cur != null) {
			counter++;
			cur = cur.next;
		}
		
		return counter;
	}
	
	public class ListNode {
		private E data;
		private ListNode next;
		
		public ListNode(E d, ListNode n) {
			data = d;
			next = n;
		}
	}
}
