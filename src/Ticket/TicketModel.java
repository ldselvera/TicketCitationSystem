/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ticket;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Selvera
 */
public class TicketModel {
    private ArrayList<Ticket> ticketDB = new ArrayList<>();
	private Ticket currentTicket = new Ticket();
        File file = new File("tickets.dat");
    /**
     * @return the mailDB
     */
    public ArrayList<Ticket> getTicketDB() {
        return ticketDB;
    }

    public void readFile() throws IOException{
    
    if (file.exists()) {
          BufferedWriter bw = null;
         bw = new BufferedWriter(new FileWriter("tickets.dat", true));
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                String ticket= input.next();
                String license= input.next();
                String permit= input.next();
                String state= input.next();
                String vehicle = input.next();
                String color= input.next();
                String violation= input.next();
                String date= input.next();
                String location= input.next();
                String time= input.next();
                String issued = input.next();
                String paid = input.next();
                
                Ticket currentTicket = new Ticket(ticket,license,permit,state, vehicle, color, violation,date, location, time, issued,paid);
                ticketDB.add(currentTicket);
            }
            // Close the file
        }
    
    }
    }
    
    public void writeFile(int i) throws IOException{
        if (file.exists()) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("tickets.dat", true))) {
                Scanner input= new Scanner(file);
                
                bw.write(ticketDB.get(i).getTicket());
                bw.write(" ");
                bw.write(ticketDB.get(i).getLicense());
                bw.write(" ");
                bw.write(ticketDB.get(i).getPermit());
                bw.write(" ");
                bw.write(ticketDB.get(i).getState());
                bw.write(" ");
                bw.write(ticketDB.get(i).getVehicle());
                bw.write(" ");
                bw.write(ticketDB.get(i).getColor());
                bw.write(" ");
                bw.write(ticketDB.get(i).getViolation());
                bw.write(" ");
                bw.write(ticketDB.get(i).getDate());
                bw.write(" ");
                bw.write(ticketDB.get(i).getLocation());
                bw.write(" ");
                bw.write(ticketDB.get(i).getTime());
                bw.write(" ");
                bw.write(ticketDB.get(i).getIssued());
                bw.write(" ");
                bw.write("Unpaid");
                bw.newLine();
                bw.flush();
            }
    }
        else{
         PrintWriter output = new PrintWriter(file);
         
         output.write(ticketDB.get(i).getTicket());
         output.write(" ");
	 output.write(ticketDB.get(i).getLicense());
         output.write(" ");
	 output.write(ticketDB.get(i).getPermit());
         output.write(" ");
         output.write(ticketDB.get(i).getState());
	 output.write(" ");
         output.write(ticketDB.get(i).getVehicle());
	 output.write(" ");
         output.write(ticketDB.get(i).getColor());
         output.write(" ");
         output.write(ticketDB.get(i).getViolation());
         output.write(" ");
         output.write(ticketDB.get(i).getDate());
         output.write(" ");
         output.write(ticketDB.get(i).getLocation());
         output.write(" ");
         output.write(ticketDB.get(i).getTime());
         output.write(" ");
         output.write(ticketDB.get(i).getIssued());
         output.write(" ");
         output.write("Unpaid");
         output.println();
         output.flush();
	 output.close();
                 
        }
        }
    
    /**
     * @param mailDB the mailDB to set
     */
    public void setTicketDB(ArrayList<Ticket> mailDB) {
        this.ticketDB = ticketDB;
    }

    /**
     * @return the currentTicket
     */
    public Ticket getCurrentTicket() {
        return currentTicket;
    }

    /**
     * @param currentTicket the currentTicket to set
     */
    public void setCurrentTicket(Ticket currentTicket) {
        this.currentTicket = currentTicket;
        ticketDB.add(currentTicket);
    }
        
        
}
