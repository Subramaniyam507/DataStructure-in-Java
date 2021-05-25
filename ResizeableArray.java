public class ResizeableArray{
   // underlying datastructure of ArrayList
   int a[];
   int length;
     public ResizeableArray(int []a){
        this.a=a;
        this.length=a.length;
      }
   public void print(){
       for(int i=0;i<a.length;i++){
           System.out.println(a[i]);
       }
   }
   // integer capcity value you want to resize it.
  public void  resize(int capacity){
    int []temp=new int[capacity];
    for(int i=0;i<a.length;i++){
        temp[i]=a[i];
    }
    a=temp;//now the original array type ref will be point to the temproray array object that is array of required resized array
    length=capacity;
  }


    public static void main(String[] args){
        int []b={1,2,3,4,5};
        ResizeableArray d=new ResizeableArray(b);
     //passing an anonymous array
     System.out.println("before resizing "+d.length);
     d.print();

     d.resize(10);
     System.out.println("after resizing "+d.length);
     d.print();

    }
}