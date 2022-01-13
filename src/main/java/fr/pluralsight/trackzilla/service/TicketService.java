package fr.pluralsight.trackzilla.service;

import fr.pluralsight.trackzilla.entity.Ticket;

public interface TicketService {
  Iterable<Ticket> listTickets();
}
