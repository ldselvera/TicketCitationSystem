/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ticket;

import Database.MysqlConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Selvera
 */
public class TicketModel {

    Ticket currentTicket = new Ticket();
    MysqlConnect myConn = MysqlConnect.getDbCon();
    ResultSet myRs = null;

    public Ticket readDB(int i) throws SQLException {
        Ticket newTicket = new Ticket();
        try {
            String sql = "SELECT * FROM  ticketSystem where id = ?";
            PreparedStatement myStmt = myConn.preparedStatement(sql);

            myStmt.setInt(1, i);

            myRs = myStmt.executeQuery();

            String ticket = null, license = null, permit = null, state = null, vehicle = null, color = null, violation = null,
                    date = null, location = null, time = null, issued = null, paid = null;

            while (myRs.next()) {
                ticket = myRs.getString("ticketNo");
                license = myRs.getString("license");
                permit = myRs.getString("permit");
                state = myRs.getString("state");
                vehicle = myRs.getString("vehicle");
                color = myRs.getString("color");
                violation = myRs.getString("violation");
                date = myRs.getString("date");
                location = myRs.getString("location");
                time = myRs.getString("time");
                issued = myRs.getString("issued");
                paid = myRs.getString("paid");
            }

            newTicket = new Ticket(ticket, license, permit, state, vehicle, color, violation, location, date, time, issued, paid);

            return newTicket;
        } catch (SQLException exc) {
        } finally {
            if (myRs != null) {
                myRs.close();
            }
        }
        return newTicket;
    }

    public int sizeDB() throws SQLException {
        int count = 0;
        try {
            String sql = "SELECT COUNT(*) FROM ticketSystem";
            myRs = myConn.query(sql);
            while (myRs.next()) {
                count = myRs.getInt("COUNT(*)");
            }
            return count;
        } catch (SQLException exc) {
        } finally {
            if (myRs != null) {
                myRs.close();
            }
        }
        return count;
    }

    public Boolean verifyKey(int citationNo) throws SQLException {
        String sql = "SELECT * FROM citation.ticketSystem where ticketNo = ?;";

        PreparedStatement myStmt = myConn.preparedStatement(sql);
        myStmt.setInt(1, citationNo);

        int check;

        myRs = myStmt.executeQuery();

        if (myRs.next()) {
            check = myRs.getInt("ticketNo");
            return check == citationNo;
        }
        return false;
    }

    public void writeDB(int ticketNo, String license, String permit, String state, String vehicle, String color, String violation, String date, String location,
            String time, String issued, String paid) throws SQLException {
        int x = 0;
        try {
            myRs = myConn.query("SELECT * FROM ticketSystem;");

            String sql = "INSERT INTO `citation`.`ticketSystem` (`id`, `ticketNo`, `license`, `permit`, `state`, "
                    + "`vehicle`, `color`, `violation`, `date`, "
                    + "`location`, `time`, `issued`, `paid`) "
                    + "VALUES (?,?,?, ?,?,?, ?,?,?, ?,?,?, ?);";

            PreparedStatement myStmt = myConn.preparedStatement(sql);

            myStmt.setInt(1, (sizeDB() + 1));
            myStmt.setInt(2, ticketNo);
            myStmt.setString(3, license);
            myStmt.setString(4, permit);
            myStmt.setString(5, state);
            myStmt.setString(6, vehicle);
            myStmt.setString(7, color);
            myStmt.setString(8, violation);
            myStmt.setString(9, date);
            myStmt.setString(10, location);
            myStmt.setString(11, time);
            myStmt.setString(12, issued);
            myStmt.setString(13, paid);

            myStmt.executeUpdate();

        } catch (SQLException exc) {
        } finally {
            if (myRs != null) {
                myRs.close();
            }
        }
    }

    public void writePay(int id) throws SQLException {
        String sql = "UPDATE ticketSystem SET paid =? where id =? ";
        PreparedStatement myStmt = myConn.preparedStatement(sql);

        myStmt.setString(1, "Paid");
        myStmt.setInt(2, id);

        myStmt.executeUpdate();
    }

}
