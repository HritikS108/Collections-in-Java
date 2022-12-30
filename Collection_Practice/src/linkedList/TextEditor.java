package linkedList;

class Node{
    char a;
    Node prev;
    Node next;
	
    Node(char a){
        this.a=a;
    }
    
    Node(){}
}

public class TextEditor {
 
	Node head;
	Node curr;
	Node dummy;

	String getString(Node temp){
	    int min=10;
	    String a="";
	    while(min>0&&temp!=dummy){
	        a=a+temp.a;
	        temp=temp.prev;
	        min--;
	    }
	    
	    StringBuilder b=new StringBuilder(a);
	    return b.reverse().toString();
	}

	public TextEditor() {
	    
	    dummy=new Node();     
	    curr=dummy;
	    head=dummy;
	    
	}

	public void addText(String text) {
	    
	    if(curr.next!=null){
	          Node temp=curr.next;
	        for(char i:text.toCharArray()){
	      
	        Node nNode=new Node(i);
	            curr.next=nNode;
	            nNode.prev=curr;
	            nNode.next=temp;
	            temp.prev=nNode;
	            curr=curr.next;
	        }
	       
	    }
	    else{
	      for(char i: text.toCharArray()){
	      Node newNode=new Node(i);
	      curr.next=newNode;
	      newNode.prev=curr;
	      curr=curr.next;
	      }
	    
	    
	    
	}
	    head=dummy.next;
	    head.prev=dummy;
	}
	public int deleteText(int k) {
	    int last=0;
	    Node temp=curr.next;
	    while(k>0&&curr!=dummy){
	        curr=curr.prev;
	        last++;
	        k--;
	        
	    }
	   
	    curr.next=temp;
	    if(temp!=null){temp.prev=curr;}
	    return last;
	}

	public String cursorLeft(int k) {
	    
	    while(k>0&&curr!=dummy){
	        curr=curr.prev;
	        k--;
	    }
	    if(curr==dummy){return "";}
	    return getString(curr);

	}

	public String cursorRight(int k) {

	    Node prev=null;
	    while(curr!=null&&k>0){
	       
	        prev=curr;
	        curr=curr.next;
	         k--;
	    }
	    if(curr==null){curr=prev;}
	    return getString(curr);
	}
}

//Q.
//Implement the TextEditor class:
//
//TextEditor() Initializes the object with empty text.
//void addText(string text) Appends text to where the cursor is. The cursor ends to the right of text.
//int deleteText(int k) Deletes k characters to the left of the cursor. Returns the number of characters actually deleted.
//string cursorLeft(int k) Moves the cursor to the left k times. Returns the last min(10, len) characters to the left of the cursor, where len is the number of characters to the left of the cursor.
//string cursorRight(int k) Moves the cursor to the right k times. Returns the last min(10, len) characters to the left of the cursor, where len is the number of characters to the left of the cursor.
