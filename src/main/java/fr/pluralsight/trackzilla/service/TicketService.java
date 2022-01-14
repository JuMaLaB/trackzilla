package fr.pluralsight.trackzilla.service;

import java.util.List;
import fr.pluralsight.trackzilla.entity.Ticket;

public interface TicketService {
  List<Ticket> listTickets();
}
