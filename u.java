import java.util.*;
class u
{
    public static void main(String[] args)
    {
        Scanner S=new Scanner(System.in);
        System.out.print("Enter row:");
        int r=S.nextInt();
        System.out.print("Enter column:");
        int c=S.nextInt();
        int a[][]=new int[r][c];
        int count=0;
        int m=0,n=0;
        int f=0,g=0;
        // int s=0,d=0;
        //         int k[][]=new int[s][d];
        int even[][]=new int[r][c];
        int odd[][]=new int[r][c];
        int i,j;
    
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print("Enter value:");
                a[i][j]=S.nextInt();   
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if (a[i][j]==0) {
                    count++;
                }
                else if (a[i][j]%2==0 ) {
                    even[m][n]=a[i][j];
                    m++;
                    n++;
                    // System.out.println("EVEN:"+even);

                    // even[m][n]=k[s][d];
                    // m++;n++;
                }
                else
                    {
                    odd[f][g]=a[i][j];
                    f++;
                    g++;
                    }
                
        //          if (a[i][j]%2==0) {
        //             even[m][n]=a[i][j];
        //             m++;n++;
        //         }
        //         // else
        //         // {
        //         //     odd[f][g]=a[i][j];
        //         //     f++;g++;
        //         // }
        //         // if(a[i][j]%2==0)
        //         // {
        //         // System.out.print(a[i][j]+" ");
        //         // }
        //     }
        //     System.out.println();
        //     System.out.println("EVEN:"+even);
        //     // System.out.println("odd:"+odd);
        // }
    }  
}
System.out.println("ZERO:"+count);
System.out.println("EVEN:");
for(i=0;i<m;i++)
{
    for(j=0;j<n;j++)
    {

        System.out.println(even[i][j]);
    }
}
System.out.println("ODD:");
for(i=0;i<f;i++)
{
    for(j=0;j<g;j++)
    {
        System.out.println(odd[i][j]);
    }
}
}
}