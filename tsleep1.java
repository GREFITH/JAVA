class tsleep1 extends Thread
{
    public void run()
    {
        for(int i=1;i<5;i++)
        {
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            // finally
            // {
            //     System.out.println("Thread is running.");
            // }
            System.out.println(i);
        }
    }
    public static void main(String [] args)
    {
        tsleep1 t1=new tsleep1();
        t1.start();
    }
}