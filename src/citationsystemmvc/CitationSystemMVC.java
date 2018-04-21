/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citationsystemmvc;

import Ticket.TicketController;
import Ticket.TicketModel;
import Ticket.TicketView;
import java.io.IOException;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Selvera
 */
public class CitationSystemMVC extends Application {

    @Override
    public void start(Stage primaryStage) throws SQLException, IOException {
        TicketView ticketview = new TicketView();
        TicketModel ticketmodel = new TicketModel();
        TicketController tc = new TicketController(ticketmodel, ticketview);

        Scene scene = new Scene(ticketview, 1000, 550);

        primaryStage.setTitle("Ticket Citation System");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
