public class Sorting{
    public void add(){
      int a[]={7,5,1,4,6,3,8,16};
      for(int i=0;i<a.length;i++)
        {
          for(int j=i+1;j<a.length;j++)
            {
              if(a[i]>a[j])
                 {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                  }
               }
         }
          for(int i=0;i<a.length;i++)
            {
             System.out.println(a[i]);
            }   
}
public static void main(String arg[]){
      Sorting obj=new Sorting();
      obj.add();
    }
}
