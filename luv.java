package javaprogram;


public class luv{
 public static void main(String arg[]){
      char arr[]={'H','K','N','U','D','X','N','T'};
        for(int i=0;i<arr.length;i++)
          {
             int a=arr[i];
                 a=a+1;
              char c=(char) a;
                 arr[i]=c;
              if(a>90)
                {
                  a=a-26;
                  char d=(char)a;
                  arr[i]=d;
                }
             System.out.print(arr[i]+" ");
          }
    }
}