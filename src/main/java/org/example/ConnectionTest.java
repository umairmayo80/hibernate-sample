package org.example;


import com.mysql.cj.jdbc.MysqlDataSource;

/**
 * simple create connection with database using data source
 * @author UbaidurRehman
 *
 */
public class ConnectionTest
{
    public static void main(String [] args)
    {
        try
        {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUser("root");
            dataSource.setPassword("password123");
            dataSource.setPort(3306);
            dataSource.setDatabaseName("bsd");
            System.out.println("Connecting: " + dataSource.getURL());
            dataSource.getConnection();
            System.out.println("Connection Successfull");
        }
        catch(Exception exp)
        {
            exp.printStackTrace();
        }
    }
}