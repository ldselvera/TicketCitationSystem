/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ticket;

import java.util.ArrayList;

/**
 *
 * @author Selvera
 */
public class TicketModel {
    private ArrayList<Ticket> ticketDB = new ArrayList<>();
	private Ticket currentTicket = new Ticket();

    /**
     * @return the mailDB
     */
    public ArrayList<Ticket> getTicketDB() {
        return ticketDB;
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
