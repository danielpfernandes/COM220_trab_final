package Main.BD;

import java.sql.*;

public class BD {

    private Statement stmt;
    public BD() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/Biblioteca", "root", "root");
            stmt = c.createStatement();
        } catch (Exception e) {
            System.err.println(e);
        }

    }

    /**
     * @return the stmt
     */
    public Statement getStmt() {
        return stmt;
    }
}

