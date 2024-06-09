class multi implements Runnable
{
    public void run()
    {
        System.out.println("threadsfdf is running");
    }
    public static void main(String[] args)
    {
        // multi t1=new multi();
        multi t2=new multi();
        Thread t1=new Thread(t2,"thread is running") ;
        // t1.sleep(100);
        t1.start();
        // T.sleep(100);
        String str =t1.getName();
        System.out.println(str);
        // multi t1=new multi();
        // // multi t2=new multi();
        // Thread t2=new Thread(t1);
        // // Thread t2=new Thread(t2);
        // t2 .start();
        // t2.start();
    
}
}