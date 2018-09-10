import java.io.*;
class Read
{ 
  public static void main(String[] args)throws Exception 
  { 
  
  File abc = new File("C:\\JAVA1\\day 9 assign\\abc.txt"); 
  
  BufferedReader br = new BufferedReader(new FileReader(abc)); 
  
  String st; 
  while ((st = br.readLine()) != null) 
    System.out.println(st); 
  } 
} 