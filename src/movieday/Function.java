/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieday;

import static com.sun.glass.ui.Cursor.setVisible;

/**
 *
 * @author johnclaude
 */
public class Function {
    public static void goToAdminHome(){
        new AdminHome().setVisible(true);
    }
    
    public static void goToAdminUserScreen(){
        new AdminUsersScreen().setVisible(true);
    }
    
    public static void goToReportScreen(){
         new ReportScreen().setVisible(true);
    }
    
     public static void goToAdminMoviesScreen(){
        new AdminMoviesScreen().setVisible(true);
    }
     
     public static void goToAdminHelpScreen(){
        new AdminHelpScreen().setVisible(true);
    }
}
