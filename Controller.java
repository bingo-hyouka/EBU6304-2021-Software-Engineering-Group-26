package Test1;
import java.io.*;
public class Controller {
	static String ID="001";
	static String name="lsy";
	String[] sp;
	 public Boolean getAccount() {
		  File file=new File("C:\\Users\\13942\\Desktop\\123.txt");
		  BufferedReader reader = null;
		  StringBuffer sbf = new StringBuffer();
		  try {
		        reader = new BufferedReader(new FileReader(file));
		        String tempStr;
		        while ((tempStr = reader.readLine()) != null) {
		            sbf.append(tempStr);
		        }
		        reader.close();
		        
		    } catch (IOException e) {
		        e.printStackTrace();
		    } finally {
		        if (reader != null) {
		            try {
		                reader.close();
		            } catch (IOException e1) {
		                e1.printStackTrace();
		            }
		        }
		    }
		  sp=sbf.toString().split("[: ;]");
				  		  
		  for(int i=0;i<sp.length;i++) {
			  
			    	if(sp[i].equals("lsy")&&sp[i+2]=="123456")
			    return true;
			  
		  }
		  
		  
		    return false;
   }
	 
public static void main(String[] args) { 
	
  User a=new User(ID,1,name);
  Controller b=new Controller();
  if(b.getAccount()==true) {
  if(a.getType()==1) { 
	  System.out.println("admin");
  }
  else if(a.getType()==2) {
	  System.out.println("coach");
  }
  else if(a.getType()==3) {
	  System.out.println("user");
  }
  a.getName();
}
  else
	  System.out.println("The information is not matched.");
}
}
