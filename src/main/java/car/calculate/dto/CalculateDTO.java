package car.calculate.dto;

import java.util.Date;

public class CalculateDTO {
	private int calculate_code;
	private String calculate_date;
	private String calculate_amount;
	private String calculate_status;
	private int parking_code;
	private int records_code;
	private String parking_base_fee;
	private String parking_hourly_fee;
	private String records_start;
	private String records_end;
	private int user_code;
	private String user_id;
	public int getCalculate_code() {
		return calculate_code;
	}
	public void setCalculate_code(int calculate_code) {
		this.calculate_code = calculate_code;
	}
	public String getCalculate_date() {
		return calculate_date;
	}
	public void setCalculate_date(String calculate_date) {
		this.calculate_date = calculate_date;
	}
	public String getCalculate_amount() {
		return calculate_amount;
	}
	public void setCalculate_amount(String calculate_amount) {
		this.calculate_amount = calculate_amount;
	}
	public String getCalculate_status() {
		return calculate_status;
	}
	public void setCalculate_status(String calculate_status) {
	    this.calculate_status = calculate_status;
	}
	public int getParking_code() {
		return parking_code;
	}
	public void setParking_code(int parking_code) {
		this.parking_code = parking_code;
	}
	public int getRecords_code() {
		return records_code;
	}
	public void setRecords_code(int records_code) {
		this.records_code = records_code;
	}
	public String getParking_base_fee() {
		return parking_base_fee;
	}
	public void setParking_base_fee(String parking_base_fee) {
		this.parking_base_fee = parking_base_fee;
	}
	public String getParking_hourly_fee() {
		return parking_hourly_fee;
	}
	public void setParking_hourly_fee(String parking_hourly_fee) {
		this.parking_hourly_fee = parking_hourly_fee;
	}
	public String getRecords_start() {
		return records_start;
	}
	public void setRecords_start(String records_start) {
		this.records_start = records_start;
	}
	public String getRecords_end() {
		return records_end;
	}
	public void setRecords_end(String records_end) {
		this.records_end = records_end;
	}
	
	public int getUser_code() {
		return user_code;
	}
	public void setUser_code(int user_code) {
		this.user_code = user_code;
	}
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "CalculateDTO [calculate_code=" + calculate_code + ", calculate_date=" + calculate_date
				+ ", calculate_amount=" + calculate_amount + ", calculate_status=" + calculate_status
				+ ", parking_code=" + parking_code + ", records_code=" + records_code + ", parking_base_fee="
				+ parking_base_fee + ", parking_hourly_fee=" + parking_hourly_fee + ", records_start=" + records_start
				+ ", records_end=" + records_end + ", user_code=" + user_code + ", user_id=" + user_id + "]";
	}
	
	
	
	
}
