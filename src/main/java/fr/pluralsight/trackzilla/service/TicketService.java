package fr.pluralsight.trackzilla.service;

import fr.pluralsight.trackzilla.entity.Ticket;

import java.util.List;

public interface TicketService {
  List<Ticket> listTickets();
}
