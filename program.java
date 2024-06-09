public class program {
  public static void main(String[] args) {
    int a[] = {9,6,8,7,2,1,5,3,2,0,0,1};
    int c=0;
    int even[]=new int[12];
   int  m=0;
    int odd[]=new int [12];
    
    // ,odd[],zero;
    // int i;
    for(int i:a)
    {
        if (i==0) {
            c++;
        }
        else if(i%2==0)
        {
            even[m]=i;
            m++;
            
            
        }
        else
        {
           odd=i;
        }
    }
    System.out.println("zero"+c);
    for(int i=1;i<=12;i++)
    {
        System.out.println("EVEN"+even);
        System.out.println("odd"+odd);        
    }
  }    
}
