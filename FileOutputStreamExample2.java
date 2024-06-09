import java.io.FileOutputStream;

public class FileOutputStreamExample2 {
    public static void main(String args[]){    
	           try{    
	             FileOutputStream fout=new FileOutputStream("test1.html");    
	             String h="<h1> hello </h1>";    
	             byte b[]=h.getBytes();//converting string into byte array    
	             fout.write(b);    
	             fout.close();    
	             System.out.println("success...");    
	            }catch(Exception e){System.out.println(e);}    
	      }    
}  
