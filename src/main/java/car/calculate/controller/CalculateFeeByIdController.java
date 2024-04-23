package car.calculate.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import car.calculate.dao.CalculateDAO;
import car.ticket.control.Controller;
import car.ticket.handler.TicketHandlerAdapter;

public class CalculateFeeByIdController implements Controller {
	private static Log log = LogFactory.getLog(CalculateFeeByIdController.class);
	@Override
    public TicketHandlerAdapter execute(HttpServletRequest request, HttpServletResponse response) {
        String user_id = request.getParameter("user_id");
		
		CalculateDAO calculateDAO = new CalculateDAO();
        ArrayList<car.calculate.dto.CalculateDTO> arrayList = calculateDAO.calculateSearchById(user_id);

        for (car.calculate.dto.CalculateDTO calculateDTO : arrayList) {
            String start = calculateDTO.getRecords_start();
            String end = calculateDTO.getRecords_end();

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                Date startDate = dateFormat.parse(start);
                Date endDate = dateFormat.parse(end);

                long elapsedTimeMillis = endDate.getTime() - startDate.getTime();
                long elapsedTimeMinutes = elapsedTimeMillis / (60 * 1000);

                double parkingFee = 0.0;
                if (elapsedTimeMinutes <= 60) {
                    parkingFee = Double.parseDouble(calculateDTO.getParking_base_fee());
                } else {
                    parkingFee = Double.parseDouble(calculateDTO.getParking_hourly_fee()) * (Math.ceil((double) elapsedTimeMinutes / 60));
                }

                calculateDTO.setCalculate_amount(String.valueOf(parkingFee));

                
                Date currentDate = new Date();
                SimpleDateFormat currentDateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String currentDateStr = currentDateformat.format(currentDate);
                calculateDTO.setCalculate_date(currentDateStr);
            } catch (Exception e) {
                log.error("정산 로직 오류: " + e.getMessage());
            }
        }

        request.setAttribute("arrayList", arrayList);
        calculateDAO.calculateUpdate(arrayList);

        log.info("데이터 전달 확인 - " + arrayList);
        
        TicketHandlerAdapter handlerAdapter = new TicketHandlerAdapter();
        handlerAdapter.setPath("/WEB-INF/calculate/calculate_search_id.jsp");
        return handlerAdapter;
    }

}
