import sql.datasource.MariaDbConnection;
import view.CcView;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        //Connection c = MariaDbConnection.getConnection();
        CcView.launch(CcView.class);


    }
}