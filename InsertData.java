package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1522:xe";
        String username = "system";
        String password = "piyush";

        Connection conn = null;
        Statement stmt = null;

        try {
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            
            // Insert data into BRANCH table
            stmt.executeUpdate("INSERT INTO BRANCH VALUES('B001', 'JANAKPURI BRANCH', 'DELHI')");
            stmt.executeUpdate("INSERT INTO BRANCH VALUES('B002', 'CHANDNICHOWK BRANCH', 'DELHI')");
            stmt.executeUpdate("INSERT INTO BRANCH VALUES('B003', 'JUHU BRANCH', 'MUMBAI')");
            stmt.executeUpdate("INSERT INTO BRANCH VALUES('B004', 'ANDHERI BRANCH', 'MUMBAI')");
            stmt.executeUpdate("INSERT INTO BRANCH VALUES('B005', 'SALTLAKE BRANCH', 'KOLKATA')");
            stmt.executeUpdate("INSERT INTO BRANCH VALUES('B006', 'SRIRAMPURAM BRANCH', 'CHENNAI')");
            System.out.println("Data inserted into BRANCH table");
            
            // Insert data into ACCOUNT table
            stmt.executeUpdate("INSERT INTO ACCOUNT VALUES('A0001','SB',200000,'B003')");
            stmt.executeUpdate("INSERT INTO ACCOUNT VALUES('A0002','SB',15000,'B002')");
            stmt.executeUpdate("INSERT INTO ACCOUNT VALUES('A0003','CA',850000,'B004')");
            stmt.executeUpdate("INSERT INTO ACCOUNT VALUES('A0004','CA',35000,'B004')");
            stmt.executeUpdate("INSERT INTO ACCOUNT VALUES('A0005','FD',28500,'B005')");
            stmt.executeUpdate("INSERT INTO ACCOUNT VALUES('A0006','FD',550000,'B005')");
            stmt.executeUpdate("INSERT INTO ACCOUNT VALUES('A0007','SB',48000,'B001')");
            stmt.executeUpdate("INSERT INTO ACCOUNT VALUES('A0008','SB',7200,'B002')");
            stmt.executeUpdate("INSERT INTO ACCOUNT VALUES('A0009','SB',18750,'B003')");
            stmt.executeUpdate("INSERT INTO ACCOUNT VALUES('A0010','FD',99000,'B004')");
            System.out.println("Data inserted into ACCOUNT table");

            // Insert data into DEPOSITOR table
            stmt.executeUpdate("INSERT INTO DEPOSITOR VALUES('C0003','A0001')");
            stmt.executeUpdate("INSERT INTO DEPOSITOR VALUES('C0004','A0001')");
            stmt.executeUpdate("INSERT INTO DEPOSITOR VALUES('C0004','A0002')");
            stmt.executeUpdate("INSERT INTO DEPOSITOR VALUES('C0006','A0003')");
            stmt.executeUpdate("INSERT INTO DEPOSITOR VALUES('C0006','A0004')");
            stmt.executeUpdate("INSERT INTO DEPOSITOR VALUES('C0001','A0005')");
            stmt.executeUpdate("INSERT INTO DEPOSITOR VALUES('C0002','A0005')");
            stmt.executeUpdate("INSERT INTO DEPOSITOR VALUES('C0010','A0006')");
            stmt.executeUpdate("INSERT INTO DEPOSITOR VALUES('C0009','A0007')");
            stmt.executeUpdate("INSERT INTO DEPOSITOR VALUES('C0008','A0008')");
            stmt.executeUpdate("INSERT INTO DEPOSITOR VALUES('C0007','A0009')");
            stmt.executeUpdate("INSERT INTO DEPOSITOR VALUES('C0006','A0010')");
            System.out.println("Data inserted into DEPOSITOR table");

            // Insert data into LOAN table
            stmt.executeUpdate("INSERT INTO LOAN VALUES('L0001','C0005',300000,'B006')");
            stmt.executeUpdate("INSERT INTO LOAN VALUES('L0002','C0001',50000,'B005')");
            stmt.executeUpdate("INSERT INTO LOAN VALUES('L0003','C0002',800000,'B004')");
            stmt.executeUpdate("INSERT INTO LOAN VALUES('L0004','C0010',100000,'B004')");
            stmt.executeUpdate("INSERT INTO LOAN VALUES('L0005','C0009',950000,'B005')");
            stmt.executeUpdate("INSERT INTO LOAN VALUES('L0006','C0008',25000,'B006')");
            System.out.println("Data inserted into LOAN table");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}