public class Capsul{
   private  String name;
   private int ticketno;
   private  int passportno;
   private  int flightno;
        void display()
           {
             System.out.println(getname()+" "+getticketno()+" "+getpassportno()+" "+getflightno());
           }
       Capsul(String name,int ticketno,int passportno,int flightno)
            {
                this.name=name;
                this.ticketno=ticketno;
                this.passportno=passportno;
                this.flightno=flightno;
             }
        public String getname()
             {
                return name;
              }
        public int getticketno()
             {
                return ticketno;
              }
         public int getpassportno()
             {
               return passportno;
              }
         public int getflightno()
              {
                 return flightno;
              }
         private int setticketno(int ticketno)
               {
                  this.ticketno=ticketno;
                   return ticketno;
               }
      
 public static void main(String arg[]){
       Capsul m=new Capsul("vimal",556,78,987);
      System.out.println(m.getname());  
      m.display();
      System.out.println(m.setticketno(678));
     
       }
   }
