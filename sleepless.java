package javaprogram;

public class sleepless extends Thread {

	public static void main(String[] args) {
         
		String s[]={"vimalraj","sathyaprabu","vijay","vengat"};
		
       try {
			
			for(int i=0;i<s.length;i++) {
				Thread.sleep(1000);
			System.out.print(s[i]+" ");
			}
		}
	     catch(Exception e) {
	    	 
	     }

	}

}
