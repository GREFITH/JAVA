import java.util.*;
class uf
{
    public static void main(String[] args)
    {
        Scanner S=new Scanner(System.in);
        System.out.print("Enter row:");
        int r=S.nextInt();
        System.out.print("Enter column:");
        int c=S.nextInt();
        int k=0;
        int ki=0;
        int a[][]=new int[r][c];
        int count=0;
        int even[]=new int[r*c];
        int odd[]=new int[r*c];
        // int i,j;
    
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print("Enter value:");
                a[i][j]=S.nextInt();   
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if (a[i][j]==0) {
                    count++;
                }
                else if (a[i][j]%2==0 ) {
                    even[k]=a[i][j];
                    k++;
                }
                else
                    {
                    odd[k]=a[i][j];
                    ki++;
                    }
    }  
}
System.out.println("ZERO:"+count);
System.out.println("EVEN:");
for(int i:even)
{
    if (i!=0) {
        
        System.out.println(i);
    }

}
    

System.out.println("ODD:");
for(int i:odd)
{
    if (i!=0) {
        
        System.out.println(i);
    }
    
}
}
}