public class DoublyLinkedList {
    Node head;// points first node
    Node tail;// points last node
    int length;
    class Node{
        Node prev;
        Node next;
        int data;
        Node(int data){
           this.data = data;
        }
    }

     public boolean isEmpty(){
         return length==0;
     }
// to add node to the doublyLinkedList 
    public void add(int data){

    Node newnode=new Node(data);
      
         if(isEmpty()==true){
             head=newnode;
             tail=newnode;
         }
         else{
             Node iterator=head;
             while(iterator.next!=null){
                iterator=iterator.next;
             }
             iterator.next=newnode;
             tail=newnode;
             newnode.prev=iterator;
         }
         length++;
    }
// to print nodes of double linkedList

    public void print(){
    
    if(isEmpty()==true){
        System.out.println("no elements");
    }
    else{
          Node iterator=head;
          int counter=0;
          while(iterator!=null){
            if(counter==0){
            System.out.print("null<-----"+iterator.data);
            }
            else if(counter==length-1){
                System.out.print("<-_-_-_->"+iterator.data+"-------->null");
            }
            else{
                System.out.print("<-_-_-_->"+iterator.data);
            }
               iterator=iterator.next;
               counter++;
          }
    }


    }

    //to delete a node in a particular index
    public void delete(int index){
        
        if(isEmpty()==true){
            System.out.println("no elements");
        }
        else if(index>length){
            System.out.println("out of bound");
        }
        else{
           
                int counter=0;
                Node iterator=head;
                while(counter!=index){
                     counter++;
                     iterator=iterator.next;
                
                     
                }
                
                Node previous=iterator.prev;
                Node next=iterator.next;

                if(previous==null){
                     head=head.next;
            
                    length--;
                }
                else{
                    if(next==null){
                previous.next=next;
                    }
                    else{
                        previous.next=next;
                        next.prev=previous;  
                    }

              
                length--;
                }
            }

        }
// insert  node at index
        public void insertAtindex(int data ,int index){
            Node newnode=new Node(data);
            int indexcounter=0;
            if(isEmpty()==true){   //if doublelinkdelIst is empty
              head=newnode;
              tail=newnode;
              length++;
            }
             else{                                    
                 if(index<length-1){
                 Node iterator=head;
                 while(indexcounter!=index){
                             iterator=iterator.next;
                             indexcounter++;
                 }
                 Node previous=iterator.prev;
                
                  if(previous==null){                   //to insert at beginning of the list
                       newnode.next=iterator;
                       iterator.prev=newnode;
                       head=newnode;
                       length++;
                  }
              
                 else{                               // any where inbetween the list
                 previous.next=newnode;
                 newnode.prev=previous;
                newnode.next=iterator;
                 length++;
                 }
             }
             else{
       
                
                if(index==length){                        //to insert just before the last node
                    System.out.println("hi");
                Node previous=tail.prev;
                newnode.prev=previous;
                previous.next=newnode;
                newnode.next=tail;
                tail.prev=newnode;
                length++;
                }
                if(index>length-1){                              //to insert after the lastnode
                    System.out.println("Hi");
                newnode.prev=tail;
                tail.next=newnode;
                tail=newnode;
                length++;
                }

             }
            }
            
        }
    


    public static void main(String[]args){
            DoublyLinkedList a=new DoublyLinkedList();
            a.add(11);
            a.add(12);
            a.add(13);
            a.add(15);
            a.print();
           a.insertAtindex(2,5);
           System.out.println();
           
            a.print();
    }

}
