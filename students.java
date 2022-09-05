public class students{
    static String sclname="AAHSS";
     static int std=12;
     static char sec='A';
    String name;
    int rollno;
    int age;
    int id_no;
    
    void display()
     {
         System.out.println("Sclname:"+sclname+"\n"+"Standard:"+std+"\n"+"Section:"+sec+"\n"+"Name:"+name+"\n"+"Rollno:"+rollno+"\n"+"Age:"+age+"\n"+"Id_no:"+id_no+"\n");
      }
public static void main(String arg[]){
    students s1=new students();
    s1.name="vimal";
    s1.rollno=1;
    s1.age=18;
    s1.id_no=1201;
    s1.display();
    students s2=new students();
    s2.name="surya";
    s2.rollno=2; 
    s2.age=18;
    s2.id_no=1201;
    s2.display();
    
    }
}
