
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

/**
 *
 * @author Jordan Price
 */
public class DataIO {

    private final String URL = "jbdc.url";
    private final String USERNAME = "jbdc.username";
    private final String PASSWORD = "jbdc.password";
    

    // behaviors
    public void add(Customer cust) throws ClassNotFoundException, FileNotFoundException, IOException, SQLException {
        
        Properties props = new Properties();
        FileInputStream in = new FileInputStream("E:\\Portfolio\\PriceLandscaping\\JavaResources\\dbconfig.properties");
        props.load(in);
        in.close();

        String driver = props.getProperty("jbdc.driver");
        if (driver != null) {
            Class.forName(driver);
        }
        String url = props.getProperty(URL);
        String username = props.getProperty(USERNAME);
        String password = props.getProperty(PASSWORD);

        //connect to database 
        Connection conn = DriverManager.getConnection(url, username, password);

        //add record 
        String strSQL = "INSERT INTO landscape (CustomerName, CustomerAddress, " + "LandscapeType, YardLength, YardWidth, LandscapeCost) " + "VALUES(?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(strSQL);
        pstmt.setString(1, cust.getName());
        pstmt.setString(2, cust.getAddress());
        pstmt.setString(3, cust.getYardType());
        pstmt.setDouble(4, cust.getLength());
        pstmt.setDouble(5, cust.getWidth());
        pstmt.setDouble(6, cust.getTotalCost());

        // execute the prepared statement
        pstmt.execute();

        //close connection 
        conn.close();
    }

    public void delete(int CustomerID) throws SQLException, FileNotFoundException, IOException {
        
        
        Properties props = new Properties();
        FileInputStream in = new FileInputStream("E:\\Portfolio\\PriceLandscaping\\JavaResources\\dbconfig.properties");
        props.load(in);
        in.close();
        
        String url = props.getProperty(URL);
        String username = props.getProperty(USERNAME);
        String password = props.getProperty(PASSWORD);
               
        // connect to the database
        Connection conn = DriverManager.getConnection(url, username, password);

        // delete the record
        String SQL = "DELETE FROM landScape WHERE CustomerID = ?";
        PreparedStatement pstmt = conn.prepareStatement(SQL);
        pstmt.setInt(1, CustomerID);
        pstmt.execute();

        // close the database connection
        conn.close();
    }
   
    public ArrayList<Customer> getList() throws SQLException, FileNotFoundException, IOException {

        // create the ArrayList so we have something to return
        ArrayList<Customer> list = new ArrayList<Customer>();
        
        Properties props = new Properties();
        FileInputStream in = new FileInputStream("E:\\Portfolio\\PriceLandscaping\\JavaResources\\dbconfig.properties");
        props.load(in);
        in.close();
        
        String url = props.getProperty(URL);
        String username = props.getProperty(USERNAME);
        String password = props.getProperty(PASSWORD);

        //connect to database 
        Connection conn = DriverManager.getConnection(url, username, password);

        Statement statement = conn.createStatement();
        String SQL = "Select * FROM landscape";
        ResultSet rs = statement.executeQuery(SQL);

        while (rs.next()) {
            // create Customer object and load the attributes
            Customer client = new Customer();
            client.setCustomerID(rs.getInt(1));
            client.setName(rs.getString(2));
            client.setAddress(rs.getString(3));
            client.setYardType(rs.getString(4));
            client.setLength(rs.getDouble(5));
            client.setWidth(rs.getDouble(6));
            client.setTotalCost(rs.getDouble(7));

            // add the Customer object to our list
            list.add(client);
        }

        // close the database connection
        conn.close();

        // return the ArrayList
        return list;
    }
}