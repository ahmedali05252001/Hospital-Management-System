/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @albanianTeam
 */
public class InsertUpdateDelete {
    public static int setData(String Query){
        Connection con = null;
        Statement statement = null;
        try{
            con = ConnectionProvider.getCon();

            //For inserting,updating or deleting data into or from table
            statement = con.createStatement();              //we use it to execute every single query.
            //Executing Statement
            statement.executeUpdate(Query);
            statement.close();
            con.close();
            return 1;
        }
        catch(Exception e){
            return 0;
        }

    }
}
