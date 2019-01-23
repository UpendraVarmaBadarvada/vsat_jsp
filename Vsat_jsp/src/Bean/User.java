package Bean;

public class User {
	
	private int data_sent,zip_code;
	private String Calling_address,Called_address,
			Start_date,End_date,state,city,street_name;
	public int getData_sent() {
		return data_sent;
	}
	public void setData_sent(int data_sent) {
		this.data_sent = data_sent;
	}
	public int getZip_code() {
		return zip_code;
	}
	public void setZip_code(int zip_code) {
		this.zip_code = zip_code;
	}
	public String getCalling_address() {
		return Calling_address;
	}
	public void setCalling_address(String calling_address) {
		Calling_address = calling_address;
	}
	public String getCalled_address() {
		return Called_address;
	}
	public void setCalled_address(String called_address) {
		Called_address = called_address;
	}
	public String getStart_date() {
		return Start_date;
	}
	public void setStart_date(String start_date) {
		Start_date = start_date;
	}
	public String getEnd_date() {
		return End_date;
	}
	public void setEnd_date(String end_date) {
		End_date = end_date;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet_name() {
		return street_name;
	}
	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	} 

}
