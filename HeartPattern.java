package javaprogram;

public class HeartPattern{
   public static void main(String arg[])
   {
       for(int row=1;row<=7;row++)
       {
    	   for(int col=1;col<=7;col++)
    	   {
    		   if(row+col==11||row+col==3||(col==3&&row==2)||(col==5&&row==2)||(col==4&&row==3)
    			||(row==6&&col==3)||(col==2&&row==5)||(col==1&&row==4)||(col==1&&row==3)||(col==7&&row==3)
    			||(col==7&&row==2)||(col==6&&row==1))
    		   {
    			   System.out.print(" "+"*");
    		   }
    		   else
    		   {
    			   System.out.print(" "+" ");
    		   }
    		  
    	   }
    	   System.out.println();
       }
   }
}
