import java.io.FileInputStream;
public class DataStreamExample {
    public static void main(String[] args) {
        try
        {
            FileInputStream fin=new FileInputStream("test1.txt");
            int i=fin.read();
            System.out.println((char)i);
            fin.close();
        }    
        catch(Exception e)
        {
            System.out.println(e);
        }
    }   
}
