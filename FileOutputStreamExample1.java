import java.io.FileOutputStream;
public class FileOutputStreamExample1 {
        String s="Welcome to javaTpoint.";
            public static void main(String args[]){    
                try{    
                  FileOutputStream fout=new FileOutputStream("test2.txt");    
                  String s="Welcome to javaTpoint";    
                  byte b[]=s.getBytes();//converting string into byte array    
                  fout.write(b);    
                  fout.close();    
                  System.out.println("success...");    
                 }catch(Exception e){System.out.println(e);}    
           }
        }    
    
