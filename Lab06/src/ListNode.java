
public class ListNode<T> {
	//data members
	private T data;
	private ListNode<T> nextNode;
	
	/*
	 * T data;
	 * ListNode<T>* nextNode;
	 * 
	 */
	
	//function members
	ListNode(T d, ListNode<T> n){
		data = d; 
		nextNode = n;
	}
	
	ListNode(T d){
		this(d, null);
		/*
		 * data = d;
		 * nextNode = null
		 */
	}
	ListNode(){
		nextNode = null;
	}
	
	public void setData(T d) {
		data = d;
	}
	
	public void setNext(ListNode<T> n) {
		nextNode = n;
	}
	
	public T getData() {
		return data;
	}
	
	public ListNode<T> getNext(){
		return nextNode;
	}
	
	@Override
	public String toString() {
		return "(" + data + ")";
	}
	

}
