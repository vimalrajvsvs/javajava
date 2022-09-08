/*public class Student_verify{
    int rollno;
    int age;
    String name;
    static String sclname="AAHSS";
    static int std=12;
    int idno;
    int mark;
     void display()
        {
          System.out.println("Rollno:"+rollno+"\n"+"Age:"+age+"\n"+"Name:"+name+"\n"+"Sclname:"+sclname+"\n"+"Std:"+std+"\n"+"Id no:"+idno+"\n"+"Mark:"+mark+"\n");
         }
    Student_verify(int rollno,int age,String name,int idno,int mark)
       {
          this.rollno=rollno;
          this.age=age;
          this.name=name;
          this.idno=idno;
          this.mark=mark;
         }

public static void main(String arg[]){
    Student_verify s1=new Student_verify(1,20,"vimal",1201,518);
    s1.display();
   }
}*/
/*public class Student_verify{
    Student_verify()
      {
         System.out.println("vimalraj"+"\n"+"ohh yes default constructor is working");
      }
public static void main(String arg[]){
    Student_verify me=new Student_verify();
     }
}*/
public class Student_verify{
    int rollno;
    int age;
    String name;
    static String sclname="AAHSS";
    static int std=12;
    int idno;
    int mark;
     void display()
        {
          System.out.println("Rollno:"+rollno+"\n"+"Age:"+age+"\n"+"Name:"+name+"\n"+"Sclname:"+sclname+"\n"+"Std:"+std+"\n"+"Id no:"+idno+"\n"+"Mark:"+mark+"\n");
         }
    Student_verify(int rollno,int age,String name,int idno,int mark)
       {
          this.rollno=rollno;
          this.age=age;
          this.name=name;
          this.idno=idno;
          this.mark=mark;
         }
   Student_verify(int rollno,int age)
         {
           this.rollno=rollno;
           this.age=age;
        }
   Student_verify(String name,int idno)
         {
           this.name=name;
           this.idno=idno;
         }
public static void main(String arg[]){
    Student_verify s1=new Student_verify(1,20,"vimal",1201,518);
    s1.display();
    Student_verify s2=new Student_verify(1,22); 
    s2.display();
    Student_verify s3=new Student_verify("vijay",22); 
    s3.display();
   }
}
