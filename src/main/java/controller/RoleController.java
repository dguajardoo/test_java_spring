package controller;

import data.RoleDao;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;

@Component
@RestController
public class RoleController {
    @RequestMapping("/")
    public String index() throws SQLException {
        //RoleDao rd = new RoleDao();
        //rd.loadAll();
        return viewTable(getDBConnection(), "MAIPOGRANDE");
        //return "Congratulations from controller.RoleController.java";
    }

    public static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
    public static final String DB_CONNECTION = "jdbc:oracle:thin:@maipogrande.c1gkpofat6lb.us-east-1.rds.amazonaws.com:1521:ORCL";
    public static final String DB_USER = "maipogrande";
    public static final String DB_PASSWORD = "MaipoBDGrande";

    public static Connection getDBConnection() {

        Connection dbConnection = null;

        try {

            Class.forName(DB_DRIVER);

        } catch (ClassNotFoundException e) {

            System.out.println("Error driver JDBC: "+e.getMessage());

        }

        try {

            dbConnection = DriverManager.getConnection(DB_CONNECTION,DB_USER,DB_PASSWORD);
            return dbConnection;

        } catch (SQLException e) {

            System.out.println("Cannot open connection: "+e.getMessage());

        }

        return dbConnection;

    }

    public String viewTable(Connection con, String dbName)
            throws SQLException {

        Statement stmt = null;
        String result = "";
        //String query = "select ID_ROL, NOMBRE_ROL from " + dbName + ".MG_ROLES";
        String query = "select VALUE from nls_session_parameters";
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                //String coffeeName = rs.getString("NOMBRE_ROL");
                //int supplierID = rs.getInt("ID_ROL");
                //System.out.println(coffeeName + "\t" + supplierID);

                String coffeeName = rs.getString("value");
                System.out.println(coffeeName + "\t");

                result += coffeeName + "\t";
            }
        } catch (SQLException e ) {

        } finally {
            if (stmt != null) { stmt.close(); }
        }

        return result;
    }
}
