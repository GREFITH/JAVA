class a
{
    
  public static void validate(int age)
    {
        try
        {
            if(age>18)
            {
                throw new Exception ("person is eligible to vote");
            }
            else
            {
                System.out.println ("person is not able to vote");
            }
        }
        catch(Exception e)
        {
            System.out.println (e);
        }
        public static void main(String []args)
        {
            a.validate(13);
        }
    }
}
class b
{
}