/*
 * Karl Ong
 * 991446377
 * SYST10199 - Web Programming
 */
package pack1;

/**
 *
 * @author karl_
 */
public class Student {
    private String name;
    private int id;
    
    public Student()
    {
        name = "Not Set";
        id = 0;   
    }
    
    public Student(String givenName, int givenId)
    {
        name= givenName;
        id = givenId;
    }
    
    public void setName(String givenName)
    {
        this.name = givenName;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setId(int givenId)
    {
        this.id = givenId;
    }
    
    public int getId()
    {
        return id;
    }
}


