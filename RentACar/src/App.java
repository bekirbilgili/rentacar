import business.UserManager;
import core.Db;
import core.Helper;
import view.AdminView;
import view.LoginView;

import java.sql.Connection;
import java.sql.DriverManager;

public class App {
    public static void main(String[] args) {
       // Connection conn = Db.getInstance();
        Helper.setTheme();
        //LoginView loginView = new LoginView();
        UserManager userManager = new UserManager();
        AdminView adminView = new AdminView(userManager.findbyLogin("admin","1234"));
    }
}
