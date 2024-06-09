class tsleep extends Thread
{
    public void run()
    {
        for(int i=1;i<5;i++)
        {
            try
            {
                Thread.sleep(100);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            finally
            {
                System.out.println(i);
                System.out.println("Thread is running.");
            }
        }
    }
}