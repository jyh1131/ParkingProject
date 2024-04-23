package car.ticket.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import car.ticket.control.Controller;
import car.ticket.dao.TicketDAO;
import car.ticket.dto.TicketDTO;
import car.ticket.handler.TicketHandlerAdapter;

public class TicketDetailSearchController implements Controller {
	private static Log log = LogFactory.getLog(TicketDetailSearchController.class);
	@Override
	public TicketHandlerAdapter execute(HttpServletRequest request, HttpServletResponse response) {
		int ticket_code = Integer.parseInt(request.getParameter("ticket_code"));
		log.info("코드번호" + ticket_code);
		TicketDAO ticketDAO = new TicketDAO();
		TicketDTO ticketDTO = new TicketDTO();
		ticketDTO = ticketDAO.ticketDetailSearch(ticket_code);
		log.info(ticketDTO);
		request.setAttribute("ticketDTO", ticketDTO);
		TicketHandlerAdapter ticketHandlerAdapter = new TicketHandlerAdapter();
		log.info("내 정기권 조회");
		ticketHandlerAdapter.setPath("/WEB-INF/ticket/ticket_search_detail.jsp");
		return ticketHandlerAdapter;
	}

}
