package fr.pluralsight.trackzilla.service;

import fr.pluralsight.trackzilla.entity.Ticket;
import fr.pluralsight.trackzilla.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {
  @Autowired
  private TicketRepository ticketRepository;

  @Override
  public List<Ticket> listTickets() {
    return (List<Ticket>) ticketRepository.findAll();
  }

}
