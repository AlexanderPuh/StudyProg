package sample;



import javax.swing.*;
import java.sql.*;

/**
 * Created by User on 27.04.2016.
 */
public class sqliteConnection
{
    public static Connection con;
    public static Statement statm;
    public static ResultSet resSet;
    public  static void sqliteConnection() throws ClassNotFoundException, SQLException
    {
con=null;
        Class.forName("org.sqlite.JDBC");
        con=DriverManager.getConnection("jdbc:sqlite:students.sqlite");
System.out.println("База подключена");
    }
    public static void ReadBD() throws ClassNotFoundException, SQLException
    {
resSet=statm.executeQuery("SELECT *FROM Students");
        while(resSet.next())
        {
            int ID=resSet.getInt("ID");
             String STUDENT_NAME=resSet.getString("STUDENT_NAME");
            String GROUP_NAME=resSet.getString("GROUP_NAME");
            System.out.println("id"+ID);
            System.out.println("surname"+STUDENT_NAME);
            System.out.println("group"+GROUP_NAME);
        }

System.out.println("Таблица введена!");
    }
    public static void CLOSEDB() throws ClassNotFoundException, SQLException
    {
con.close();
        statm.close();
        resSet.close();
        System.out.println("Соединение закрыто");

    }
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        sqliteConnection();
ReadBD();
        CLOSEDB();
    }

}
