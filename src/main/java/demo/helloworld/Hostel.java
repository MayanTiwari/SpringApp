package demo.helloworld;

public class Hostel {

	private String hostelName;

	@Override
	public String toString() {
		return "Hostel [hostelName=" + hostelName + "]";
	}

	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
}
