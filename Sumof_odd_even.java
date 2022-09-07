public class Sumof_odd_even{
    void add()
    {
        int n=123456;
        int odd=0;
        int even=0;
        int count=1;
     {
       while(n>0)
      
      if(count%2==0)
         { 
         even=even+n%10;
         count++; 
         n=n/10;
          }
      else if(count%2!=0)
         {
         odd=odd+n%10;
         count++; 
         n=n/10;
        }
            System.out.println(odd-even);
     }
 }
 public static void main(String arg[]){
    Sumof_odd_even me=new Sumof_odd_even();
    me.add();
  }
}

   

