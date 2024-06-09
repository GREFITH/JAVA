class p25
{
  public static void main(String[]args)
  {
	  Thread t=Thread.currentThread();
	  System.out.println("Current thread"+t);
	  t.setName("My Name is:GREFITH");
	  System.out.println("Current thread"+t);
	  try
	  {
		  for(int i=0;i<10;i++)
		  {
			  System.out.println(i);
			  Thread.sleep(5);
			  System.out.println(t.isAlive());
			  System.out.println(t.getPriority());
		  }
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
  }
}