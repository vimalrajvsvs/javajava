/*class Father{
     int balance=5000;
     void print()
       {
          System.out.println("House");
       }
}
 class child extends Father{
      int balance=6000;
      void  print()
       {
          super.print();
          System.out.println(balance+super.balance);
       }
 }
public class This_super{
public static void main(String arg[]){
   child c=new child();
   c.print();
   }
}*/
class Human{
    int bal=5000;
     int creadit(int actno,int amt)
        {
            int bal=5000;
            bal=bal+this.bal+amt;
            return bal;
         }
}
class hari extends  Human{}
class vimal extends Human{}
public class This_super{
public static void main(String arg[]){
   hari c=new hari();
     System.out.println (c.creadit(122,5000));
   vimal v=new vimal();
     System.out.println(v.creadit(356,6000));
   }
}
 

