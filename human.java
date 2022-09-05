interface human1{
   void eating();
   void walk();
   }
abstract class human2{
   void run()
   {
      System.out.println("run");
   }
}
class vimal extends human2 implements human1{
     public void eating()
       {
         System.out.println("eating food");
        }
    public void walk()
       {
         System.out.println("walk along");
        }
}
public class human{
public static void main(String arg[]){
   vimal me=new vimal();
   me.eating();
   me.walk();
  me.run();
   }
}
