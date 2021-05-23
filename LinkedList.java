public class LinkedList {
    Node head;// points to series of nodes
    int length;// length of linkedList
  
    //inner node class 
    class Node{
        int data;    //data to be inserted
        Node next;    //may point at null or next node
        Node(int data){
            this.data=data;
            this.next=null;
                }
    }
   
   
// to insert element in to the LinkedList
    public void push(int data){
       Node newnode=new Node(data);  //creation of new node with instance variable data=entered int data and next=null
       length++;
      if(head==null){
          head=newnode;
          
      }
      else{
          Node iterator=head;
          while(iterator.next!=null){
              iterator=iterator.next; //to go to the nextnode
            
          }
          iterator.next=newnode; //making the last node to point at the new node
          
      }
     
    }
   // to print the elements of the LinkedList
    public void print(){
        Node iterator=null;
        if(head==null){                               //if linkedList is empty
            System.out.println("no elements");
        }
        else{                                     //not empty
            iterator=head;
            
            while(iterator!=null){
                System.out.print(iterator.data+"------>");
                iterator=iterator.next;
               

            }
            System.out.print("null");
        }
    }


//inserting node at a particular index
//this method helps you to insert any node at any position
// if list length is 5
// the indices are 0--1--2---3---4
//if you want to insert at at index 5 or append it is still possible
//resultant would be 0--1---2----3----4----5



  public void insertAtindex(int data,int index){
        int indexcount=0;//to keep track of the index
        
        if(index>length){                                           //checking if the enetered index is more than  the length of linkedList
            System.out.println("index out of bound exception");
        }



       if(index<=length){                      // checking if the enetered index is less than or equal the length of linkedList
        
        Node newNode=new Node(data); 
        length++;
        if(head==null){                      // if list is empty 
            
             head=newNode;
           }
           else if(index==0){      //if you want to insert any node at the beginning of the linkedList
               Node temp=head;
               head=newNode;
               newNode.next=temp;
           }
           else{
              
               Node iterator=head;      // if you want insert a node anywhere except the beginning of the node (even after the last node i.e append)
              Node previous=null;
              Node current=null;
               while(indexcount<index-1){
                   
                   iterator=iterator.next;  
                   indexcount++;
               }
               previous=iterator;
               current=iterator.next;
               previous.next=newNode;
               newNode.next=current;
            }
           
       }


  }

  // to delete any element
public void delete(int index){
    int indexcounter=0;
    Node iterator=head;
    Node previous=null;
    Node  skip=null;
    if(head==null){
        System.out.println("no elements to delete");
    }
    if(index>=length){
        System.out.println("index out of bound");
    }
    else{
        length--;
    while(indexcounter!=index){
        previous=iterator;
        indexcounter++;
      iterator=iterator.next;
      skip=iterator.next;
    }
    if(previous==null){
        head=head.next;
    }
    else{
  previous.next=skip;
    }
    }

}


public static void main(String[] args){
    LinkedList l=new LinkedList();
    l.push(10);
    l.push(11);
    l.push(12);
    l.push(13);
   

    l.insertAtindex(9, 0);
    l.print();
    System.out.println();
    l.delete(0);
    l.print();
}






}
