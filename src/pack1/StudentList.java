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
public class StudentList {
    
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.setName("Karl");
        s1.setId(123);
        
        Student s2 = new Student();
        Student s3 = new Student("John", 456);
        
        System.out.println("BEFORE s1 ==> Name: " + s1.getName() + " ID = " + s1.getId());
        System.out.println("s2 ==> Name: " + s2.getName() + " ID = " + s2.getId());
        System.out.println("s3 ==> Name: " + s3.getName() + " ID = " + s3.getId());
        
        
        Student[] studentlist = new Student[5];
        
        studentlist[0] = s1;
        studentlist[1] = s2;
        studentlist[2] = s3;
        studentlist[3] = new Student("Jay",111);
        studentlist[4] = new Student("Cry",666);
        s1 = new Student("Smith",555);
        System.out.println("AFTER s1 ==> Name: " + s1.getName() + " ID = " + s1.getId());
        
        for(int i=0; i < studentlist.length; i++)
            System.out.println("i= " + i );
    
    }
    
}


