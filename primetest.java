 class primetest {
    public static void main(String[] args) {
        int j,k,i,r;
        for(j=1;j<=100;j++)
        {
            for(k=1;k<=10;k++)
            {
                if(j%k==0)
                {
                    System.out.println("j");
                }
            }
            System.out.println();    
        }
        for(i=2;i<=j;i++)
        {
            for(r=1;r<=10;r++)
            {
                System.out.println(i+" * "+r+" = "+(i*r));
            }
            System.out.println();
        }
}
