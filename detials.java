
public class detials {
	 String hostelname;
	 String area;
	 int rent;
     float GST;
	 char section;
	 int roomnumber;
	void info()
     {
    	
    	System.out.println("Hostelname:"+hostelname+"\n"+"Area:"+area+"\n"+"Rent:"+rent+"\n"+"GST:"+GST+"\n"+"section:"+section+"\n"+"Roomnumber:"+roomnumber+"\n");    	 
     }
	public static void main(String[] args) {
		detials obj1=new detials();
		detials obj=new detials();
		obj1.hostelname="padmavathi";
		obj1.area="north street";
		obj1.rent=5000;
        obj1.GST=50.5F;
		obj1.section='A';
		obj1.roomnumber=10;
		obj1.info();
		obj.hostelname="narayana";
		obj.area="south street";
		obj.rent=5000;
        obj.GST=50.5F;
		obj.section='B';
		obj.roomnumber=45;
		obj.info();
	}

}

