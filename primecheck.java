public class primecheck{
       void add()
             {    int count=0;
                  int i=1;
                  int n=9;
                  for(i=1;i<=n;i++)
                  {
                     if(n%i ==0)
                       { 
                        
                          count++;
                        
                        }
                         
                     }
                          if(count==2)
                          {
                               System.out.println("It is prime number");
                           }
                          else
                                {
                                  System.out.println("It is not prime number");
                                 }
                 }
public static void main(String arg[]){
         primecheck obj=new primecheck();
          obj.add();
      }
}
