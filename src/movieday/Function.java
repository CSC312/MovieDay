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
        AdminHome screen = new AdminHome();
        screen.setVisible(true);
        setVisible(false);
    }
    
    public static void goToAdminUserScreen(){
        AdminUsersScreen screen = new AdminUsersScreen();
        screen.setVisible(true);
        setVisible(false);
    }
    
    public static void goToReportScreen(){
        ReportScreen screen = new ReportScreen();
        screen.setVisible(true);
        setVisible(false);
    }
    
     public static void goToAdminMoviesScreen(){
        AdminMoviesScreen screen = new AdminMoviesScreen();
        screen.setVisible(true);
        setVisible(false);
    }
}
