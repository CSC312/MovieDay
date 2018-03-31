/*
 This Class is for general functions
 */
package movieday;

import UserPages.Screen1Home;
import UserPages.Screen3Login;

/**
 *
 * @author johnclaude
 */
public class MovieDay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new AdminHome().setVisible(true);
        
        new Function().initDatabase();
        new UserPages.Screen3Login().setVisible(true);
    }   
}
