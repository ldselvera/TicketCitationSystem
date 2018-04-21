/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ticket;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

/**
 *
 * @author Selvera
 */
<<<<<<< HEAD
public class TicketView extends BorderPane {

    private BorderPane root = new BorderPane();
    private GridPane gridpane = new GridPane();

    private Label ticketLabel = new Label("Ticket Number");
    private TextField ticketTF = new TextField();

    private Label licenseLabel = new Label("License Number");
    private TextField licenseTF = new TextField();

    private Label permitLabel = new Label("Permit Number");
    private TextField permitTF = new TextField();

    private Label stateLabel = new Label("State");
    private TextField stateTF = new TextField();

    private Label vehicleLabel = new Label("Vehicle Model");
    private TextField vehicleTF = new TextField();

    private Label colorLabel = new Label("Color");
    private TextField colorTF = new TextField();

    private Label violationLabel = new Label("Violation Type");
    private TextField violationTF = new TextField();

    private Label dateLabel = new Label("Date (mm/dd/yy)");
    private TextField dateTF = new TextField();

    private Label locationLabel = new Label("Location");
    private TextField locationTF = new TextField();

    private Label timeLabel = new Label("Time (hh:mm)");
    private TextField timeTF = new TextField();

    private Label issuedLabel = new Label("Issued by");
    private TextField issuedTF = new TextField();

    private Button pay = new Button("Paid/Unpaid");
    private Button submit = new Button("Submit");
    private Button left = new Button("<<");
    private Button right = new Button(">>");
    private Button exit = new Button("Exit");

    private Text ticketsText = new Text();
    private Text payment = new Text();

    Label titleLabel = new Label("Parking Citation");

    Image image1 = new Image("logo.PNG");
    ImageView imageIV = new ImageView(image1);

    String paystring = "\n\t\t\tPAYMENTS"
            + "\nPayments can be made at the following office:"
            + "\n\t\tBussiness Office, Tandy 107"
            + "\n\tMonday thru Friday 8:00 am-5:00 pm\n"
            + "\t$25 per citation, other fees may apply"
            + "\n\t\t$100 for boot removal\n"
            + "Payments can be mailed to the following address:\n"
            + "\t\t\t\tTSC"
            + "\n\t\t\tC/O Finance Dept"
            + "\n\t\tAttn: Parking Enforcement"
            + "\n\t\t\t80 Fort Brown\n"
            + "\t\tBrownsville, TX 78520"
            + "\n\t\tDO NOT MAIL CASH!"
            + "\nFor more information parking citations please visit:"
            + "\nwww.tsc.edu/parking";

    public TicketView() {
=======
public class TicketView extends BorderPane{
    
    private BorderPane root= new BorderPane();
    private GridPane gridpane= new GridPane();
    
    private Label ticketLabel = new Label("Ticket Number");
    private TextField ticketTF = new TextField();
    
    private Label licenseLabel = new Label("License Number");
    private TextField licenseTF = new TextField();
    
    private Label permitLabel = new Label("Permit Number");
    private TextField permitTF = new TextField();
    
    private Label stateLabel = new Label("State");
    private TextField stateTF= new TextField();
    
    private Label vehicleLabel = new Label("Vehicle Model");
    private TextField vehicleTF = new TextField();
    
    private Label colorLabel = new Label("Color");
    private TextField colorTF = new TextField();
    
    private Label violationLabel = new Label("Violation Type");
    private TextField violationTF = new TextField();
    
    private Label dateLabel = new Label("Date (mm/dd/yy)");
    private TextField dateTF = new TextField();
    
    private Label locationLabel = new Label("Location");
    private TextField locationTF = new TextField();
    
    private Label timeLabel = new Label("Time (hh:mm)");
    private TextField timeTF = new TextField();
    
    private Label issuedLabel = new Label("Issued by");
    private TextField issuedTF = new TextField();
    
    private Button pay= new Button ("Paid/Unpaid");
    private Button submit= new Button ("Submit");
    private Button left= new Button ("<<");
    private Button right= new Button (">>");
    private Button exit= new Button ("Exit");
  
    private Text ticketsText = new Text();
    private Text payment = new Text();
    
    Label titleLabel = new Label("Parking Citation");
    
    Image image1 = new Image("logo.PNG");
    ImageView imageIV = new ImageView(image1);
    
    String paystring = "\n\t\t\tPAYMENTS"
            +"\nPayments can be made at the following office:"
            + "\n\t\tBussiness Office, Tandy 107"
            +"\n\tMonday thru Friday 8:00 am-5:00 pm\n"
            + "\t$25 per citation, other fees may apply"
            +"\n\t\t$100 for boot removal\n"
            + "Payments can be mailed to the following address:\n"
            + "\t\t\t\tTSC"
            +"\n\t\t\tC/O Finance Dept"
            +"\n\t\tAttn: Parking Enforcement"
            +"\n\t\t\t80 Fort Brown\n"
            + "\t\tBrownsville, TX 78520"
            +"\n\t\tDO NOT MAIL CASH!"
            +"\nFor more information parking citations please visit:"
            +"\nwww.tsc.edu/parking";
    
   
    public  TicketView(){
>>>>>>> 7a8aa16bfd237dc508332d516e5406ddb96a479d
        imageIV.setFitHeight(50);
        imageIV.setFitWidth(50);
        HBox hbox0 = new HBox(imageIV, titleLabel);
        titleLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 30));

        payment.setText(paystring);
        payment.setTextAlignment(TextAlignment.LEFT);
<<<<<<< HEAD

        VBox vbox1 = new VBox(getSubmit(), getPay(), getLeftDisplay(), getRightDisplay(), getExit());

        HBox hbox2 = new HBox(ticketLabel, licenseLabel, stateLabel);
        HBox hbox4 = new HBox(ticketTF, licenseTF, stateTF);
        hbox4.setSpacing(1);
        HBox hbox5 = new HBox(dateLabel, permitLabel, timeLabel);
        HBox hbox6 = new HBox(dateTF, permitTF, timeTF);
        hbox6.setSpacing(3);
        HBox hbox7 = new HBox(locationLabel, colorLabel, issuedLabel);
        HBox hbox8 = new HBox(locationTF, colorTF, issuedTF);
        HBox hbox9 = new HBox(violationLabel, vehicleLabel);
        HBox hbox10 = new HBox(violationTF, vehicleTF);
=======
        
        VBox vbox1= new VBox(getSubmit(), getPay(),getLeftDisplay(), getRightDisplay(), getExit());
        
        HBox hbox2= new HBox(ticketLabel, licenseLabel, stateLabel);
        HBox hbox4= new HBox( ticketTF, licenseTF, stateTF);
        hbox4.setSpacing(1);
        HBox hbox5= new HBox(dateLabel,permitLabel, timeLabel);
        HBox hbox6= new HBox(dateTF, permitTF, timeTF);
        hbox6.setSpacing(3);
        HBox hbox7= new HBox(locationLabel,colorLabel, issuedLabel );
        HBox hbox8= new HBox(locationTF,colorTF, issuedTF);
        HBox hbox9 =  new HBox(violationLabel, vehicleLabel);
        HBox hbox10 = new HBox(violationTF, vehicleTF);
                
>>>>>>> 7a8aa16bfd237dc508332d516e5406ddb96a479d

        hbox2.setSpacing(90);
        hbox5.setSpacing(80);
        hbox7.setSpacing(120);
        hbox9.setSpacing(80);
<<<<<<< HEAD
        hbox9.setSpacing(80);

        gridpane.add(hbox2, 1, 1);
        gridpane.add(hbox4, 1, 2);
        gridpane.add(hbox5, 1, 3);
        gridpane.add(hbox6, 1, 4);
        gridpane.add(hbox7, 1, 5);
        gridpane.add(hbox8, 1, 6);
        gridpane.add(hbox9, 1, 7);
        gridpane.add(hbox10, 1, 8);

=======
                hbox9.setSpacing(80);
        
        gridpane.add(hbox2, 1, 1);
       gridpane.add(hbox4,1, 2);
       gridpane.add(hbox5, 1, 3);
       gridpane.add(hbox6, 1, 4);
       gridpane.add(hbox7, 1, 5);
       gridpane.add(hbox8, 1, 6);
       gridpane.add(hbox9, 1, 7);
       gridpane.add(hbox10, 1, 8);
       
       
>>>>>>> 7a8aa16bfd237dc508332d516e5406ddb96a479d
        hbox0.setAlignment(Pos.CENTER);
        this.setTop(hbox0);
        this.setCenter(gridpane);
        this.setLeft(vbox1);
        this.setRight(payment);
    }
<<<<<<< HEAD

    public void updateTicketView(Ticket currentTicket) {

        String ticket = currentTicket.getTicket();
        String license = currentTicket.getLicense();
        String permit = currentTicket.getPermit();
=======
  
    public void updateTicketView(Ticket currentTicket){
           
        String ticket = currentTicket.getTicket();
        String license = currentTicket.getLicense();
        String permit=currentTicket.getPermit();
>>>>>>> 7a8aa16bfd237dc508332d516e5406ddb96a479d
        String state = currentTicket.getState();
        String vehicle = currentTicket.getVehicle();
        String color = currentTicket.getColor();
        String violation = currentTicket.getViolation();
        String date = currentTicket.getDate();
        String location = currentTicket.getLocation();
        String time = currentTicket.getTime();
        String issued = currentTicket.getIssued();
        String paid = currentTicket.getPaid();
<<<<<<< HEAD

      
        ticketsText.setText(" ");
        ticketsText.setText("Ticket: " + ticket + "\n"
                + "License: " + license + "\n"
                + "Permit: " + permit + "\n"
                + "State: " + state + "\n"
                + "Vehicle Model: " + vehicle + "\n"
                + "Color: " + color + "\n"
                + "Violation: " + violation + "\n"
                + "Date: " + date + "\n"
                + "Location: " + location + "\n"
                + "Time: " + time + "\n"
                + "Issued by: " + issued + "\n"
                + "Paid Status: " + paid);

        ticketsText.setLineSpacing(3);
        ticketsText.setFont(Font.font(15));
        ticketsText.setTextAlignment(TextAlignment.LEFT);

        this.setBottom(ticketsText);
    }

    public void invalidTicketLeftView() {
        ticketsText.setTextAlignment(TextAlignment.CENTER);

        ticketsText.setText("Please press '>>' to display the first ticket.");

        ticketsText.setLineSpacing(10);
        ticketsText.setFont(Font.font(15));
        ticketsText.setTextAlignment(TextAlignment.LEFT);

        this.setBottom(ticketsText);
    }

    public void invalidTicketRightView() {

        ticketsText.setText("End of Results.\nPlease press '<<' to display the last ticket.");
        ticketsText.setTextAlignment(TextAlignment.CENTER);

        ticketsText.setLineSpacing(10);
        ticketsText.setFont(Font.font(15));
        ticketsText.setTextAlignment(TextAlignment.LEFT);

        this.setBottom(ticketsText);
    }

    public void invalidPay() {

        ticketsText.setTextAlignment(TextAlignment.CENTER);

=======
			
	this.getChildren().clear();
        ticketsText.setText(" ");
        imageIV.setFitHeight(50);
        imageIV.setFitWidth(50);
        HBox hbox0 = new HBox(imageIV, titleLabel);
        titleLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 30));

        payment.setText(paystring);
        payment.setTextAlignment(TextAlignment.LEFT);
        
        VBox vbox1= new VBox(getSubmit(), getPay(),getLeftDisplay(), getRightDisplay(), getExit());
        
        HBox hbox2= new HBox(ticketLabel, licenseLabel, stateLabel);
        HBox hbox4= new HBox( ticketTF, licenseTF, stateTF);
        hbox4.setSpacing(1);
        HBox hbox5= new HBox(dateLabel,permitLabel, timeLabel);
        HBox hbox6= new HBox(dateTF, permitTF, timeTF);
        hbox6.setSpacing(3);
        HBox hbox7= new HBox(locationLabel,colorLabel, issuedLabel );
        HBox hbox8= new HBox(locationTF,colorTF, issuedTF);
        HBox hbox9 =  new HBox(violationLabel, vehicleLabel);
         HBox hbox10 = new HBox(violationTF, vehicleTF);

        hbox2.setSpacing(90);
        hbox5.setSpacing(80);
        hbox7.setSpacing(120);
        hbox9.setSpacing(80);

        gridpane.add(hbox2, 1, 1);
        gridpane.add(hbox4,1, 2);
        gridpane.add(hbox5, 1, 3);
        gridpane.add(hbox6, 1, 4);
        gridpane.add(hbox7, 1, 5);
        gridpane.add(hbox8, 1, 6);
        gridpane.add(hbox9, 1, 7);
        gridpane.add(hbox10, 1, 8);
  
        hbox0.setAlignment(Pos.CENTER);
        
        ticketsText.setText("Ticket: "+ticket+"\n"
                            +"License: "+license+"\n"
                            +"Permit: "+permit+"\n"
                            +"State: "+state+"\n"
                            +"Vehicle Model: "+vehicle+"\n"
                            +"Color: "+color+"\n"
                            +"Violation: "+violation+"\n"
                            +"Date: "+date+"\n"
                            +"Location: "+location+"\n"
                            +"Time: "+time+"\n"
                            +"Issued by: "+issued+"\n"
                            +"Paid Status: "+paid);
       
        ticketsText.setLineSpacing(3);
        ticketsText.setFont(Font.font(15));
        ticketsText.setTextAlignment(TextAlignment.LEFT);
		
	this.setTop(hbox0);
        this.setCenter(gridpane);
        this.setLeft(vbox1);
        this.setRight(payment);
        this.setBottom(ticketsText);
	}
    
    public void invalidTicketLeftView(){

	String ticket  ="";
	String license="";
	String permit    ="";
	String state = "";
	String vehicle = "";
	String color = "";
	String violation = "";
	String date = "";
	String location = "";
	String time = "";
	String issued = "";
			
	this.getChildren().clear();
        imageIV.setFitHeight(50);
        imageIV.setFitWidth(50);
        HBox hbox0 = new HBox(imageIV, titleLabel);
        titleLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 30));

        payment.setText(paystring);
        payment.setTextAlignment(TextAlignment.LEFT);
        
        VBox vbox1= new VBox(getSubmit(), getPay(),getLeftDisplay(), getRightDisplay(), getExit());
               
        HBox hbox2= new HBox(ticketLabel, licenseLabel, stateLabel);
        HBox hbox4= new HBox( ticketTF, licenseTF, stateTF);
        hbox4.setSpacing(1);
        HBox hbox5= new HBox(dateLabel,permitLabel, timeLabel);
        HBox hbox6= new HBox(dateTF, permitTF, timeTF);
        hbox6.setSpacing(3);
        HBox hbox7= new HBox(locationLabel,colorLabel, issuedLabel );
        HBox hbox8= new HBox(locationTF,colorTF, issuedTF);
        HBox hbox9 =  new HBox(violationLabel, vehicleLabel);
        HBox hbox10 = new HBox(violationTF, vehicleTF);    

        hbox2.setSpacing(90);
        hbox5.setSpacing(80);
        hbox7.setSpacing(120);
                hbox9.setSpacing(80);

       gridpane.add(hbox2, 1, 1);
       gridpane.add(hbox4,1, 2);
       gridpane.add(hbox5, 1, 3);
       gridpane.add(hbox6, 1, 4);
       gridpane.add(hbox7, 1, 5);
       gridpane.add(hbox8, 1, 6);
       gridpane.add(hbox9, 1, 7);
       gridpane.add(hbox10, 1, 8);
        
        hbox0.setAlignment(Pos.CENTER);
        ticketsText.setTextAlignment(TextAlignment.CENTER);
        
        ticketsText.setText("Please press '>>' to display the first ticket.");
       
        ticketsText.setLineSpacing(10);
        ticketsText.setFont(Font.font(15));
        ticketsText.setTextAlignment(TextAlignment.LEFT);
		
	this.setTop(hbox0);
        this.setCenter(gridpane);
        this.setLeft(vbox1);
        this.setRight(payment);
        this.setBottom(ticketsText);	
	}
    
    public void invalidTicketRightView(){

	String ticket  ="";
	String license="";
	String permit    ="";
	String state = "";
	String vehicle = "";
	String color = "";
	String violation = "";
	String date = "";
	String location = "";
	String time = "";
	String issued = "";
			
	this.getChildren().clear();
        imageIV.setFitHeight(50);
        imageIV.setFitWidth(50);
        HBox hbox0 = new HBox(imageIV, titleLabel);
        titleLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 30));

        payment.setText(paystring);
        payment.setTextAlignment(TextAlignment.LEFT);
        
        VBox vbox1= new VBox(getSubmit(), getPay(),getLeftDisplay(), getRightDisplay(), getExit());
                
        HBox hbox2= new HBox(ticketLabel, licenseLabel, stateLabel);
        HBox hbox4= new HBox( ticketTF, licenseTF, stateTF);
        hbox4.setSpacing(1);
        HBox hbox5= new HBox(dateLabel,permitLabel, timeLabel);
        HBox hbox6= new HBox(dateTF, permitTF, timeTF);
        hbox6.setSpacing(3);
        HBox hbox7= new HBox(locationLabel,colorLabel, issuedLabel );
        HBox hbox8= new HBox(locationTF,colorTF, issuedTF);
        HBox hbox9 =  new HBox(violationLabel, vehicleLabel);
        HBox hbox10 = new HBox(violationTF, vehicleTF);

        hbox2.setSpacing(90);
        hbox5.setSpacing(80);
        hbox7.setSpacing(120);
                hbox9.setSpacing(80);

        gridpane.add(hbox2, 1, 1);
       gridpane.add(hbox4,1, 2);
       gridpane.add(hbox5, 1, 3);
       gridpane.add(hbox6, 1, 4);
       gridpane.add(hbox7, 1, 5);
       gridpane.add(hbox8, 1, 6);
       gridpane.add(hbox9, 1, 7);
       gridpane.add(hbox10, 1, 8);
        
        hbox0.setAlignment(Pos.CENTER);
        
        ticketsText.setText("End of Results.\nPlease press '<<' to display the last ticket.");
        ticketsText.setTextAlignment(TextAlignment.CENTER);
       
        ticketsText.setLineSpacing(10);
        ticketsText.setFont(Font.font(15));
        ticketsText.setTextAlignment(TextAlignment.LEFT);
		
	this.setTop(hbox0);
        this.setCenter(gridpane);
        this.setLeft(vbox1);
        this.setRight(payment);
        this.setBottom(ticketsText);	
	}

    public void invalidPay(){
	
        String ticket  ="";
	String license="";
	String permit    ="";
	String state = "";
	String vehicle = "";
	String color = "";
	String violation = "";
	String date = "";
	String location = "";
	String time = "";
        String issued = "";
			
	this.getChildren().clear();
        imageIV.setFitHeight(50);
        imageIV.setFitWidth(50);
        HBox hbox0 = new HBox(imageIV, titleLabel);
        titleLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 30));

        payment.setText(paystring);
        payment.setTextAlignment(TextAlignment.LEFT);
        
        VBox vbox1= new VBox(getSubmit(), getPay(),getLeftDisplay(), getRightDisplay(), getExit());

        HBox hbox2= new HBox(ticketLabel, licenseLabel, stateLabel);
        HBox hbox4= new HBox( ticketTF, licenseTF, stateTF);
        hbox4.setSpacing(1);
        HBox hbox5= new HBox(dateLabel,permitLabel, timeLabel);
        HBox hbox6= new HBox(dateTF, permitTF, timeTF);
        hbox6.setSpacing(3);
        HBox hbox7= new HBox(locationLabel,colorLabel, issuedLabel );
        HBox hbox8= new HBox(locationTF,colorTF, issuedTF);
        HBox hbox9 =  new HBox(violationLabel, vehicleLabel);
        HBox hbox10 = new HBox(violationTF, vehicleTF);

        hbox2.setSpacing(90);
        hbox5.setSpacing(80);
        hbox7.setSpacing(120);
                hbox9.setSpacing(80);

       gridpane.add(hbox2, 1, 1);
       gridpane.add(hbox4,1, 2);
       gridpane.add(hbox5, 1, 3);
       gridpane.add(hbox6, 1, 4);
       gridpane.add(hbox7, 1, 5);
       gridpane.add(hbox8, 1, 6);
       gridpane.add(hbox9, 1, 7);
       gridpane.add(hbox10, 1, 8);
        
        hbox0.setAlignment(Pos.CENTER);
        ticketsText.setTextAlignment(TextAlignment.CENTER);
        
>>>>>>> 7a8aa16bfd237dc508332d516e5406ddb96a479d
        ticketsText.setText("Please press '<<' or '>>' to display a ticket to modify its paid status.");

        ticketsText.setLineSpacing(10);
        ticketsText.setFont(Font.font(15));
        ticketsText.setTextAlignment(TextAlignment.LEFT);
<<<<<<< HEAD

        this.setBottom(ticketsText);
    }

    public void invalidSubmit() {

        ticketsText.setTextAlignment(TextAlignment.CENTER);

=======
		
	this.setTop(hbox0);
        this.setCenter(gridpane);
        this.setLeft(vbox1);
        this.setRight(payment);
        this.setBottom(ticketsText);	
	}

    public void invalidSubmit(){
	
        String ticket  ="";
	String license="";
	String permit    ="";
	String state = "";
	String vehicle = "";
	String color = "";
	String violation = "";
	String date = "";
	String location = "";
	String time = "";
	String issued = "";
			
	this.getChildren().clear();
        imageIV.setFitHeight(50);
        imageIV.setFitWidth(50);
        HBox hbox0 = new HBox(imageIV, titleLabel);
        titleLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 30));

        payment.setText(paystring);
        payment.setTextAlignment(TextAlignment.LEFT);
        
        VBox vbox1= new VBox(getSubmit(), getPay(),getLeftDisplay(), getRightDisplay(), getExit());
               
        HBox hbox2= new HBox(ticketLabel, licenseLabel, stateLabel);
        HBox hbox4= new HBox( ticketTF, licenseTF, stateTF);
        hbox4.setSpacing(1);
        HBox hbox5= new HBox(dateLabel,permitLabel, timeLabel);
        HBox hbox6= new HBox(dateTF, permitTF, timeTF);
        hbox6.setSpacing(3);
        HBox hbox7= new HBox(locationLabel,colorLabel, issuedLabel );
        HBox hbox8= new HBox(locationTF,colorTF, issuedTF);
        HBox hbox9 =  new HBox(violationLabel, vehicleLabel);
        HBox hbox10 = new HBox(violationTF, vehicleTF);

        hbox2.setSpacing(90);
        hbox5.setSpacing(80);
        hbox7.setSpacing(120);
                hbox9.setSpacing(80);

       gridpane.add(hbox2, 1, 1);
       gridpane.add(hbox4,1, 2);
       gridpane.add(hbox5, 1, 3);
       gridpane.add(hbox6, 1, 4);
       gridpane.add(hbox7, 1, 5);
       gridpane.add(hbox8, 1, 6);
       gridpane.add(hbox9, 1, 7);
       gridpane.add(hbox10, 1, 8);
        
        hbox0.setAlignment(Pos.CENTER);
        ticketsText.setTextAlignment(TextAlignment.CENTER);
        
>>>>>>> 7a8aa16bfd237dc508332d516e5406ddb96a479d
        ticketsText.setText("Please enter a valid Ticket Number.");

        ticketsText.setLineSpacing(10);
        ticketsText.setFont(Font.font(15));
        ticketsText.setTextAlignment(TextAlignment.LEFT);
<<<<<<< HEAD

        this.setBottom(ticketsText);
    }

    public void key() {

        ticketsText.setTextAlignment(TextAlignment.CENTER);

        ticketsText.setText("Citation already in the system.");

        ticketsText.setLineSpacing(10);
        ticketsText.setFont(Font.font(15));
        ticketsText.setTextAlignment(TextAlignment.LEFT);

        this.setBottom(ticketsText);
    }

    public void clearFields() {
        ticketTF.clear();
        licenseTF.clear();
        permitTF.clear();
        stateTF.clear();
        vehicleTF.clear();
        colorTF.clear();
        violationTF.clear();
        dateTF.clear();
        locationTF.clear();
        timeTF.clear();
        issuedTF.clear();

    }

=======
		
	this.setTop(hbox0);
        this.setCenter(gridpane);
        this.setLeft(vbox1);
        this.setRight(payment);
        this.setBottom(ticketsText);	
	}
 
    public void clearFields()
	{
		ticketTF.clear();
		licenseTF.clear();
		permitTF.clear();
		stateTF.clear();
		vehicleTF.clear();
		colorTF.clear();
		violationTF.clear();
		dateTF.clear();
		locationTF.clear();
		timeTF.clear();
                issuedTF.clear();
		
	}
    
>>>>>>> 7a8aa16bfd237dc508332d516e5406ddb96a479d
    /**
     * @return the ticketLabel
     */
    public Label getTicketLabel() {
        return ticketLabel;
    }

    /**
     * @param ticketLabel the ticketLabel to set
     */
    public void setTicketLabel(Label ticketLabel) {
        this.ticketLabel = ticketLabel;
    }

    /**
     * @return the ticketTF
     */
    public TextField getTicketTF() {
        return ticketTF;
    }

    /**
     * @param ticketTF the ticketTF to set
     */
    public void setTicketTF(TextField ticketTF) {
        this.ticketTF = ticketTF;
    }

    /**
     * @return the licenseLabel
     */
    public Label getLicenseLabel() {
        return licenseLabel;
    }

    /**
     * @param licenseLabel the licenseLabel to set
     */
    public void setLicenseLabel(Label licenseLabel) {
        this.licenseLabel = licenseLabel;
    }

    /**
     * @return the licenseTF
     */
    public TextField getLicenseTF() {
        return licenseTF;
    }

    /**
     * @param licenseTF the licenseTF to set
     */
    public void setLicenseTF(TextField licenseTF) {
        this.licenseTF = licenseTF;
    }

    /**
     * @return the permitLabel
     */
    public Label getPermitLabel() {
        return permitLabel;
    }

    /**
     * @param permitLabel the permitLabel to set
     */
    public void setPermitLabel(Label permitLabel) {
        this.permitLabel = permitLabel;
    }

    /**
     * @return the permitTF
     */
    public TextField getPermitTF() {
        return permitTF;
    }

    /**
     * @param permitTF the permitTF to set
     */
    public void setPermitTF(TextField permitTF) {
        this.permitTF = permitTF;
    }

    /**
     * @return the stateLabel
     */
    public Label getStateLabel() {
        return stateLabel;
    }

    /**
     * @param stateLabel the stateLabel to set
     */
    public void setStateLabel(Label stateLabel) {
        this.stateLabel = stateLabel;
    }

    /**
     * @return the stateTF
     */
    public TextField getStateTF() {
        return stateTF;
    }

    /**
     * @param stateTF the stateTF to set
     */
    public void setStateTF(TextField stateTF) {
        this.stateTF = stateTF;
    }

    /**
     * @return the vehicleLabel
     */
    public Label getVehicleLabel() {
        return vehicleLabel;
    }

    /**
     * @param vehicleLabel the vehicleLabel to set
     */
    public void setVehicleLabel(Label vehicleLabel) {
        this.vehicleLabel = vehicleLabel;
    }

    /**
     * @return the vehicleTF
     */
    public TextField getVehicleTF() {
        return vehicleTF;
    }

    /**
     * @param vehicleTF the vehicleTF to set
     */
    public void setVehicleTF(TextField vehicleTF) {
        this.vehicleTF = vehicleTF;
    }

    /**
     * @return the colorLabel
     */
    public Label getColorLabel() {
        return colorLabel;
    }

    /**
     * @param colorLabel the colorLabel to set
     */
    public void setColorLabel(Label colorLabel) {
        this.colorLabel = colorLabel;
    }

    /**
     * @return the colorTF
     */
    public TextField getColorTF() {
        return colorTF;
    }

    /**
     * @param colorTF the colorTF to set
     */
    public void setColorTF(TextField colorTF) {
        this.colorTF = colorTF;
    }

    /**
     * @return the violationLabel
     */
    public Label getViolationLabel() {
        return violationLabel;
    }

    /**
     * @param violationLabel the violationLabel to set
     */
    public void setViolationLabel(Label violationLabel) {
        this.violationLabel = violationLabel;
    }

    /**
     * @return the violationTF
     */
    public TextField getViolationTF() {
        return violationTF;
    }

    /**
     * @param violationTF the violationTF to set
     */
    public void setViolationTF(TextField violationTF) {
        this.violationTF = violationTF;
    }

    /**
     * @return the dateLabel
     */
    public Label getDateLabel() {
        return dateLabel;
    }

    /**
     * @param dateLabel the dateLabel to set
     */
    public void setDateLabel(Label dateLabel) {
        this.dateLabel = dateLabel;
    }

    /**
     * @return the dateTF
     */
    public TextField getDateTF() {
        return dateTF;
    }

    /**
     * @param dateTF the dateTF to set
     */
    public void setDateTF(TextField dateTF) {
        this.dateTF = dateTF;
    }

    /**
     * @return the locationLabel
     */
    public Label getLocationLabel() {
        return locationLabel;
    }

    /**
     * @param locationLabel the locationLabel to set
     */
    public void setLocationLabel(Label locationLabel) {
        this.locationLabel = locationLabel;
    }

    /**
     * @return the locationTF
     */
    public TextField getLocationTF() {
        return locationTF;
    }

    /**
     * @param locationTF the locationTF to set
     */
    public void setLocationTF(TextField locationTF) {
        this.locationTF = locationTF;
    }

    /**
     * @return the timeLabel
     */
    public Label getTimeLabel() {
        return timeLabel;
    }

    /**
     * @param timeLabel the timeLabel to set
     */
    public void setTimeLabel(Label timeLabel) {
        this.timeLabel = timeLabel;
    }

    /**
     * @return the timeTF
     */
    public TextField getTimeTF() {
        return timeTF;
    }

    /**
     * @param timeTF the timeTF to set
     */
    public void setTimeTF(TextField timeTF) {
        this.timeTF = timeTF;
    }

    /**
     * @return the issuedLabel
     */
    public Label getIssuedLabel() {
        return issuedLabel;
    }

    /**
     * @param issuedLabel the issuedLabel to set
     */
    public void setIssuedLabel(Label issuedLabel) {
        this.issuedLabel = issuedLabel;
    }

    /**
     * @return the issuedTF
     */
    public TextField getIssuedTF() {
        return issuedTF;
    }

    /**
     * @param issuedTF the issuedTF to set
     */
    public void setIssuedTF(TextField issuedTF) {
        this.issuedTF = issuedTF;
    }

    /**
     * @return the pay
     */
    public Button getPay() {
        return pay;
    }

    /**
     * @param pay the pay to set
     */
    public void setPay(Button pay) {
        this.pay = pay;
    }

    /**
     * @return the submit
     */
    public Button getSubmit() {
        return submit;
    }

    /**
     * @param submit the submit to set
     */
    public void setSubmit(Button submit) {
        this.submit = submit;
    }

    /**
     * @return the left
     */
    public Button getLeftDisplay() {
        return left;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(Button left) {
        this.left = left;
    }

    /**
     * @return the right
     */
    public Button getRightDisplay() {
        return right;
    }

    /**
     * @param right the right to set
     */
    public void setRight(Button right) {
        this.right = right;
    }

    /**
     * @return the exit
     */
    public Button getExit() {
        return exit;
    }

    /**
     * @param exit the exit to set
     */
    public void setExit(Button exit) {
        this.exit = exit;
    }
}
