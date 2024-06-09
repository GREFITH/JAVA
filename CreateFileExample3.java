import java.io.File;
import java.io.IOException;
public class CreateFileExample3
{
    public static void main(String[] args) {
        File file=new File("test2.txt");
        boolean result;
        try
        {
            result = file.createNewFile();
            if (result) {
                System.out.println("file created"+file.getCanonicalPath());
            }
            else
            {
                System.out.println("File already exist at location:"+file.getCanonicalPath());
            }
        }
        catch(IOException e)
        {

        }
    }
}