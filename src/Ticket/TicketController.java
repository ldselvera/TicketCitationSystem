/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ticket;

import java.io.IOException;
<<<<<<< HEAD
import java.sql.SQLException;
=======
>>>>>>> 7a8aa16bfd237dc508332d516e5406ddb96a479d
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
<<<<<<< HEAD

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
=======
    TicketModel ticketModel = new TicketModel();
    TicketView ticketView = new TicketView();
    private int j=-1;
    
    public TicketController(TicketModel ticketModel,TicketView ticketView) throws IOException {
		this.ticketModel = ticketModel;
		this.ticketView = ticketView;
                this.ticketModel.readFile();
		attachHandlers();
	}
    
    public void attachHandlers(){
        ticketView.getSubmit().setOnAction(
                new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                int i= ticketModel.getTicketDB().size();
                if("".equals(ticketView.getTicketTF().getText())){
                    ticketView.invalidSubmit();
                }
                else{                    
                    String ticket= ticketView.getTicketTF().getText();
                    String license= ticketView.getLicenseTF().getText();
                    String permit= ticketView.getPermitTF().getText();
                    String state= ticketView.getStateTF().getText();
                    String vehicle = ticketView.getVehicleTF().getText();
                    String color= ticketView.getColorTF().getText();
                    String violation= ticketView.getViolationTF().getText();
                    String date= ticketView.getDateTF().getText();
                    String location= ticketView.getLocationTF().getText();
                    String time= ticketView.getTimeTF().getText();
                    String issued = ticketView.getIssuedTF().getText();
                    String paid = "Unpaid";
                        
                    Ticket currentTicket = new Ticket(ticket,license,permit,state, vehicle, color, violation,location,  date, time, issued,paid);
			
                    ticketModel.getTicketDB().add(i,currentTicket);
                    try {
                        ticketModel.writeFile(i);
                    } catch (IOException ex) {
                        Logger.getLogger(TicketController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    i++;
                    ticketView.clearFields();
                }
            }   
                });
    ticketView.getPay().setOnAction(
                new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {                
                if(j<0 || j>= ticketModel.getTicketDB().size()){
                    ticketView.invalidPay();
                }
                else{
                        String pay="Paid";
                        Ticket currentTicket = ticketModel.getTicketDB().get(j);
                        currentTicket.setPaid(pay);
                        ticketView.updateTicketView(currentTicket);
                    }
            }       
                });
    ticketView.getLeftDisplay().setOnAction(
                new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                j--;
                if(j<0){
                    ticketView.invalidTicketLeftView();
                                            j=-1;
                }
                else{
                Ticket currentTicket = ticketModel.getTicketDB().get(j);
			ticketView.updateTicketView(currentTicket);
                }
            }       
                });
    ticketView.getRightDisplay().setOnAction(
                new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                j++;
                if(j>=ticketModel.getTicketDB().size()){
                    ticketView.invalidTicketRightView();
                    j=ticketModel.getTicketDB().size();
                }
                else{
                Ticket currentTicket = ticketModel.getTicketDB().get(j);
			ticketView.updateTicketView(currentTicket);
                }
            }    
                });
    ticketView.getExit().setOnAction(
                new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
            }               
                });
>>>>>>> 7a8aa16bfd237dc508332d516e5406ddb96a479d
    }
}
