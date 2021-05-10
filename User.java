package Test1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class User 
{
    private int type = 0;//标注了用户类型，admin,1;customer,2;coach,3
    private String ID = "";//用户id
    private String name="";
    public User(String ID,int type,String name)
    {
        setID(ID);
        setType(type);
        setName(name);
    }

	public String getID() { return ID; }
    public int getType() {
        return type;
    }
    public String getName() {return name;}
    public void setID(String iD) {
        ID = iD;
    }
    public void setName(String name) {
    	this.name=name;
    }
    public void setType(int type) {
        this.type = type;
    }
  
}
