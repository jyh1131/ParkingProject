package car.ticket.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import car.ticket.control.Controller;
import car.ticket.dao.TicketDAO;
import car.ticket.dto.TicketDTO;
import car.ticket.handler.TicketHandlerAdapter;

public class TicketListTimeController implements Controller {
	private static Log log = LogFactory.getLog(TicketListTimeController.class);
	@Override
	public TicketHandlerAdapter execute(HttpServletRequest request, HttpServletResponse response) {
	    TicketDAO ticketDAO = new TicketDAO();
	    ArrayList<TicketDTO> arrayList = ticketDAO.ticketlisttime(); 
	    request.setAttribute("arrayList", arrayList); 
	    
	    TicketHandlerAdapter ticketHandlerAdapter = new TicketHandlerAdapter();
	    log.info("정기권 목록 조회");
	    ticketHandlerAdapter.setPath("/WEB-INF/ticket/ticket_purchase_listtime.jsp");
	    return ticketHandlerAdapter;
	}

}
