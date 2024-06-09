class Testsleepmethod extends Thread
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[]args)
    {
        Testsleepmethod t1=new Testsleepmethod();
        Testsleepmethod t2=new Testsleepmethod();
        t1.start();
        t2.start();

    }
}
