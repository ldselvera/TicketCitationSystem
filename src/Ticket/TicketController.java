/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ticket;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author Selvera
 */
public class TicketController {

    TicketModel ticketModel = new TicketModel();
    TicketView ticketView = new TicketView();
    int i = 1;

    public TicketController(TicketModel ticketModel, TicketView ticketView) throws IOException, SQLException {
        this.ticketModel = ticketModel;
        this.ticketView = ticketView;
        attachHandlers();
    }

    public void attachHandlers() throws IOException {
        ticketView.getSubmit().setOnAction(
                new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if ("".equals(ticketView.getTicketTF().getText())) {
                    ticketView.invalidSubmit();
                } else {
                    String ticket = ticketView.getTicketTF().getText();
                    String license = ticketView.getLicenseTF().getText();
                    String permit = ticketView.getPermitTF().getText();
                    String state = ticketView.getStateTF().getText();
                    String vehicle = ticketView.getVehicleTF().getText();
                    String color = ticketView.getColorTF().getText();
                    String violation = ticketView.getViolationTF().getText();
                    String date = ticketView.getDateTF().getText();
                    String location = ticketView.getLocationTF().getText();
                    String time = ticketView.getTimeTF().getText();
                    String issued = ticketView.getIssuedTF().getText();
                    String paid = "Unpaid";

                    int citationNo = Integer.parseInt(ticket);
                    try {
                        if (ticketModel.verifyKey(citationNo) == true) {
                            ticketView.key();
                        } else {
                            ticketModel.writeDB(citationNo, license, permit, state, vehicle, color, violation, date, location, time, issued, paid);
                        }
                        ticketView.clearFields();
                    } catch (SQLException ex) {
                        Logger.getLogger(TicketController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        ticketView.getPay().setOnAction(
                new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Ticket currentTicket;
                try {
                    if (i < 0 || i >= ticketModel.sizeDB()) {
                        System.out.println(i);
                        ticketView.invalidPay();
                    } else {
                        ticketModel.writePay(i);
                        currentTicket = ticketModel.readDB(i);
                        ticketView.updateTicketView(currentTicket);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(TicketController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        ticketView.getLeftDisplay().setOnAction(
                new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                i--;
                if (i < 1) {
                    ticketView.invalidTicketLeftView();
                    i = 1;
                } else {
                    Ticket currentTicket;
                    try {
                        currentTicket = ticketModel.readDB(i);
                        ticketView.updateTicketView(currentTicket);
                    } catch (SQLException ex) {
                        Logger.getLogger(TicketController.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        });
        ticketView.getRightDisplay().setOnAction(
                new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    if (i > ticketModel.sizeDB()) {
                        ticketView.invalidTicketRightView();
                        i = ticketModel.sizeDB();
                    } else {
                        Ticket currentTicket;
                        currentTicket = ticketModel.readDB(i);
                        ticketView.updateTicketView(currentTicket);
                        i++;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(TicketController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        ticketView.getExit().setOnAction(
                new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
            }
        });
    }
}
