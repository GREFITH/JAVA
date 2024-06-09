class checking {
    public static void main(String[] args) {
        int a[] = { 1, 2, 9, 6, 8, 2, 3, 1, 5, 6, 8 };
        int i, count = 0;
        int j,flag,max=0;
        int c=0;int g,m;
        int mi;
        int maxval[]=new int[a.length];
        int rep[]=new int [a.length];   
        int maxcount[]=new int[a.length];                                                                
        // for(i:a)
        for (i = 0; i < a.length; i++)
         {
             count = 1;
             flag=0;
            for (j = i + 1; j < a.length; j++)
            // for(j:i+1)
            {
                if (a[i] == a[j]) {
                    count++;
                }
                
            }
            rep[c]=a[i];
            for(m=0;m<c;m++)
            {
                if(a[i]==rep[m])
                {
                    flag=1;
                    break;
                }
                
            }
            if(flag==0)
            {
                if(max<count)
                {
                    max=count;
                }
                maxval[mi]=a[i];
                maxcount[mi]=count;
                mi++;
                System.out.println(a[i] + "->" + count);
            }
            c++;          
        }
        System.out.println("MAX no repeated:");
        for(g=0;g<mi;g++)
        {
            if(max==maxcount[g])
            {
                System.out.println(maxval[g]+"->"+max);
            }
        }
    
    }

}
