package fr.pluralsight.trackzilla.repository;

import fr.pluralsight.trackzilla.entity.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
