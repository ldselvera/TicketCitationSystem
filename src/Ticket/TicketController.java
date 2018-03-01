/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ticket;

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
    private int i=0;
    private int j=-1;
    private int b=0;
    private Boolean pay;
    
    public TicketController(TicketModel ticketModel,TicketView ticketView) {
		this.ticketModel = ticketModel;
		this.ticketView = ticketView;
		attachHandlers();
	}
    
    public void attachHandlers(){
        ticketView.getSubmit().setOnAction(
                new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {   
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
                        Boolean paid = ticketModel.getCurrentTicket().getPaid();
                        
			Ticket currentTicket = new Ticket(ticket,license,permit,state, vehicle, color, violation,location,  date, time, issued,paid);
			
			ticketModel.getTicketDB().add(i, currentTicket);
                        i++;
			ticketView.clearFields();
                }
            }   
                });
    ticketView.getPay().setOnAction(
                new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                b++;
                
                if(j<0 || j>= ticketModel.getTicketDB().size()){
                    ticketView.invalidPay();
                }
                else{
                    if (b%2==0){
                        pay= false;
                        Ticket currentTicket = ticketModel.getTicketDB().get(j);
                        currentTicket.setPaid(pay);
                        ticketView.paymentView(currentTicket);
                    }   
                    else{
                        pay=true;
                        Ticket currentTicket = ticketModel.getTicketDB().get(j);
                        currentTicket.setPaid(pay);
                        ticketView.paymentView(currentTicket);
                    }
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
    }
}
