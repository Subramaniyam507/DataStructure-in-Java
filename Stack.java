import java.util.EmptyStackException;

public class Stack {
    Node top;
   int length;

    class Node{
      int data;
     Node next;
     
      Node(int data){
       this.data=data;
      }
       

    }
    
     public boolean isEmpty(){
         return length==0;
     }

    // to push elements 
     public void push(int data){
         Node newnode=new Node(data);
         if(isEmpty()==true){
         top=newnode;
          length++;
         }
         else{
         newnode.next=top;
         top=newnode;
         length++; 
         }
        
       
     }
  //to print elements
     public void print(){
         if(isEmpty()){
              System.out.println("stack is empty");
         }
         else{
             Node iterator=top;
             int counter=0;
             while(counter<length){
               if(counter==length-1){
                 System.out.println(iterator.data);
                 System.out.println("|");
                 System.out.println("|");
                 System.out.println("v");
                 System.out.println("null");

               }
               else{
                System.out.println(iterator.data);
                System.out.println("|");
                System.out.println("|");
                System.out.println("v");
               }
                 
                 iterator=iterator.next;
                 counter++;
             }
         }
     }
     //to pop 
     public void pop(){
         if(isEmpty()==true){
             System.out.println("stack is empty");
         }
         else{
             top=top.next;
             length--;
         }
     }
     //to view the element that is on top of the stack
     public int peek(){
         if(isEmpty()==true){
             throw new EmptyStackException();
           
         }
         else{
             return top.data;
         }
     }
     
   public static void main(String[] args){
       Stack a=new Stack();
       a.push(0);
       a.push(1);
       a.push(2);
       a.print();
       System.out.println("-----------------------------------------------------------------");
       a.pop();
       a.print();
       System.out.println("---------------------------------------------------");
       a.pop();
       a.print();
       System.out.println("---------------------------------------------------");
       a.pop();
       a.print();
       System.out.println("---------------------------------------------------");
       a.push(11);
       a.print();
       System.out.println("---------------------------------------------------");
       a.push(12);
       a.print();
       System.out.println("---------------------------------------------------");
       a.push(13);
       a.print();
       System.out.println("---------------------------------------------------");
       a.push(14);
       a.print();
       System.out.println("---------------------------------------------------");
       System.out.println("Last element added is "+a.peek());
    }

}
