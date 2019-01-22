 /*
 * Karl Ong
 * 991446377
 * SYST10199 - Web Programming
 */
package pack1;

import java.util.Scanner;

/**
 *
 * @author karl_
 */
public class ReadAndPrintInReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //read in a word

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name");

        String name = sc.nextLine();

        // verify that name was entered
        System.out.println("The name you entered is: " + name);
        
        //verify that name was entered
        //System.out.println("The name you entered is: " + name);
        char[] nameInChar = new char[name.length()];
        
        for(int i=0; i<nameInChar.length; i++)
        nameInChar[i] = name.charAt(i);
        
        /*
        //verify the population of the array
        for(int i=0; i<nameInChar.length; i++)
            System.out.println(nameInChar[i]);
        */
        
        
        for(int i = nameInChar.length -1; i >= 0; i--)
            System.out.println(nameInChar[i]);

    }
    
}
