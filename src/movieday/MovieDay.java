/*
 This Class is for general functions
 */
package movieday;

import UserPages.Screen1Home;

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
        new Screen1Home().setVisible(true);
    }   
}
