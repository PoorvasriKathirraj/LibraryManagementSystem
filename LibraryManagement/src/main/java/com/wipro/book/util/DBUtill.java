//package com.wipro.book.util;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//public class DBUtill {
//
//    public static Connection getDBConnection() throws Exception {
//
//        Class.forName("oracle.jdbc.OracleDriver");
//
//        Connection con = DriverManager.getConnection(
//            "jdbc:oracle:thin:@localhost:1521:XE",
//            "SYSTEM",
//            "Poorvasri07*"
//        );
//
//        return con;
//    }
//}
package com.wipro.book.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtill {

    public static Connection getDBConnection() {
        
        try {
            // ✅ Correct Oracle driver
            Class.forName("oracle.jdbc.OracleDriver");

            // ✅ Correct service-name based URL (Oracle XE)
            String url = "jdbc:oracle:thin:@localhost:1521:XE";

            // ⚠️ Use normal DB user (NOT SYSTEM)
            String username = "SYSTEM";
            String password = "Poorvasri07*";

            Connection con = DriverManager.getConnection(url, username, password);
            return con;

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

