public class Queue {
  
    Node front;
    Node rear;
    int length;

   class Node{
           int data;
           Node next;
           Node(int data){
               this.data=data;
           }
    }
    public boolean isEmpty() {
        return length==0;
    }

   //to add elements to the queue
    public void enqueue(int data){
        Node newnode=new Node(data);
        if(isEmpty()){
            front = newnode;
            rear  = newnode;
            
        }
        else{
            rear.next=newnode;
            rear=newnode;
        }
        length++;
        
    }

    //to delete the elements of the queue
    public void dequeue(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }
        else{
            front=front.next;
            length--;
        }
    }

    //to print the elements of queue
    public void print(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }
        else{
            int counter=0;
            Node iterator=front;
            while(counter<=length-1){
              
                if(counter==length-1){
                    System.out.print(iterator.data+"------->null");
                    
                }
                else{
                    System.out.print(iterator.data+"------->");
                }
                iterator=iterator.next;
                counter++;
            }
        }
    }




    public static void main(String[] args){
        Queue a= new Queue();
        a.enqueue(10);
        a.enqueue(11);
        a.enqueue(12);
        a.enqueue(13);
        a.print();
       a.dequeue();
       a.dequeue();
       a.dequeue();
       a.dequeue();
       
       System.out.println();
       a.print();

    }
}
