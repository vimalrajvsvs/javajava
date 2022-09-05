/*abstract class A{
   
     void add(){
           int a=5;
           int b=6;
           int c=a+b;
                {
                    System.out.println(c);
                 }  
 }
     abstract void sub();
     abstract void multi(int a,int b);
   
}
class B extends A{
     void sub(){
         int a=8;
         int b=3;
         int c=a-b;
         {
            System.out.println(c);
         }
}
      void multi(int a,int b){
              int c=a*b;
          {
            System.out.println(c);
          }
      }
    
}
public class exampleabstract{
public static void main(String arg[]){
     A me=new B();
     me.add();
     me.sub();
     me.multi(7,8);
  }
}*/
/*abstract class Animal{
     abstract void eat();
  }
class Dog extends Animal{
    void eat()
     {
           System.out.println("The dog is eating");
      }
  
}
class Cat extends Animal{
    void eat()
      {
           System.out.println("The cat is eating");
       }
}
public class exampleabstract{
public static void main(String arg[]){
      Animal d=new Dog();
      d.eat();
      Animal c=new Cat();
      c.eat();
  }
} */
abstract class human{
       abstract void swimming();
       abstract void driving();
       void eating()
         {
            System.out.println("Eating non-veg");
         }
}
abstract class vengat extends human{

}
class vimal extends human{
       void swimming()
      {
         System.out.println("swimming");
      }
       void driving()
       {
         System.out.println("drive the car");
       }
}
public class exampleabstract{
public static void main(String arg[]){
    human me=new vimal();
    me.swimming();
    me.driving();
    me.eating();
   }
}
