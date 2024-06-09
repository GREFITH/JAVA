import java.io.FileOutputStream;

public class FileOutputStreamExample3 {
    public static void main(String[] args) {
        
        try
        {
            FileOutputStream fout=new FileOutputStream("test3.txt");
            fout.write(71);
            fout.write(82);
            fout.write(69);
            fout.write(70);
            fout.write(73);
            fout.write(84);
            fout.write(72);
            
            fout.close();
            System.out.println("Success...");
        }
        catch(Exception e)
        {
            System.out.println(e);
    }
}
}
