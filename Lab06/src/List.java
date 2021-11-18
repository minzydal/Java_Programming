public class List<T> {
	//data Members
	private ListNode<T> firstNode;
	private ListNode<T> lastNode;
	
//	public ListNode<T> getLastNode(List<T> node) {
//		if(this.lastNode == NULL) {
//			return this;
//		}
//		return getLastNode(this.lastNode);
//	}
	
	public List() {
		this.firstNode = null;
		this.lastNode = null;
	}
	
	//getters and setters
	public ListNode<T> getFirstNode() {
		return firstNode;
	}
	
	public void setFirstNode(ListNode<T> firstNode) {
		this.firstNode = firstNode;
	}
	
	public ListNode<T> getLastNode() {
		return lastNode;
	}
	
	public void setLastNode(ListNode<T> lastNode) {
		this.lastNode = lastNode;
	}
	
	public void insertAtFront(T item) {
		if(isEmpty()) {
			firstNode = lastNode = new ListNode<T>(item);
		}
		else {
			firstNode = new ListNode<T>(item, firstNode);
		}
	}
	
	public void insertAtBack(T item) {
		//ListNode<T> newNode = new ListNode<T>(item);
		if(isEmpty()) {
			//firstNode = lastNode = newNode;
			firstNode = lastNode = new ListNode<T>(item);
		}
		else {
			//lastNode.setNext(newNode);
			//lastNode=newNode;
			lastNode.setNext(new ListNode<T>(item));
			lastNode = lastNode.getNext();
		}
	}
	
	public T removeFromFront(){
		if(isEmpty()){
			System.err.println("The list is Empty");}
		T rItem = firstNode.getData();
		
		if(firstNode == lastNode)
			firstNode = lastNode = null;
		else
			firstNode = firstNode.getNext();
		return rItem;
	}
	
	public T removeFromBack()
	{
		if(isEmpty()){
			System.err.println("The list is Empty");}		
		
		T rItem = lastNode.getData();
		
		if(firstNode == lastNode)
			firstNode = lastNode = null;
		else {
			ListNode<T> temp = firstNode;
			while(temp.getNext() != lastNode) {
				temp = temp.getNext();
			}
			lastNode = temp;
			lastNode.setNext(null);
		}	
		return rItem;
	}
	
	
	public boolean isEmpty() {
		return firstNode == null;
	}
	
	public void print() {
		if(isEmpty()){
		System.out.println("The list is Empty");}
		ListNode<T> temp = firstNode;
		while(temp != null)
		{
			//System.out.print(temp.getData());
			System.out.print(temp.toString());
			temp = temp.getNext();
		}
		System.out.println("");
	}
	
	
	public List<T> concate(List<T> list1, List<T> list2) {
		List<T> list = list1;
		while(!list2.isEmpty()) {
			list.insertAtBack(list2.removeFromFront());
		}
		return list;
	}

	
	public void copy(List<T> list){
		ListNode<T> currentNode = list.getFirstNode();
		
		while(true) {
			this.insertAtBack(currentNode.getData());
			currentNode = currentNode.getNext();
			if(currentNode == list.getLastNode()) {
				this.insertAtBack(currentNode.getData());
				break;
			}
		}
	}
	
	
	public List<T> reverse(List<T> list){
		List<T> listRev = new List<T>();
		ListNode<T> currentNode = list.getFirstNode();
		
		while(true) {
			listRev.insertAtFront(currentNode.getData());
			currentNode = currentNode.getNext();
			if(currentNode == list.getLastNode()) {
				listRev.insertAtFront(currentNode.getData());
				break;
			}
		}
		listRev.print();
		 return listRev;
	}	
}
