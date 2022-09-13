/*public class Examplearray{
 public static void main(String arg[]){
      int sum=0;
      int a[]={5,10,15,20,25,30};
        for(int i=0;i<a.length;i++)
           {
              sum=sum+a[i];
            }
              System.out.println("sum of the given numbers: "+sum);
              
           }
}*/
/*public class Examplearray{
   public static void main(String arg[]){
      int arr[]=new int[5];
      int a=1;
      for(int i=0;i<arr.length;i++)
         {
            arr[i]=a;
            a=a+5;
          }
            System.out.println(a);
       }
}*/
       
/*public class Examplearray{
   public static void main(String arg[]){
       int arr[]={1,2,3,4,5,6};
        System.out.println("Even number");
        for(int i=0;i<arr.length;i++)
          
            { 
             if(arr[i]%2==0)
                {
                
                System.out.println(arr[i]);
                 }
           }
          System.out.println("Odd number");
         for(int i=0;i<arr.length;i++)
          {
          if(arr[i]%2!=0)
           {
             System.out.println(arr[i]);
           }
       }
    }
}*/
public class Examplearray{
   public static void main(String arg[]){
      int odd=0;
      int even=0;
      int arr[]={1,2,3,4,5,6};
      for(int i=0;i<arr.length;i++)
         if(arr[i]%2==0)
           {
              even=even+arr[i];
            }
         else if(arr[i]%2!=0)
            {
              odd=odd+arr[i];
             }
         System.out.println("The even number is:"+even);
         System.out.println("The odd number is:"+odd);
         System.out.println("Differenc of odd and even:"+(even-odd)); 
     }
       
 }
/*public class Examplearray{
  public static void main(String arg[]){
      int  arr[]={5,7,9,7,5,3};
        int sum=0;
        double avg=0;
     for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            avg=sum/arr.length;
         }
          System.out.println(sum);
          System.out.println(avg);
      }
}*/
/*public class Examplearray{
   public static void main(String arg[]){
      int arr[]=new int[5];
      System.out.println("The index of the length:"+arr.length);
   }
}*/
          
