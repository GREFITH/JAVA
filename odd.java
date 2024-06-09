public class odd {
    public static void main(String[] args) {
    int a=51; int b=100,i;
    int j;
    for(i=a;i<=b;i++)
    if (i%3==0) {
        if (i%2==0) {
            System.out.println(i);
            for(j=1;j<=10;j++)
            {
            System.out.println(i+"*"+j+"="+(i*j));
            
            }
        }
    }    
    else if(i%5==0)
    {
        if (i%2==0) {
            System.out.println(i);
           for(j=1;j<=10;j++) 
           {
            System.out.println(i+"*"+j+"="+(i*j));
            
            }
        }
    }     
    else
    {
        if (i%3==0 && i%5==0) {
            if (i%2==0) {
                System.out.println(i);
               for(j=1;j<=10;j++) 
               {
                System.out.println(i+"*"+j+"="+(i*j));
            break;
        }
    }
    }
}
    }
}