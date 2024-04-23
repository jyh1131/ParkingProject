package car.calculate.service;

import java.util.ArrayList;

import car.calculate.dto.CalculateDTO;

public interface CalculateService {
	public ArrayList<CalculateDTO> calculateSearchById(String user_id);
	public void calculateUpdate(ArrayList<CalculateDTO> arrayList);
}
