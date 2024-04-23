package car.ticket.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import car.ticket.handler.TicketHandlerAdapter;

public interface Controller {
	public TicketHandlerAdapter execute(HttpServletRequest request, HttpServletResponse response);
}
